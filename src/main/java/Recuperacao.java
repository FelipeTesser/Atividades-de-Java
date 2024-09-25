import java.util.Scanner;

public class Recuperacao {
    public static void main(String[] args) {
        // Inicialização do scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Declaração de variáveis
        String nome;
        String turma;
        double[] notas = new double[4]; // Array para armazenar as notas dos 4 bimestres
        double media;
        String resultado;

        // Entrada do nome e turma do aluno
        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        
        System.out.print("Digite a turma do aluno: ");
        turma = scanner.nextLine();

        // Laço para lançamento das notas dos 4 bimestres
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo da média
        media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        // Decisão para determinar o resultado
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media < 6.9) {
            resultado = "Reprovado";
        } else {
            resultado = "Recuperação"; // Caso para média entre 6.9 e 7
        }

        // Saída dos resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Turma: " + turma);
        System.out.println("Notas por Bimestre:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Bimestre " + (i + 1) + ": " + notas[i]);
        }
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Resultado Final: " + resultado);
        
        // Fechando o scanner
        scanner.close();
    }
}

