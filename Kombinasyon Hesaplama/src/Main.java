import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
                System.out.println("Enter a number to find its factorial ");
                Scanner scanner = new Scanner(System.in);
                int integer = scanner.nextInt();
                System.out.print("The factorial of " +integer + " is "+ factorial(integer));

                System.out.print("Enter 2 number like n and r respectively to find C(n,r) and P(n,r): ");
                Scanner scanner1 = new Scanner(System.in);
                int n1 = scanner.nextInt();
                Scanner scanner2 = new Scanner(System.in);
                int n2 = scanner.nextInt();
                System.out.print("The combination is "+ combination(n1,n2));


            }
            public static int factorial(int number) {
                int result=1;
                for(int i=1;i<=number;i++) {
                    result= result *i;
                }
                return result;
            }
            public static int combination(int n, int r) {
                if(n>0 && r>0 && n >= r) {
                    return (factorial(n)/(factorial(n-r)*factorial(r)));
                }
                else return 0;
            }
}

