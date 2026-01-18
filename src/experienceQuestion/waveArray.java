package experienceQuestion;

public class waveArray {
    public static void main(String[] args) {
        int[] nums = {10,5,6,3,2,20,100,80};
        reArrangeWave(nums);
    }
    static void reArrangeWave(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i+=2){
            if(i < n - 2 && nums[i] < nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }else if(i < n - 2 && nums[i+1] > nums[i+2]){
                int temp = nums[i+1];
                nums[i+1] = nums[i+2];
                nums[i+2] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] +" ");
        }
    }

}

