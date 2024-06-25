import java.util.Scanner;

public class CalculaAreaTriangulo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a base do triângulo ao usuário
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        // Solicita a altura do triângulo ao usuário
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Calcula a área do triângulo
        double area = (base * altura) / 2;

        // Exibe a área do triângulo
        System.out.println("A área do triângulo é: " + area);

        // Fecha o scanner
        scanner.close();
    }
}
