class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices
                }
            }
        }
        return new int[] {}; // Return an empty array if no solution is found
    }

    public class Main {
        public static void main(String[] args) {
            int nums[] = {3,2,4};
          
            Solution solution = new Solution();
            // solution.twoSum(nums, 9);
            int[] result = solution.twoSum(nums, 6); // Call the method and store the result
            if (result.length == 2) {
                System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No solution found.");
            }
        }
    }
    // new question trying 
}