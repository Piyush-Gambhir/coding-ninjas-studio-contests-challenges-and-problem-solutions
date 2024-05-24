

"""
Problem statement
Ninja has two friends Alice and bob, both of them provide you an array ‘A’ and ‘B’, each of size ‘N’. Here the friendship level between Alice and Bob is equal to the number of indices ‘i’ such that ‘A[i] + B[i] = 0’.

Being a friend of Alice and bob, the ninja’s happiness is directly proportional to the friendship level of Alice and bob. To increase the ninja’s happiness, you can multiply the utmost ‘K’ elements of array ‘A’ by some fixed real number ‘X’, which you decide in the beginning.

In the end, you need to return the maximum level of friendship between Alice and bob possible.

Example:

Let's say, 'N'=3, 'K'=2, 'A'=[1, 2, 3], 'B'=[2, 4, 7]

Select 'X'=-2, and multiply 'A[0]' and 'A[1]' by 'X', A=[-2, -4, 3]
Then there are two indices, ‘1’ and ‘2’, where the sum of ‘A[1] + B[1] = 0’ and ‘A[2] + B[2] = 0’.
So, the answer is 2.
"""
from collections import defaultdict


def maxLevel(k: int, a: list, b: list) -> int:
    n = len(a)
    initial_level = sum(1 for i in range(n) if a[i] + b[i] == 0)

    if k == 0:
        return initial_level

    potential_x = defaultdict(list)

    for i in range(n):
        if a[i] != 0:
            x = -b[i] / a[i]
            potential_x[x].append(i)

    max_friendship = initial_level

    for x, indices in potential_x.items():
        modified_a = a[:]
        new_level = 0

        for i in indices[:k]:
            if modified_a[i] * x + b[i] == 0:
                new_level += 1

        max_friendship = max(max_friendship, initial_level + new_level)

    return max_friendship
