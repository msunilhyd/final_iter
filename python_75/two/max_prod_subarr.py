# input = [2, 3, -2, 4, -4]
# output = 6

nums = [2, 3, -2, 4]

curProd = 1
maxProd = 1

for num in nums:
  if (curProd < 0 and num < 0) or (curProd > 0 and num > 0):
    curProd = curProd * num
  else: 
    curProd = 1
  maxProd = max(curProd, maxProd)

print(maxProd)
