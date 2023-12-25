# input = [2, 8, 7, 6]
# output = [2, 7]

nums = [2, 8, 7, 6]
target = 9

diff_dict = {}

i = 0
for num in nums:
  diff = target - num
  if diff in diff_dict:
    list = []
    list.append(diff_dict[diff])
    list.append(i)
  else:
    diff_dict[num] = i
  i = i + 1

print(list)