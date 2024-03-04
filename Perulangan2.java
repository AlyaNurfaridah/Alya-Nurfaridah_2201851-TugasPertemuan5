/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan2;

/**
 *
 * @author HP
 */
/*Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.*/

import java.util.Scanner;

public class Perulangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi1, sisi2, sisi3;

        // Meminta input panjang tiga sisi, memeriksa apakah semuanya bilangan bulat positif
        do {
            System.out.println("Masukkan panjang tiga sisi (bilangan bulat positif):");
            System.out.print("Sisi 1: ");
            sisi1 = input.nextInt();
            System.out.print("Sisi 2: ");
            sisi2 = input.nextInt();
            System.out.print("Sisi 3: ");
            sisi3 = input.nextInt();

            if (sisi1 <= 0 || sisi2 <= 0 || sisi3 <= 0) {
                System.out.println("Panjang sisi harus bilangan bulat positif. Coba lagi.");
            }
        } while (sisi1 <= 0 || sisi2 <= 0 || sisi3 <= 0);

        // Memeriksa apakah semua sisi sama atau tidak
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }

        input.close();
    }
}


