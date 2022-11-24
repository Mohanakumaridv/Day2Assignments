import java.util.Scanner;
public class DisplayUnitNumber {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one, ten, hundred, thousand ;
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        if(num <= 9999 && num > 9) {
            ten = (num/10)%10;
            System.out.println("Ten : "+ ten);
            hundred = (num/100)%10;
            System.out.println("Hundred : "+ hundred);
            thousand = (num/1000)%10;
            System.out.println("Thousand : "+ thousand);
        }
        else {
            System.out.println("The number is invalid");
        }
    }
}
