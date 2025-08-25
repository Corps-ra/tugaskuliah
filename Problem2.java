// Soal 2.4

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Angka yang harus di input: 55.5\n");
        System.out.print("Masukan jumlah pounds: ");
        if (!input.hasNextDouble()){
            System.out.println("ERROR: Input harus angka");
            return;
        }
        double pounds = input.nextDouble(); // yang harus di input adalah 55.5 punds
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
