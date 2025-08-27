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
    int number = input.nextInt();
    int sum = 0;
    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }

    System.out.println("The sum of the digits is " + sum);
 }   
}
