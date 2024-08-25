package lista5_6;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Lista5_6 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITECIMA = 50;
        int vet[] = new int [TAM];
        for(int x=0; x < TAM; x++){
            if(x % 2 == 0){
                do{
                    vet[x] = (int) (Math.random() * (LIMITECIMA+1));
                }while(vet[x] % 2 != 0);
            } else{
                do{
                    vet[x] = (int) (Math.random() * (LIMITECIMA+1));
                }while(vet[x] % 2 == 0);
            }
        }
        JOptionPane.showMessageDialog( null, "Vetor: "+Arrays.toString(vet));
    }    
}
