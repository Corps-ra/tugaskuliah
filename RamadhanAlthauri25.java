// Soal 2.5
// NAMA : Muhammad Ramadhan Althauri
// NIM : 09021382530163
import java.util.Scanner;

public class RamadhanAlthauri25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Angka yang harus input: 10 15");
        System.out.print("Masukan Subtotal dan grauity rate: "); 
        if (!input.hasNextDouble()){
            System.out.println("ERROR: Input harus angka");
            return;
        }
        int subtotal = input.nextInt();
        int gratuity = input.nextInt();
        double biaya = subtotal * gratuity / 100.0;
        double total = subtotal + biaya; 

        System.out.println("The gratuity is $" + biaya + " and total is $" + total);
    }
}
