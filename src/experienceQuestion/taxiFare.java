package experienceQuestion;

public class taxiFare {
    public static void main(String[] args) {
        int startTime = 21;
        int currentTime = 23;
        int distance = 10;

        System.out.println(calculateTaxiFare(startTime, currentTime, distance));
    }
    static double calculateTaxiFare(int startTime, int currentTime, int distance){
        double baseFare = 50;
        double perKmRate = 10;

        double totalFare = (distance * perKmRate) + baseFare;

        if(currentTime >= 22 || currentTime < 6){
            totalFare += totalFare * 0.20;
        }
        return totalFare;
    }
}
