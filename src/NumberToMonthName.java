import java.util.Scanner;
public class NumberToMonthName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Month Number : ");
        int num = s.nextInt();
        switch(num) {
            case 1:
                System.out.println("The Name of the Month is January");
                break;
            case 2:
                System.out.println("The Name of the Month is February");
                break;
            case 3:
                System.out.println("The Name of the Month is March");
                break;
            case 4:
                System.out.println("The Name of the Month is April");
                break;
            case 5:
                System.out.println("The Name of the Month is May");
                break;
            case 6:
                System.out.println("The Name of the Month is June");
                break;
            case 7:
                System.out.println("The Name of the Month is July");
                break;
            case 8:
                System.out.println("The Name of the Month is August");
                break;
            case 9:
                System.out.println("The Name of the Month is September");
                break;
            case 10:
                System.out.println("The Name of the Month is October");
                break;
            case 11:
                System.out.println("The Name of the Month is November");
                break;
            case 12:
                System.out.println("The Name of the Month is December");
                break;
            default :
                System.out.println("The Number is Invalid");
        }
    }
}