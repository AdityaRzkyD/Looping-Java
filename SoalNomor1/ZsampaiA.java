package SoalNomor1;

public class ZsampaiA {
    public static void main(String[] args) {
        char HurufAwal = 'A';
        char HurufAkhir = 'Z';
        int ASCII1 = (int)HurufAwal;
        int ASCII2 = (int)HurufAkhir;

        while(ASCII2 >= ASCII1){
            System.out.print((char)ASCII2+" ");
            ASCII2--;
        }
    }
}
