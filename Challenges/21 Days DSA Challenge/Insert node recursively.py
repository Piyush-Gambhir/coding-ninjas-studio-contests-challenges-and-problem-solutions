'''
Following is the class structure of Node Class

class Node:
    def __init__(data):
        self.data = data
        self.next = None
'''


def InsertNode(head, pos, newNode):
    if pos == 0:
        newNode.next = head
        return newNode

    if head is None:
        return None

    head.next = InsertNode(head.next, pos - 1, newNode)
    return head
