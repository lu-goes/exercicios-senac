import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
    
        //Crie um sistema que leia a temperatura e faça a conversão para:
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();
        double fahrenheit = (temperatura * 9/5) + 32;
        double celsius = (temperatura - 32) * 5/9;

        System.out.println("A temperatura em Celsius é: " + celsius);
        System.out.println("A temperatura em fahrenheit é:" + fahrenheit);
        
        sc.close();
        return;

    }
}