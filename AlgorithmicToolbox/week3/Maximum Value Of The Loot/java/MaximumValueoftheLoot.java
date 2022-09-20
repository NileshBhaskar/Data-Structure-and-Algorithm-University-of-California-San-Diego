import java.util.*;
public class MaximumValueoftheLoot {
    private static int[] remove(int m, int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = m; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    private static int indexOfMostExpensiveItem(int[] values, int[] weight) {
        double[] p = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            p[i] = ((double) values[i] / (double) weight[i]);
        }
        double max = 0;
        int maxPos = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] > max) {
                max = p[i];
                maxPos = i;
            }
        }
        return maxPos;
    }

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        // write your code here
        if (capacity == 0 || weights.length == 0)
            return 0;
        int m = indexOfMostExpensiveItem(values, weights);

        int amount = Math.min(weights[m], capacity);

        value = ((double) values[m] / (double) weights[m]) * amount;

        values = remove(m, values);
        weights = remove(m, weights);

        return value + getOptimalValue(capacity - amount, values, weights);

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
}