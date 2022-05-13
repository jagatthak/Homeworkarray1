public class Multitable {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int i = 1;
        //Preparing Multiplication table for each element of array a
        do{
            System.out.println(a[0]*i+" "+a[1]*i+" "+a[2]*i);
            i++;
        }
        while(i<=3);
    }
}
