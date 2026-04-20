# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    '''
    Steps 1: check if empty root return 0
    2. declare a dequeue and intial value as root , depth, sizeQueue
    3. run the loop till queue is not empty
        3.1 find the length of the queue
        3.2 run the loop till i!= length of queue
            3.2.1 pop the leftmost element
            3.2.2 for that node check the left and right element, if present add it to queue
        3.3 update the depth 
    
    4. return depth;
    '''
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0

        queue = deque([root])

        depth = 0
        sizeQueue =0 
        
        while queue:
            sizeQueue = len(queue)

            for i in range(sizeQueue):
                node = queue.popleft()
                
                if node.left:
                    queue.append(node.left)
                
                if node.right:
                    queue.append(node.right)
                    
            depth +=1
        return depth


        