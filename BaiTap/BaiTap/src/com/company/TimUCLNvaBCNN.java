package com.company;

import javax.swing.plaf.synth.SynthIcon;
import java.util.Scanner;

public class TimUCLNvaBCNN {
    Scanner sc = new Scanner(System.in);

    void UCLN() {
        System.out.println("Tim UCLN va BCNN cua 2 so a va b.");
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        int ucln = 0;


        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
        System.out.println("UCLN: " + ucln);
        int bcnn = a * b / ucln;
        System.out.println("BCNN: " + bcnn);
    }
}
