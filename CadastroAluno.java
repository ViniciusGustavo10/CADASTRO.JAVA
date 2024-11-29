import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {
    private ArrayList<Aluno> alunos;

    // Construtor
    public CadastroAluno() {
        this.alunos = new ArrayList<>();
    }

    // Método para cadastrar um aluno
    public void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após o próximoInt()

        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();

        // Criar objeto Aluno e adicionar à lista
        Aluno aluno = new Aluno(nome, idade, matricula);
        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Método para exibir todos os alunos cadastrados
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Alunos cadastrados:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastro.cadastrarAluno();
                    break;
                case 2:
                    cadastro.listarAlunos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
