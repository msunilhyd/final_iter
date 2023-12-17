class Solution:
  def maxProfit(self, prices):

    # 5 7 1 8 6 0 9

    min = prices[0]
    max_profit = 0

    for cur in prices:
      if (cur < min):
        min = cur
      max_profit = max(max_profit, cur - min)

    return max_profit
  
sol = Solution()
print(sol.maxProfit([5, 7, 1, 8, 6, 0, 9]))

