import java.util.Scanner;

class test {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int x = obj.nextInt();
        int y = obj.nextInt();

        if (x == 0) {
            if (y == 0) {
                System.out.println("Origin");
            } else {
                System.out.println("x axis");
            }
        } else if (y == 0) {
            System.out.println("y axis");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("1st Quadrant");
            } else {
                System.out.println("4th Quadrant");
            }
        } else if (y > 0) {
            System.out.println("2nd Quadrant");
        } else {
            System.out.println("3rd Quadrant");
        }

        obj.close(); // Close the Scanner object to prevent resource leaks
    }
}
