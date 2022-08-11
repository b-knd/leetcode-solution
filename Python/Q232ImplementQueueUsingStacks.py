# @b-knd (jingru) on 11 August 2022 09:46:00

class MyQueue:

    def __init__(self):
        self.s1 = []
        self.s2 = []

    def push(self, x: int) -> None:
        while len(self.s1):
            self.s2.append(self.s1.pop())
        self.s1.append(x)
        while len(self.s2):
            self.s1.append(self.s2.pop())

    def pop(self) -> int:
        return self.s1.pop()

    def peek(self) -> int:
        return self.s1[len(self.s1)-1]

    def empty(self) -> bool:
        return len(self.s1) == 0

#Runtime: 48 ms, faster than 47.37% of Python3 online submissions for Implement Queue using Stacks.
#Memory Usage: 14 MB, less than 75.81% of Python3 online submissions for Implement Queue using Stacks.

# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()

