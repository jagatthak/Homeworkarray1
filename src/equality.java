import java.util.Arrays;
import java.util.Arrays;

    public class equality {
        public static void main(String[] args) {
            int a[] = new int[]{15, 16, 18, 23};
            int b[] = new int[]{16, 15, 28, 29};
            //introduce boolean Arrays.equals to check equality of both arrays
            boolean compare = Arrays.equals(a, b);
            if (compare == true) {
                System.out.println("a and b are equal");}
            else{
                System.out.println("a and b are not equal");

            }
        }
    }


