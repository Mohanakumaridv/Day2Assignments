import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();
        int temp,i,r=0;

        for(i=num; i>0; i/=10) {
            temp = i%10;
            r = r*10+temp;
        }
        System.out.println("The Output Number is : "+ r);
        if(r==num) {
            System.out.println("This Number is Palindrome");
        }
        else {
            System.out.println("This Number is not Palindrome");
        }
    }
}
