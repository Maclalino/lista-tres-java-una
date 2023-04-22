import java.util.Scanner;
public class ExercicioUmlistaTres {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int notas;
    
    System.out.println("Digite a sua nota: ");
    notas = scanner.nextInt();
    while ((notas <0)|| (notas > 10)){
        System.out.println("Nota inválida, digite outro número: ");
        notas = scanner.nextInt();
    }
scanner.close();

 }





}