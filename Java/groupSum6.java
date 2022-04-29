public boolean groupSum6(int start, int[] nums, int target) {
  if(target < 0) return false;
  if(start == nums.length) 
    if(target == 0) return true;
    else return false;
  
  if(groupSum6(start+1, nums, target-nums[start]))
    return true;
  
  if(nums[start] != 6 && groupSum6(start+1, nums, target))
    return true;
  return false;
}

