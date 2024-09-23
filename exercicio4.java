import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
    
        // Desenvolva um programa em Java para classificar times de futebol pelos estados do Brasil. Exemplo: Time do São Paulo → Estado de São Paulo

        String[] resposta = {

            "Estado de São Paulo",
            "Estado do Rio de Janeiro",            
        };

        System.out.println("Digite um time: ");
        switch (sc.nextLine()) {
            case "São Paulo":
                System.out.println(resposta[0]);
                break;
            case "Palmeiras":
                System.out.println(resposta[0]);
                break;
            case "Corinthians":
                System.out.println(resposta[0]);
                break;

            case "Flamengo":
                System.out.println(resposta[1]);
                break;
            case "Fluminense":
                System.out.println(resposta[1]);
                break;
            case "Bota Fogo":
                System.out.println(resposta[1]);
                break;

            default:
                System.out.println("Inválido");
                break;
        };

        sc.close();
        return;

    }   
    
}
