class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        #asked: find anagrams 
        #return list of list group according to the anagrams
        # input: string list

        #sort each string
        res = {}
        for i in strs:
            string = "".join(sorted(i))
             #check in dictionary if that string exist if yes, add it to that key   
            if string in res.keys():
                res[string].append(i)
                
            else:
                # else create a new key
                 res[string] = [i]

        # covert the dictionary into list and return
        return list(res.values())