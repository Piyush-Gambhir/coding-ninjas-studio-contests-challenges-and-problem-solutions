from math import *
from collections import *
from sys import *
from os import *

# Read input as specified in the question.
# Print output as specified in the question.


def fib(n):
    dp = [-1] * (n + 1)
    MOD = 1000000007
    dp[0] = 0 % MOD
    dp[1] = 1 % MOD
    for i in range(2, n + 1):
        dp[i] = dp[i - 1] + dp[i - 2] % MOD
    return dp[n]


n = int(input())
print(fib(n))
