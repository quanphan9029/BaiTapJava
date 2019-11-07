package com.company;

import java.util.Scanner;

public class TinhGiaiThuaCuaN {
    Scanner sc = new Scanner(System.in);
    private int n;
    private int giaithua = 1;
    void inputN() {
        System.out.print("Nhap N de tinh giai thua: ");
        n = sc.nextInt();
    }

    void checkN() {
        if (n < 0) {
            System.out.print("N be hon 0. Vui long nhap lai N: ");
            n = sc.nextInt();
        }
    }

    void tinhGiaiThua() {
        for (int i = 1; i <= n; i++) {
            giaithua = giaithua * i;
        }
        System.out.println("Giai thua cua N la: " + giaithua);
    }
}
