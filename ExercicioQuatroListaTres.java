import java.util.Scanner;
public class ExercicioQuatroListaTres {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double numeroUm,numeroDois,numeroTres,numeroQuatro,numeroCinco,soma, mediaUm,mediaArit,mediaDois,mediaTres,mediaQuatro,mediaCinco;

      System.out.println("Digite o primeiro número:");
        numeroUm = scanner.nextDouble();
      System.out.println("Digite o segundo número:");
        numeroDois = scanner.nextDouble();
      System.out.println("Digite o terceiro número:");
        numeroTres = scanner.nextDouble();
      System.out.println("Digite o quarto número:");
        numeroQuatro = scanner.nextDouble();
      System.out.println("Digite o quinto número:");
        numeroCinco = scanner.nextDouble();

    soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco;
        System.out.println("\nA soma dos números é:" + soma);
        mediaArit = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco / 5;
        System.out.println("\nA média Aritmética dos números é:" + mediaArit);
        
        mediaUm = (numeroUm / 2);
        mediaDois = (numeroDois/ 2);
        mediaTres = (numeroTres / 2);
        mediaQuatro = (numeroQuatro /2);
        mediaCinco = (numeroCinco / 2);

        System.out.println("\nA média do primeiro número é:" + mediaUm);
        System.out.println("\nA média do segundo número é:" + mediaDois);
        System.out.println("\nA média do terceiro número é:" + mediaTres);
        System.out.println("\nA média do quarto número é:" + mediaQuatro);
        System.out.println("\nA média do quinto número é:" + mediaCinco);
















        scanner.close();
    }

}