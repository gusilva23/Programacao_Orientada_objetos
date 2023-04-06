import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somatorioSalarios = 0.0;
        double salario;
        double somatorioFilhos = 0.0;
        int numeroDeFilhos;
        int quantidadeHabitantes;
        int contador = 0;
        double maiorSalario = 0.0;

        System.out.println("Quantos habitantes há na cidade: ");
        quantidadeHabitantes = scanner.nextInt();

        while(contador < quantidadeHabitantes){
            System.out.println("Digite o salário do cidadão: ");
            salario = scanner.nextDouble();

            System.out.println("Digite o número de filhos do cidadão: ");
            numeroDeFilhos = scanner.nextInt();

            somatorioFilhos = somatorioFilhos + numeroDeFilhos;

            if(salario > maiorSalario){
                maiorSalario =  salario;
            }

            somatorioSalarios = somatorioSalarios + salario;
            contador ++;

        }
        double mediaSalarial = somatorioSalarios / quantidadeHabitantes;
        double mediaFilhos = somatorioFilhos / quantidadeHabitantes;

        System.out.println ("A média salarial da cidade é: " + mediaSalarial + "\n");
        System.out.println ("A média  de filhos por habitante é: " + mediaFilhos + "\n");
        System.out.println ("O maior salario é: " + maiorSalario);

    }
}