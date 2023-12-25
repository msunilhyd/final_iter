# input = [3, 4, 6, 9, 4]
# output = True

nums = [3, 4, 6, 9, 4]

distinct_set = set()

for num in nums:
  if num in distinct_set:
    print("True")
    quit()
  distinct_set.add(num)

print("False")