import java.util.Scanner;

public class ExercicioTresListaTres {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo ,estadoCivil;
        
        System.out.println("Digite seu nome maior de 3 caracteres: ");
        nome = sc.nextLine();
            while (nome.length() <= 3){
            System.out.println("Erro,digite novamente:");
            nome = sc.nextLine();
            }
            System.out.println("\nNome salvo com sucesso");
               
            System.out.println("Digite sua idade (0 as 150 anos): ");
            int idade = sc.nextInt();
             
             while (idade < 0 || idade > 150){
                System.out.println("Erro, digite novamente: ");
                idade = sc.nextInt();
             }
             System.out.println("\nIdade salva com sucesso.");
            
            System.out.println("Digite seu sálario: ");
            double salario = sc.nextDouble();
             while (salario <= 0){
                System.out.println("Erro, digite novamente: ");
                salario = sc.nextDouble();
             }
            System.out.println("Salario salvo com sucesso");
            
            System.out.println("Digite seu sexo (F ou M):");
            sexo = sc.next();
           
            while (!sexo.equals("f") &&  !sexo.equals("m")){
                System.out.println("Erro, digite novamente: ");
                sexo = sc.next();
            }
            System.out.println("Sexo salvo com sucesso.");
            
            System.out.println("Digite seu estado civil, s para solteiro,c para casado, v para viúvo, d para divorciado:  ");
            estadoCivil = sc.next();
              while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v")  && !estadoCivil.equals("d")){
                System.out.println("Error, digite novamente: ");
                estadoCivil = sc.nextLine();
              }
              System.out.println("Estado civil salvo com sucesso.");


              sc.close();
            
            }



        }
            



