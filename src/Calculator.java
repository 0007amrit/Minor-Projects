import java.util.*;
public class Calculator {
       public int add(int a,int b){
           return a+b;
       }
       public int sub(int a,int b){
           return a-b;
       }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int  a,int b){
           if(b==0){
               System.out.println("Cannot divide by zero");
           }
        return a/b;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        while (true) {
            System.out.println("=*==*=*=*=*=*=*=*=*=*=*=*=*=Welcome to AMRIT's CALCULATOR=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("1.Addition ");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication ");
            System.out.println("4.Division ");
            System.out.println("5.Exit ");
            System.out.println("Enter your choice :  ");
            choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting Calculator");
                break;
            }

            System.out.println("Enter 1st num1 ");
            int a = sc.nextInt();
            System.out.println("Enter 2nd num1 ");
            int b = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result :- " + calc.add(a, b));
                    break;

                case 2:
                    System.out.println("Result :- " + calc.sub(a, b));
                    break;
                case 3:
                    System.out.println("Result :- " + calc.mul(a, b));
                    break;
                case 4:
                    System.out.println("Result :- " + calc.div(a, b));
                    break;
                default:
                    System.out.println("Invalid CHOICE");
            }
        }


    }

}
