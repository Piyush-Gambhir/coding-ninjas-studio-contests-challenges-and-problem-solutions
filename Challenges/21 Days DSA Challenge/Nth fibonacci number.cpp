#include <iostream>
#include <vector>

const long long MOD = 1000000007;

std::vector<std::vector<long long>> multiply(const std::vector<std::vector<long long>> &A, const std::vector<std::vector<long long>> &B)
{
    int size = A.size();
    std::vector<std::vector<long long>> result(size, std::vector<long long>(size, 0));

    for (int i = 0; i < size; ++i)
    {
        for (int j = 0; j < size; ++j)
        {
            for (int k = 0; k < size; ++k)
            {
                result[i][j] = (result[i][j] + (A[i][k] * B[k][j]) % MOD) % MOD;
            }
        }
    }

    return result;
}

std::vector<std::vector<long long>> power(const std::vector<std::vector<long long>> &base, long long exponent)
{
    int size = base.size();
    if (exponent == 1)
    {
        return base;
    }

    if (exponent % 2 == 0)
    {
        std::vector<std::vector<long long>> half_pow = power(base, exponent / 2);
        return multiply(half_pow, half_pow);
    }
    else
    {
        return multiply(base, power(base, exponent - 1));
    }
}

long long solve(long long N)
{
    if (N <= 2)
    {
        return 1;
    }

    std::vector<std::vector<long long>> base = {{1, 1}, {1, 0}};

    std::vector<std::vector<long long>> result = power(base, N - 2);

    return (result[0][0] + result[0][1]) % MOD;
}