// Soal 2.5
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Angka yang harus input: 10 15");
        System.out.print("Masukan Subtotal dan grauity rate: "); 
        int subtotal = input.nextInt();
        int gratuity = input.nextInt();
        double biaya = subtotal * gratuity / 100.0;
        double total = subtotal + biaya; 

        System.out.println("The gratuity is $" + biaya + " and total is $" + total);
    }
}
