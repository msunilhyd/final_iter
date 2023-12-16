# Given an array of integers and a target, find 2 numbers that add up to target


class Solution(object):

  def twoSum(self, nums, target):
    i = 0
    diff_dict = {}
    for num in nums:
      diff = target - num
      if (diff in diff_dict):
        list = []
        list.append(nums[i])
        list.append(nums[diff_dict[diff]])
        return list
      else:
        diff_dict[num] = i
      i+= 1

p1 = Solution()
print(p1.twoSum([2, 3, 5, 6], 7))