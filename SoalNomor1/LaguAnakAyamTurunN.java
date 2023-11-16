package SoalNomor1;

public class LaguAnakAyamTurunN {
    public static void main(String[] args) {
        String Lagu = "Anak Ayam Turunlah ";
        int N = 5;
        int M = 1;

        while(N >= M){
            System.out.println(Lagu+N);
            N--;
            System.out.println("Pergi 1 Tinggallah "+N);
            System.out.println();
        }
    }
}