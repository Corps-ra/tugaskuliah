//  Soal 2.7

public class RamadhanAlthauri27 {
    public static void main(String[] args) {
        long minutes = 1000000000;
        int years = (int)(minutes / 525600);
        int days = (int)(minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        
    }
}
