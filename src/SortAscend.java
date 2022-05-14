import java.util.Arrays;

public class SortAscend {

    public static void main(String[] args) {
        int a1[] = {80, 30, 21, 100, -2, 18, 52, 36};
        System.out.println("The sorted int array is: ");
        //sorting logic
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                int k = 0;
                if (a1[i] > a1[j]) {
                    k = a1[i];
                    a1[i] = a1[j];
                    a1[j] = k;
                }
            }
            System.out.println(a1[i]);
        }
    }
}