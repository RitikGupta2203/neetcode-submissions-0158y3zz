class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        res = []
        for i in s:
            res.append(i)
        
        for i in t:
            if i not in res:
                return False
            res.remove(i)


        if not res:
            return  True 

        else:
            return False             