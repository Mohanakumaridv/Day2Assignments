import java.util.Scanner;
public class VowelOrConsonant {
        public static void main(String[] arg) {
            boolean vowel=false;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a character : ");
            char ch=sc.next( ).charAt(0);
            switch(ch) {
                case  'a' :
                case 'e'  :
                case 'i'  :
                case 'o'  :
                case 'u'  :
                case  'A' :
                case 'E'  :
                case 'I'  :
                case 'O'  :
                case 'U'  : vowel = true;
            }
            if(vowel == true)
                System.out.println("Entered character "+ch+" is  Vowel");
            else
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println("Entered character "+ch+" is Consonent");
            else
                System.out.println("Not an alphabet");
        }
    }
