class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=0;
        int i=0;
        int j=0;

        for(i=0; i<nums.length;i++){
            a= nums[i];
            for(j = 0; j<nums.length; j++){
                b = nums[j];
                if(a+b==target){
                    break;
                }

            }
        }

        int[] answer = {i-1,j};
        System.out.println(i-1);
        System.out.println(j);
        return answer;

    }
}

public class LC_1_twoSum {
    public static void main(String[] args) {
        Solution obj= new Solution();
        int[] nums= {1,2,3,4};
        obj.twoSum(nums, 3);

    }

}