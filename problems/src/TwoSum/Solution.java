
public int[] twoSum(int nums[], int target) {
    Map<Integer, Integer> map = new HashMap<>(); // 1. Create an HashMap to store integer values and its index

    for(int i = 0; i< nums.length; i++){ // 2. Iterate through the given input
        int diff = target - nums[i];
        if(map.containsKey(diff)){ // 3. if the difference is present in the HashMap
            return new int[]{map.get(diff),i}; // 3. If so, return the value and the current index
        }
        map.put(nums[i],i); // 3. else add the said entry to the HashMap
    }
    return null;
}

public void main() {
    int nums1[] = new int[]{2,7,11,15};
    int target1 = 9;
    System.out.println(Arrays.toString(twoSum(nums1,target1)));
}
