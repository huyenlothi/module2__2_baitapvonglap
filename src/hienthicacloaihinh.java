import java.util.Scanner;

public class hienthicacloaihinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("     1.Print the rectangle");
        System.out.println("     2.Print the square triangle,the corner is square at top-left");
        System.out.println("     3.Print the square triangle,the corner is square at top-right");
        System.out.println("     4.Print the square triangle,the corner is square at botton-left");
        System.out.println("     5.Print the square triangle,the corner is square at botton-right");
        System.out.println("     6.Print isosceles triangle");
        System.out.println("     7.Exit");
        System.out.println("enter your choice");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 4:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j < i) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 1:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("* * * * * * *");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5; j>=0; j--) {
                            if (j > i) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 5; i >=0 ; i--) {
                        for (int j = 5; j>=0; j--) {
                            if (j > i) {
                                System.out.print(" ");
                            }else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i <=5 ; i++) {
                        for (int j = 5; j>=0; j--) {
                            if (j > i) {
                                System.out.print(" ");
                            }else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

            }
        }


    }
}
