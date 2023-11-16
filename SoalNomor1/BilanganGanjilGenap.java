package SoalNomor1;

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil");
        for(int i = 1;i<=20;i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("Bilangan Genap");
        for(int i = 1;i<=20;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
