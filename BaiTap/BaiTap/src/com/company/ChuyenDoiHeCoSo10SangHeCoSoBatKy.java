package com.company;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ChuyenDoiHeCoSo10SangHeCoSoBatKy {
    void test() {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Nhap So muon chuyen doi: ");
        n = sc.nextInt();

        int binaryNumber = 0, p = 1;
        while (n!=0) {
            binaryNumber = binaryNumber + p * (n % 2);
            n = n / 2;
            p = p * 10;
        }
        System.out.println(binaryNumber);
    }
}
