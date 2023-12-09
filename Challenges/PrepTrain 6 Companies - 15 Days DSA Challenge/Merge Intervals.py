from os import *
from sys import *
from collections import *
from math import *

from sys import stdin, setrecursionlimit


class Solution:
    def __init__(self, start, end):
        self.start = start
        self.end = end


def isOverlap(minS, maxE, i):

    if (minS > i.end or maxE < i.start):
        return False

    return True


def mergeIntervals(intervals):
    # Write your code here.
    def mergeIntervals(intervals):
        n = len(intervals)
        result = []
        visited = [False for i in range(n)]

        for i in range(n):
            if visited[i] is True:
                continue

            visited[i] = True
            min_start = intervals[i].start
            max_end = intervals[i].end

            while True:
                count = 0

                for j in range(n):
                    if visited[j] is False and isOverlap(min_start, max_end, intervals[j]):
                        visited[j] = True
                        min_start = min(min_start, intervals[j].start)
                        max_end = max(max_end, intervals[j].end)
                        count += 1

                if count == 0:
                    break

            merged_interval = Solution(min_start, max_end)
            result.append(merged_interval)

        return result


n = int(input())
arr1 = list(map(int, stdin.readline().strip().split(" ")))
arr2 = list(map(int, stdin.readline().strip().split(" ")))
arr1.sort()
arr2.sort()
intervals = []
for i in range(n):
    a = Solution(arr1[i], arr2[i])
    intervals.append(a)

res = mergeIntervals(intervals)

for i in range(len(res)):
    print(res[i].start, res[i].end)
