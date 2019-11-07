package com.company;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    private Scanner sc = new Scanner(System.in);
    private int dem = 0;

    private void checkSoNguyenTo() {
        System.out.print("Nhap so N de tim cac So Nguyen To be hon N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        if (dem <= 2) {
            System.out.println(n + " la So Nguyen To.");
            //System.out.print(n + ", ");
        }

    }
}

