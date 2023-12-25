# input = [1, 3, -2, 5, 2, -4]
# output = 9

nums = [1, 3, -2, 5, 2, -4]

curSum = 0
maxSum = 0

for num in nums:
  if curSum < 0:
    curSum = 0 
  curSum = curSum + num
  maxSum = max(maxSum, curSum)

print(maxSum)