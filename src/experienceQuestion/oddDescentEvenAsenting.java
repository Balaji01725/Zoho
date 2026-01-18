package experienceQuestion;

public class oddDescentEvenAsenting {
    public static void main(String[] args) {
        int[] nums = {9, 12, 7, 4, 11,2};
        oddAndEven(nums);
    }
    static void oddAndEven(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                // odd - Descending
                if(nums[i] % 2 != 0 && nums[j] % 2 != 0 && nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                //even - Ascending
                else if(nums[i] % 2 == 0 && nums[j] % 2 == 0 && nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
