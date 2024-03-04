/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan3;

/**
 *
 * @author HP
 */
/*Buatlah algoritma dalam bahasa Java, yang membaca panjang (integer) tiga buah sisi
sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <= c, lalu menentukan apakah
ketiga sisi tersebut membentuk segitiga siku – siku, segitiga lancip, atau segitiga
tumpul (Petunjuk gunakan hukum Phytagoras).*/

import java.util.Scanner;

public class Perulangan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        // Meminta input panjang tiga sisi segitiga, memeriksa apakah memenuhi syarat segitiga
        do {
            System.out.println("Masukkan panjang tiga sisi segitiga (a <= b <= c):");
            System.out.print("Sisi a: ");
            a = input.nextInt();
            System.out.print("Sisi b: ");
            b = input.nextInt();
            System.out.print("Sisi c: ");
            c = input.nextInt();

            if (!(a <= b && b <= c && a + b >= c)) {
                System.out.println("Panjang sisi yang dimasukkan tidak memenuhi syarat segitiga. Coba lagi.");
            }
        } while (!(a <= b && b <= c && a + b >= c));

        // Memeriksa apakah sisi yang dimasukkan memenuhi syarat segitiga dan menentukan jenis segitiga
        if (a * a + b * b == c * c) {
            System.out.println("Segitiga Siku-siku");
        } else if (a * a + b * b <= c * c) {
            System.out.println("Segitiga Tumpul");
        } else {
            System.out.println("Segitiga Lancip");
        }

        input.close();
    }
}

