import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String name;
        System.out.println("nhap x");
        x = sc.nextInt();
        System.out.println("name:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("x = " + x);
        System.out.println("name: " + name);
    }
}
