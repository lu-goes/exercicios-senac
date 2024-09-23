import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Crie um sistema que leia o dia da semana (1-7) e informe o dia correspondente.

        String [] resposta = {
            "Domingo",
            "Segunda",
            "Terça",
            "Quarta",
            "Quinta",
            "Sexta",
            "Sábado"
        };

        System.out.println("Digite o dia (1-7): ");
        switch (sc.nextLine()) {
            case "1":
                System.out.println(resposta[0]);
                break;
            case "2":
                System.out.println(resposta[1]);
                break;
            case "3":
                System.out.println(resposta[2]);
                break;
            case "4":
                System.out.println(resposta[3]);
                break;
            case "5":
                System.out.println(resposta[4]);
                break;
            case "6":
                System.out.println(resposta[5]);
                break;
            case "7":
                System.out.println(resposta[6]);
                break;

            default:
                System.out.println("Número Inválido");
                break;
        };

        sc.close();
        return;

    }
}