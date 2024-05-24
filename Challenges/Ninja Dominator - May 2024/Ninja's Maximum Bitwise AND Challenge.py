"""
Problem statement
Once upon a time, there was a group of ‘N’ Ninjas who loved to play games together. They had an array ‘A’ of ‘N’ non-negative integers, representing the scores they had achieved in various games. They were a competitive bunch and wanted to find a way to increase their total score as much as possible.

One day, they learned about a new game that allowed them to perform a special operation on their scores. The operation involved selecting any integer ‘A[i]’ from the array and replacing it with a new value obtained by performing a bitwise OR operation with ‘2^X’, where ‘X’ is a non-negative integer between 0 and 30.

Excited about this new opportunity, the friends started wondering how to use this operation to maximize their total score. They decided they could perform this operation at most ‘K’ times on their array ‘A’.

Their goal was to find the maximum possible value of the bitwise AND operation between all the scores in array ‘A’ after performing at most ‘K’ operations. In other words, they wanted to find the highest possible score they could achieve together.

Can you help them achieve their goal? Print the highest possible score.

Example :
Input: ‘N’ = 3, ‘K’ = 2, ‘A’ = [2, 1, 1]
Output: 2

For this test case, we can set bit 1 of the last two array elements using 2 operations. The updated array will be [2, 3, 3] the AND of all array elements will be 2. It can be proved that this is the maximum AND value we can obtain.
"""

from typing import *


def maxScore(n: int, k: int, a: List[int]) -> int:
    # write your code here
    pass