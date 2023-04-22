import java.util.Scanner;
public class ExercicioDoisListaTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, senha;
        do {
            System.out.println("Digite o seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
            if (nome.equals (senha)){
                System.out.println("Erro, seu nome não pode ser igual senha.");
            }
        }  while (nome.equals(senha));
            System.out.println("Nome e senha aceitos.");
        
        
            sc.close();
        
    }


    }

