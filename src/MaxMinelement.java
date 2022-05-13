import java.util.Arrays;

public class MaxMinelement {
        public static void main(String[] args) {
            int[] a = {25, 38, 15, 28, 55, 44};
            //sort array to find max and min value
            Arrays.sort(a);
            int min = a[0];
            System.out.println("Minimum value of array a: " + min);
            int max = a[a.length - 1];
            System.out.println("Maximum value of array a: " + max);
        }

    }

