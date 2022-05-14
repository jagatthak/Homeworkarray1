public class Commonelements {
    public static void main(String[] args) {
        String[] a1 = new String[]{"Red", "Yellow", "Blue"};
        String[] a2 = new String[]{"Blue", "Red", "Green","Brown"};
        System.out.println("Common elements: ");
        //comparing each string element of a1 to a2 to find common element
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    System.out.println(a1[i]);
                    break;
                }
            }
            }
    }

}
