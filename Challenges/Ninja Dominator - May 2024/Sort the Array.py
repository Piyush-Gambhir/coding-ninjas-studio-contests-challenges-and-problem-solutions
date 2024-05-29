"""
Problem statement
Ninja is given an array ‘A’ of length ‘N’ consisting of positive integers. He can do an operation as many times as he wants. In one operation, he can select an integer ‘x’ and count all the occurrences of ‘x’ in the array ‘A’ and remove them. Then he will add all the removed integer ‘x’ either in the front or at the end of the array ‘A’. He wants to sort the array in non-decreasing order using the minimum number of operations.

For example:

Let’s say ‘A’ = [2, 1, 1, 2, 3, 1, 4, 3]. If we select ‘x’ = 1 and add all the ‘1’ in front then the updated array ‘A’ = [1, 1, 1, 2, 2, 3, 4, 3]. If we select ‘x’ = 4 and add all the ‘4’ in end then the updated array ‘A’ = [1, 1, 1, 2, 2, 3, 3, 4]. Hence the array become sorted in two operations.
"""

from os import *
from sys import *
from collections import *
from math import *

from typing import *


def sortArray(N: int, A: List[int]) -> int:
    # Write your code here.
    
    
