import java.util.Arrays;

public class MinMaxfinder {
    public static void main(String[] args) {
        int a1[] = {70,40, 29, 120, -5, -1, 50, 38};
        System.out.println("Minimum and Maximum values are: ");
        //sorting array a1
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                int k = 0;
                if (a1[i] > a1[j]) {
                    k = a1[i];
                    a1[i] = a1[j];
                    a1[j] = k;
                }
            }
        }
            //Assigning min and max array position
            int min = a1[0];
            System.out.println(min);
            int max = a1[a1.length - 1];
            System.out.println(max);
    }
}

