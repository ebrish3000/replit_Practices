package day_07_26_2020;

public class MethodFindMax_188 {
    public static void main(String[] args) {

    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public double findMax(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

}
