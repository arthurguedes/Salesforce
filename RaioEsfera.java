import java.util.Scanner;

public class RaioEsfera {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a base do triângulo ao usuário
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        // Solicita a altura do triângulo ao usuário
        //System.out.print("Digite a altura do triângulo: ");
        //double pi = 3.14;

        // Calcula a área do triângulo
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);;

        // Exibe a área do triângulo
        System.out.println("O volume da esfera é: " + volume);

        // Fecha o scanner
        scanner.close();
    }
}
