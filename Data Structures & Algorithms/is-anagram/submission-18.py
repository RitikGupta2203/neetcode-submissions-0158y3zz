class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False

        count= {}
        #store the elements and its count in dictionary
        for ch in s:
            count[ch] = count.get(ch, 0) + 1

        #compare elements of t with dicitionary
        for ch in t:
            if ch not in count:
                return False

            count[ch] -= 1

            # if a element in dictionary becomes 0 remove it
            if count[ch] == 0:
                del count[ch]

        return len(count) == 0