package SoalNomor1;

public class BilanganPrima {
    public static void main(String[] args) {
        int bil;

        System.out.println("Bilangan Prima :");
        for(int i = 1; i<=20; i++){
            bil = 0;
            for(int j = 1; j<=i;j++){
                if(i%j == 0){
                    bil = bil+1;
                }
            }

            if(bil == 2){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("Bilangan Bukan Prima : ");
        for(int i = 1; i<=20; i++){
            bil = 0;
            for(int j = 1; j<=i;j++){
                if(i%j == 0){
                    bil = bil+1;
                }
            }

            if(bil != 2){
                System.out.print(i+" ");
            }
        }
    }
}