import java.util.Scanner;
public class NaturalNumberUsingForLoop {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Ente the Natural Number : ");
            int num = s.nextInt();
            int i, sum =0 ;

            for(i=0;i <=num; i++) {
                sum = sum+i ;
            }
            System.out.println("Sum of the Natural Numbers : "+ sum );
        }
    }
