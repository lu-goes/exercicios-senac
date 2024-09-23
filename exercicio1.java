import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
       // Calcule a média das duas notas de um estudante.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota:");
        double nota2 = sc.nextDouble();

        double media = (nota1 +  nota2)/2;
        System.out.println("Sua média é: " + media);

        sc.close();
        return;
    }
}