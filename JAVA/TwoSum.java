package JAVA;



public class TwoSum{

    public int[] twosum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {    
            for(int j = 1; j<nums.length; j++){   // 처음에는 int j =0으로 했는데 이러면 밑에서 중복된 숫자를 더하는 문젝가 생김
                if(nums[i] + nums[j] == target){
                    return new int[] { i, j };
                } 
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum result = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] answer = result.twosum(nums, target);
        System.out.println("[" + answer[0] + "," + answer[1] + "]");
    }
}