import java.util.Scanner;
public class ExercicioSeisListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUm, numeroDois,i;
        System.out.println("\nDigite o primeiro número inteiro: ");
        numeroUm = scanner.nextInt();
        System.out.println("\nDigite o segundo número inteiro: ");
        numeroDois = scanner.nextInt();
        for (i = numeroUm; i <= numeroDois; i++){
            System.out.println(i);
 
        }
   scanner.close();
    }

}
