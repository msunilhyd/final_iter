
# input = [1, 2, 3, 4]
# output = [24, 12, 8, 6]

nums = [1, 2, 3, 4]

pre = 1
post = 1

result = [1]*4
print(result)

i = 1
# result = [1, 1, 2, 6]
while(i<len(nums)):
  result[i] = pre 
  pre = pre * nums[i]
  i += 1

i = len(nums) - 1
while (i>=0):
  result[i] = post * result[i]
  post = post * nums[i]
  i -= 1
print(result)