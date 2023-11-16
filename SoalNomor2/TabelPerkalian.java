package SoalNomor2;

public class TabelPerkalian {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        for(int i = 1; i<=10;i++){
            for(int j = 1; j<=10;j++){
                System.out.print(a+" ");
                a = a+b;
            }
            System.out.println();
            b++;
            a = b;
        }
    }   
}
