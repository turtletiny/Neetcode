import code


class Solution:
    def encode(self, strs: list[str]) -> str:
        encoded_string = ""
        for s in strs:
            encoded_string += str(len(s)) + "#" + s
        return encoded_string

    def decode(self, encoded_string: str) -> list[str]:
        length_as_string = ""
        length_as_int = 0
        res = []
        i = 0
        while i != "#":
            length_as_string += encoded_string[i]
            i += 1
        length_as_int = int(length_as_int)
        word = ""
        for i in range(i, length_as_int + 1):
            word += encoded_string[i]
        res.append(word)
        return res


sol = Solution()
codestring = sol.encode(["Hello", "World"])
print(sol.decode(codestring))
