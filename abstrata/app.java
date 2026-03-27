  package abstrata;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario programador = new Programador("Ana", 3000);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Imprimir dados");
            System.out.println("2 - Aumentar salário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Programador");
                    int escolha1 = sc.nextInt();

                    if (escolha1 == 1) {
                        System.out.println("Nome: " + gerente.getNome());
                        System.out.println("Salário: " + gerente.getSalario());
                    } else {
                        System.out.println("Nome: " + programador.getNome());
                        System.out.println("Salário: " + programador.getSalario());
                    }
                    break;

                case 2:
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Programador");
                    int escolha2 = sc.nextInt();

                    if (escolha2 == 1) {
                        gerente.aumentaSalario();
                        System.out.println("Salário do gerente atualizado!");
                    } else {
                        programador.aumentaSalario();
                        System.out.println("Salário do programador atualizado!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
