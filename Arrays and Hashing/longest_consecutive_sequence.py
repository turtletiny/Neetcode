class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        nums.sort()
        nums.append(0)
        res = 1
        cur = 1
        for i in range(len(nums) - 1):
            if nums[i + 1] - nums[i] == 1:
                cur += 1
            else:
                if cur > res:
                    res = cur
                cur = 1
        return res
