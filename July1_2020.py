## Arranging coins - n*(n+1)/2## 

class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        i=1
        while i <= sys.maxint:
            if i*(i+1) > (2*n):
                return i-1
            i+=1
        
        return i
        
