public boolean groupSum(int start, int[] nums, int target) {
  if(target == 0) return true;

  for(int i = start; i < nums.length; i++) {
    if(groupSum(i+1, nums, target-nums[i]))
      return true;
  }
  return false;
}

