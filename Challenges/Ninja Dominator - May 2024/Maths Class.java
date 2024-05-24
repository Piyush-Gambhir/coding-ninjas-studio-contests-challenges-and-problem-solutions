
/*
Problem statement
Ninja is given an array ‘A’ of size ‘N’ by his maths teacher, where each element of the array represents the favourite number of the ‘ith’ student. Ninja has recently studied about factors in his maths class. So his maths teacher has given him an assignment where he need to check whether he can sort the given array ‘A’ in non - decreasing order or not by performing following operation any number of times. He can swap any two elements if they have any common factor greater than 1. Return 1 if it can be sorted, else return 0.

For example:

Let’s say N = ‘3’ and A[] = {7, 21, 3}.
We can sort {7, 21, 3} by performing the following moves.
Swap ‘7’ and ‘21’ because they have ‘7’ as the common factor, A[] = {21, 7, 3}
Swap ‘21’ and ‘3’ because they have ‘3’ as the common factor, A[] = {3, 7, 21}
Hence array ‘A’ can be sorted in non-decreasing order. So return 1.
*/
Mod DistantMod Distant