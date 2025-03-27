import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; 
                }
            }
        }
        
        return new int[] {};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        
        sc.close();
    }
}
