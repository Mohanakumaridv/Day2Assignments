public class NumberToWord {
        public static void main(String[] args)
        {
            int n=10;
            System.out.print(n);
            numtoWords nw = new numtoWords();
            nw.Words((n / 1000000000), " Hundred");
            nw.Words((n / 10000000) % 100, " crore");
            nw.Words(((n / 100000) % 100), " lakh");
            nw.Words(((n / 1000) % 100), " thousand");
            nw.Words(((n / 100) % 10), " hundred");
            nw.Words((n % 100), " ");
        }
    }
    class numtoWords
    {
        void Words(int n, String ch)
        {
            String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                    " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                    " Nineteen" };
            String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
            if (n > 19)
            {
                System.out.print(ten[n / 10] + " " + one[n % 10]);
            }
            else
            {
                System.out.print(one[n]);
            }
            if (n > 0)
                System.out.print(ch);
        }
    }

