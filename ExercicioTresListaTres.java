import java.util.Scanner;

public class ExercicioTresListaTres {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo ,estadoCivil;
        
        
            System.out.println("Digite seu nome maior de 3 caracteres: ");
            nome = sc.nextLine();
            while (nome.length() <= 3){
                System.out.println("Erro, digite novamente: ");
                nome = sc.nextLine();
            }
                System.out.println("Digite sua idade (0 as 150 anos): ");
             int idade = sc.nextInt();
             while (idade < 0 || idade > 150){
                System.out.println("Erro, digite novamente: ");
                idade = sc.nextInt();
             }
            System.out.println("Digite seu sálario: ");
            double salario = sc.nextDouble();
             while (salario <= 0){
                System.out.println("Erro, digite novamente: ");
                salario = sc.nextDouble();
             }

            System.out.println("Digite seu sexo (F ou M):");
            sexo = sc.nextLine();
            while (sexo != "f" && sexo != "m" ){
                System.out.println("Erro, digite novamente: ");
                sexo = sc.nextLine();
            }
            System.out.println("Digite seu estado civil, s para solteiro,c para casado, v para viúvo, d para divorciado:  ");
            estadoCivil = sc.nextLine();
              while (estadoCivil != "s" && estadoCivil != "c" && estadoCivil != "v"  && estadoCivil != "d"){
                System.out.println("Error, digite novamente: ");
                estadoCivil = sc.nextLine();
              }


              sc.close();
            
            }



        } 
            



