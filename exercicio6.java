import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        // Desenvolva um sistema que leia a quantidade de produtos e o valor unitário, retornando o valor total.

        Scanner sc = new Scanner(System.in);

        double valor = 0;
        double quantidade = 0;

        System.out.println("Digite a quantidade do produto: ");
        quantidade = sc.nextDouble();
        System.out.println("Digite o valor do produto: ");
        valor = sc.nextDouble();
        
        double valorTotal = valor*quantidade;
        System.out.println("O valor total é de: " + valorTotal);

        sc.close();
        return;


    }

}