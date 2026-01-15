package experienceQuestion;

public class meetingRoomDistribution {
    public static void main(String[] args) {
        int[][] nums = {{0,30}, {5,10}, {15, 20}};
        System.out.println(countMeetingRooms(nums));
    }
    static int countMeetingRooms(int[][] nums){
        int n = nums.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i < n; i++){
            start[i] = nums[i][0];
            end[i] = nums[i][1];
        }

        sort(start);
        sort(end);

        int rooms = 0;
        int endPtr = 0;

        for(int i = 0; i < n; i++){
            if(start[i] < end[endPtr]){
                rooms++; // new rooms
            }else{
                endPtr++;  //reuse the rooms
            }
        }
        return rooms;
    }
    static void sort(int[] nums){
        int n = nums.length;


        for(int i = 0; i < n-1; i++){
            boolean swaped = false;
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped) break;
        }
    }
}
