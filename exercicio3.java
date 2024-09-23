import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //4) Desenvolva um programa em Java que verifique se uma pessoa é maior ou menor de idade, ainda se já é idoso ou não.

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 ) {
           if(idade >= 65){
               System.out.println("Você é idoso(a)");
            }
            else{
                System.out.println("Você é maior de idade");
        }
            sc.close();
            return;
        }else{
            System.out.println("Você é menor de idade");
            
        };

        sc.close();
        return;

    }
}     