//  Soal 2.7
// NAMA : Muhammad Ramadhan Althauri
// NIM : 09021382530163

public class RamadhanAlthauri27 {
    public static void main(String[] args) {
        long menit = 1000000000;
        int tahun = (int)(menit / 525600);
        int hari = (int)(menit % 525600) / 1440;

        System.out.println(menit + " minutes is approximately " + tahun + " years and " + hari + " days");
        
    }
}
