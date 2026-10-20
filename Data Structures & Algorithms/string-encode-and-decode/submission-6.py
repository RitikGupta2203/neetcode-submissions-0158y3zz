class Solution:

    def encode(self, strs: List[str]) -> str:
        res =''
        for i in strs:
            res = res+i+"\x00"

        return res

        #hello#world

    def decode(self, s: str) -> List[str]:
        res = []
        con = ''
        for i in s:
            if i !='\x00':
                con = con + i

            else:
                res.append(con)
                con =''
        return res
            

        
