public class CalculateBattingAverage {
    public static void main(String[] args) {
        int totalMatches = 100;
        int totalRuns = 2500;
        int notOut = 1;
        int innings = 60;
        double average;
        average = totalRuns/(innings - notOut);
        System.out.println("The batting average is:"+average);
    }
}
