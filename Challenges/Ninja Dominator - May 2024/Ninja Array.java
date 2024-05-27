/*
Problem statement
Ninja has recently studied operators ‘AND’ and ‘XOR’. He managed to prepare a puzzle with these operators but is unable to solve it now. He asks for your help to solve the below problem.

You are given integers ‘N’ and ‘K’. You create an array ‘A’ of size ‘N’ where each integer is less than ‘2^K’. An array is called ‘Ninja Array’ if :

A[1] & A[2] & … & A[N] >= A[1] ^ A[2] ^ … ^ A[N] ,

where ‘&’ denotes the bitwise AND operator and ‘^’ denotes the bitwise XOR operator.

Return the total number of Ninja Arrays possible. Since the answer may be very large, compute it modulo 10^9+7.

Example :
N = 2
K = 1

Explanation : 

All the possible arrays are : [ 0, 0], [ 0, 1], [ 1, 0], [ 1, 1].

Out of these the valid Ninja arrays are : 
[ 0, 0] :
AND = 0
XOR = 0
AND >= XOR.

[ 1, 1] : 
AND = 1
XOR = 0
AND >= XOR.

So, final result = 2.
 */

import java.util.*;

public class Solution {

    public static int ninjaArray(int n, int k) {

        int mod = 1000000007;

        if (k == 0) {
            return 1;
        }

        ArrayList<Long> dp = new ArrayList<>();

        for (int bit = 0; bit < k; bit++) {
            if (bit == 0) {
                long ways = (n % 2 == 0) ? power(2, n - 1, mod) % mod : (1 + power(2, n - 1, mod)) % mod;
                dp.add(bit, ways);
                continue;
            }

            long ways = 0;
            if (n % 2 == 0) {
                ways += power(2, bit * n, mod);
                long temp = ((power(2, n - 1, mod) - 1 + mod) % mod * dp.get(bit - 1)) % mod;
                ways = (ways + temp) % mod;
            } else {
                ways += dp.get(bit - 1);
                long temp = (power(2, n - 1, mod) * dp.get(bit - 1)) % mod;
                ways = (ways + temp) % mod;
            }
            dp.add(bit, ways);
        }

        return dp.get(k - 1).intValue();
    }

    public static long power(long a, long b, int m) {
        if (b == 0)
            return 1;
        long x = power(a, b / 2, m);
        x = (x * x) % m;
        if (b % 2 == 1) {
            x = (x * a) % m;
        }
        return x;
    }
}
