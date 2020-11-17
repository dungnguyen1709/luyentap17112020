package kethua.bai2;

import java.awt.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong: ");
        int n = Integer.parseInt(sc.nextLine());

        Pixel[] arr = new Pixel[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pixel();

            System.out.println(" nhap x: ");
            int x = Integer.parseInt(sc.nextLine());
            arr[i].setX(x);

            System.out.println("nhap y: ");
            int y = Integer.parseInt(sc.nextLine());
            arr[i].setY(y);

            System.out.println("ten mau: ");
            String tenMau = sc.nextLine();
            arr[i].setTenMau(tenMau);

            System.out.println("ma mau: ");
            String maMau = sc.nextLine();
            arr[i].setMaMau(maMau);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i].check() == true)
                System.out.println(arr[i]);
        }
    }
}
