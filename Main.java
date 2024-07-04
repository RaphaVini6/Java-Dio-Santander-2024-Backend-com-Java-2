import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();

        System.out.println("Bem-vindo ao Sistema de Validação de Processo Seletivo!");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Candidato");
            System.out.println("2. Listar Candidatos");
            System.out.println("3. Listar Candidatos Aprovados");
            System.out.println("4. Verificar Aprovação de Candidato");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Idade:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Email:");
                    String email = scanner.nextLine();
                    System.out.println("Nota da Prova:");
                    double notaProva = scanner.nextDouble();

                    Candidato candidato = new Candidato(nome, idade, email, notaProva);
                    processoSeletivo.adicionarCandidato(candidato);
                    System.out.println("Candidato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Candidatos:");
                    processoSeletivo.listarCandidatos();
                    break;

                case 3:
                    System.out.println("Lista de Candidatos Aprovados:");
                    processoSeletivo.listarAprovados();
                    break;

                case 4:
                    System.out.println("Digite o email do candidato para verificar aprovação:");
                    String emailVerificacao = scanner.nextLine();
                    boolean aprovado = processoSeletivo.verificarAprovacao(emailVerificacao);
                    if (aprovado) {
                        System.out.println("O candidato foi aprovado!");
                    } else {
                        System.out.println("O candidato não foi aprovado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
