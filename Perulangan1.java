/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan1;

/**
 *
 * @author HP
 */

/*Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai 
dengan n, dimana n diinput dari alat masukan, n>=1.*/
import java.util.Scanner;

public class Perulangan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai n
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();

        // Memeriksa nilai n
        if (n < 1) {
            System.out.println("Nilai n harus lebih besar atau sama dengan 1.");
        } else {
            // Menampilkan bilangan dari 1 sampai n
            System.out.println("Bilangan dari 1 sampai " + n + " adalah:");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
