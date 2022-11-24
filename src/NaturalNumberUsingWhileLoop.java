import java.util.Scanner;
public class NaturalNumberUsingWhileLoop {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Ente the Natural Number : ");
            int num = s.nextInt();
            int i=0, sum =0 ;
            while(i <=num) {
                sum = sum+i ;
                i++;
            }
            System.out.println("Sum of the Natural Numbers : "+ sum );
        }
    }
