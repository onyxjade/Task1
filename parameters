public class parameters {
    public static void main(String[] args) {
        int[] parameters = {4, 5, 10};
        calculateCumulativeSum(parameters);
    }

    public static void calculateCumulativeSum(int... params) {
        int totalSum = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < params.length; i++) {
            totalSum += params[i];
            cumulativeSum += params[i];

            System.out.println("Total sum for parameter " + (i + 1) + ": " + totalSum);
            System.out.println("Cumulative sum for parameter " + (i + 1) + ": " + cumulativeSum);
        }
    }
}
