class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        # 3 options: buy, sell, pass
        # Always sell if highest in array
        # always buy if lowest in array && not last element
        profit: int = 0
        highest_profit: int = 0
