package experienceQuestion;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] price = {7, 3, 2, 4, 9, 12, 56};
        int M = 3;
        System.out.println(findMinimumDistribution(price, M));
    }
    static int findMinimumDistribution(int[] price, int M){
        sort(price);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i + M - 1 < price.length; i++){
            int min = price[i + M - 1] - price[i];
            minDiff = Math.min(minDiff, min);
        }
        return minDiff;
    }
    static void sort(int[] price){
        int n = price.length;
        for(int i = 0; i < n-1; i++){
            boolean swaped = false;
            for(int j = 0; j < n-i-1; j++){
                if(price[j] > price[j+1]){
                    //swap
                    int temp = price[j+1];
                    price[j+1] = price[j];
                    price[j] = temp;
                    swaped = true;
                }
            }
            if(!swaped) break;
        }
    }
}
