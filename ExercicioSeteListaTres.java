import java.util.Scanner;
public class ExercicioSeteListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int numero;
       int contadorPar = 0;
       int contadorImpar = 0;
       
    for(int i = 1; i <= 10; i ++){
        System.out.println("\nDigite o " + i + "º número inteiro: ");
        numero = scanner.nextInt();
    
        if (numero % 2 == 0){
            contadorPar++;
          }  else {
                contadorImpar++;
            }
        }
        System.out.println("Quantidades de números pares: " + contadorPar);
        System.out.println("Quantidades de números pares: " + contadorImpar);

    
       
        
scanner.close();
    }
}
