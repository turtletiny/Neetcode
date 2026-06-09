class Solution:
    def longestMonotonicSubarray(self, nums: list[int]) -> int:
        ans = 1
        current = 1

        # nums2 = nums + [0]
        # for i in range(len(nums2)-1):
        #     if nums2[i+1]>nums2[i]:
        #         current += 1
        #     else:
        #         if current > ans:
        #             ans = current
        #         current = 1

        for i in range(1,len(nums)):
            if nums[i-1]>nums[i]:
                current += 1
            if current > ans:
                ans = current
            else:
                current = 1
            
        return ans
            


solution = Solution()
print(solution.longestMonotonicSubarray([1,4,3,3,2,2,3,4,5,9,6,5,4,3,2,1]))


