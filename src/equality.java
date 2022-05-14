import java.util.Arrays;
import java.util.Arrays;

    public class equality {
        public static void main(String[] args) {
            int first[] = {1, 2, 3, 4};
            int second[] = {1, 6, 3, 4};
            if (compare(first, second)) {
                System.out.println("Arrays are equal");
            } else {
                System.out.println("Arrays are not equal");
            }
        }
        public static boolean compare(int[] a, int[] b) {
            if (a.length != b.length)
                return false;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i])
                        return false;
                    }
                    return true;
        }
    }