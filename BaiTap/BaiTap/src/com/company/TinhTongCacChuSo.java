package com.company;

import java.util.Scanner;

public class TinhTongCacChuSo {
    Scanner sc = new Scanner(System.in);
    int n;
    public void tach() {
        System.out.print("Nhap so muon tinh tong cac chu so: ");
        n = sc.nextInt();
        int a = n;
        int s = 0;
        while (n!=0) {
            s = s + n % 10;
            n = n/10;
        }
        System.out.println("Tong cac chu so cua " + a + " la: " + s);
    }
}
