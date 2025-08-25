// Soal 2.6

import java.util.Scanner;

public class Problem4 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Angka yang harus input: 999");
    System.out.print("Masukan angka: ");
    int number = input.nextInt();
    int sum = 0;
    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }

    System.out.println("The sum of the digits is " + sum);
 }   
}
