import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        

        Scanner obj = new Scanner(System.in);

        
        int flag = 1;

        while (flag != 0) {
            System.out.println("Enter first NO.:");
            int a = obj.nextInt();

            System.out.println("Enter Second NO.:");
            int b = obj.nextInt();


            System.out.println("SElect Operation :");
            char o = obj.next().charAt(0);

            if(o =='+'){
                System.out.println(a+" + "+b+" = "+(a+b));
            }
            else if( o =='-'){
                System.out.println(a+" - "+b+" = "+(a-b));
            }
            else if(o =='*'){
                System.out.println(a+" * "+b+" = "+(a*b));
            }
            else if(o =='/'){
                System.out.println(a+" / "+b+" = "+(a/b));
            }

            else {
                System.out.println("Error");
            }

            System.out.println("Enter 0 to quit any other key to continue :");
            flag = obj.nextInt();

            
            
        }



    }
}
