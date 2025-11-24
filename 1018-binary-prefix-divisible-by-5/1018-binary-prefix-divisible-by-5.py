class Solution(object):
    def prefixesDivBy5(self, nums):
        """
        :type nums: List[int]
        :rtype: List[bool]
        """
        answer = []
        num = 0       
        for bit in nums:
            # new_num=num shifted left by 1 bit+b ----b is next bit, In decimal, shifting left by 1 bit is the same as multiplying by 2
            num = (num*2+bit) % 5 
            if num == 0:
                answer.append(True)
            else:
                answer.append(False)
            ####OR answer.append(num == 0)

        return answer

      
        