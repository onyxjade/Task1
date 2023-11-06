import java.util.Scanner;



public class task5 {
    public static void main(String[] args) {
        try (Scanner input1 = new Scanner(System.in)) {
            System.out.println("enter your age");
            StringBuilder sb1 = new StringBuilder(input1.nextLine());
            if(sb1.toString().equals(sb1.reverse().toString()))
                System.out.println("The input string is a palindrome.");
            else
                System.out.println("The input string is not a palindrome.");
        }
    }

    
}