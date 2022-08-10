# @b-knd (jingru) on 10 August 2022 09:46:00

class MyStack:

    def __init__(self):
        self.queue = collections.deque()

    def push(self, x: int) -> None:
        q = self.queue
        q.append(x)
        
        for i in range(len(q)-1):
            q.append(q.popleft())

    def pop(self) -> int:
        return self.queue.popleft()

    def top(self) -> int:
        return self.queue[0]

    def empty(self) -> bool:
        return not len(self.queue)


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()


#Runtime: 41 ms, faster than 67.39% of Python3 online submissions for Implement Stack using Queues.
#Memory Usage: 13.9 MB, less than 75.04% of Python3 online submissions for Implement Stack using Queues.
