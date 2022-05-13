import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.nextLine();
        char ch = 'a';
        int count =0;
        //counting total number of 'a' in the string with for loop after comparing each char in string to 'a'
        for(int i =0;i< str.length();i++){
            if( str.charAt(i)==ch)
                count++;
        }
        System.out.println("Total number of "+ch + " in the string : "+count);
    }
}
