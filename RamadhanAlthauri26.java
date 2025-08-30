// Soal 2.6
// NAMA : Muhammad Ramadhan Althauri
// NIM : 09021382530163

import java.util.Scanner;

public class RamadhanAlthauri26 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Angka yang harus input: 999");
    System.out.print("Masukan angka: ");
    if (!input.hasNextDouble()){
            System.out.println("ERROR: Input harus angka");
            return;
        }
    int angka = input.nextInt();
    int jumlah = 0;
    while (angka > 0) {
        jumlah += angka % 10;
        angka /= 10;
    }

    System.out.println("The sum of the digits is " + jumlah);
 }   
}
