import java.util.Arrays;

public class SortAscend {

        public static void main(String[] args) {
            int a1[] = {80, 30, 21, 100, -2, 18, 52, 36};
            //use Arrays.sort to sort out elements in ascending order
            Arrays.sort(a1);
            System.out.println("The sorted int array is: ");
            for(int number : a1){
                System.out.println(number);
            }
        }
}
