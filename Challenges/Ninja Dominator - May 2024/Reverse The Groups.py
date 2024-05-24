"""
Problem statement
You are given a stack 'S', of size 'N' consisting of integers only. You are also given an integer 'K'. You are supposed to reverse each group of size 'K' in the stack.

Start making the group of size 'K' from the top of the stack and then reverse this group. Repeat this process and if there are fewer than 'K' integers in the last group, leave the group as it is.

Print the stack after reversing each group of size 'K'.

Example :
'S' = {1, 2, 3, 4, 5, 6}, 'K' = 2.

The leftmost element (i.e. 1) is the bottommost element of the stack, and the rightmost element (i.e. 6) is the topmost element of the stack.

Group 1 : {5, 6}.
Group 2 : {3, 4}.
Group 3 : {1, 2}.

After reversing the groups :

Group 1 : {6, 5}.
Group 2 : {4, 3}.
Group 3 : {2, 1}.

So, the stack now looks like , 'S' : {2, 1, 4, 3, 6, 5}.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N, K <= 10^5
1 <= S[i] <= 10^5

The Sum of 'N' over all test cases is <= 10^5.

Time Limit: 1 sec
Sample Input 1 :
2
4 4
2 4 6 8
8 3
1 3 5 7 9 11 13 15
Sample Output 1 :
8 6 4 2
1 3 9 7 5 15 13 11
Explanation Of Sample Input 1 :
For test 1:

There is only one group of size 4 which is {2, 4, 6, 8}.
After reversing the group, it becomes {8, 6, 4, 2}.
The final stack is : {8, 6, 4, 2}.

For test 2:

There are two groups of size 3 and one group of size < 3.
Group 1 : {11, 13, 15}.
Group 2 : {5, 7, 9}.
Group 3 : {1, 3}.

After reversing the groups:
Group 1 : {15, 13, 11}.
Group 2 : {9, 7, 5}.
Group 3 : {1, 3}. This group is not reversed as its size is < 'K'.

The final stack is : {1, 3, 9, 7, 5, 15, 13, 11}.    
Sample Input 2 :
2
3 1
9 7 8
4 3
1 7 6 5
Sample Output 2 :
9 7 8
1 5 6 7
"""

from os import *
from sys import *
from collections import *
from math import *

from typing import *

# The input stack is in the form of list where the topmost element is at the end.
def reverseTheGroups(s: List[int], n: int, k: int) -> List[int]:
	# Write your code here.
	pass