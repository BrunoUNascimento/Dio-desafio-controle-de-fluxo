package contador;

import java.util.Scanner;

public class Contador {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws ParametrosInvalidosException {
        System.out.print("Digite o numero que o contador deve comecar: ");
        int numInicial = teclado.nextInt();
        System.out.print("Digite o numero que deve terminar: ");
        int numFinal = teclado.nextInt();
        if(numFinal < numInicial){
            throw new ParametrosInvalidosException(numFinal, numFinal);
        }else{
        contador(numInicial,numFinal);
        }
        
        
    }
    
    public static void contador(int n1,int n2){
        for(int i = n1; i < n2; i++){
            System.out.println(i);
        }
    }
    
}
