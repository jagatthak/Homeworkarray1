import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        String str ="Hello England";
        char ch = 'n';
        int count =0;
        //counting total number of 'n' in the string with for loop after comparing each char in string to 'n'
        for(int i =0;i< str.length();i++){
            if( str.charAt(i)==ch)
                count++;
        }
        System.out.println("Total number of "+ch + " in the string : "+count);
    }
}
