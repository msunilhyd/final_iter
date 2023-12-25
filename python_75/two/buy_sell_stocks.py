# input = [7, 5, 3, 1, 8, 4, 9]
# output = 8

nums = [7, 5, 3, 1, 8, 4, 9,22]

maxProfit = 0
min = nums[0]

for cur in nums:
  if cur < min:
    min = cur
  profit = cur - min
  maxProfit = max(maxProfit, profit)

print(maxProfit)