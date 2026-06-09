class Solution:
    def isPalindrome(self, s: str) -> bool:
        n = len(s) // 2
        compare = ""
        compare2 = ""
        for i in s[:n]:
            compare += i.lower()


        for i in range(-1, -n, -1):
            compare2 += s[i]


        print(compare)
        print(compare2)
        return compare == compare2
    

        

solution = Solution()
print(solution.isPalindrome("Was it a car or a cat I saw?"))