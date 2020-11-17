package kethua.bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input name: ");
        String name = scanner.nextLine();

        System.out.println("input age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("input address: ");
        String address = scanner.nextLine();

        System.out.println("input id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("input math: ");
        int math = Integer.parseInt(scanner.nextLine());

        System.out.println("input physical: ");
        int physical = Integer.parseInt(scanner.nextLine());

        System.out.println("input chemistry: ");
        int chemistry = Integer.parseInt(scanner.nextLine());

        double gpa = (math + physical + chemistry) / 3;
        System.out.println("GPA = " + gpa);
    }
}
