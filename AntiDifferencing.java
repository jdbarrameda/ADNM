import java.util.Arrays;

public class AntiDifferencing {

    // Function to perform anti-differencing
    public static double[] antiDifference(double[] differencedData, double[] originalData) {
        double[] antiDifferencedData = new double[differencedData.length];

        // Add the first value of original data to the first value of differenced data
        antiDifferencedData[0] = differencedData[0] + originalData[0];

        // Perform anti-differencing for the rest of the data
        for (int i = 1; i < differencedData.length; i++) {
            antiDifferencedData[i] = differencedData[i] + antiDifferencedData[i - 1];
        }

        return antiDifferencedData;
    }

    public static void main(String[] args) {

        double[] differencedData = { 3, 2, 1, -1, 2 };
        double[] originalData = { 10, 12, 14, 15, 16 }; // Original data before differencing

        // Perform anti-differencing
        double[] antiDifferencedData = antiDifference(differencedData, originalData);

        // Print the anti-differenced data
        System.out.println("Anti-differenced data: " + Arrays.toString(antiDifferencedData));
    }
}
