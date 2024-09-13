package menu;

import java.util.Scanner;

public class Menu {
    public static void index(){
        System.out.println("Desafio Target - Gabriel Lopes");
        System.out.println();

        System.out.println("0- Sair");
        System.out.println("1- Encontrar numero na sequencia fibonacci");
        System.out.println("2- Encontrar letra A");
        System.out.println();
        System.out.println("Respostas de questões que não requerem código disponíveis em 'Respostas.txt'");
        System.out.println();
    }

    public static void voltar(Scanner input){
        System.out.println();
        System.out.println("Pressione enter para voltar");
        input.nextLine();
    }

    public static int inputNumPositivo (Scanner input){
        int Num = -1;
        String valor;

        do {
            System.out.print("Numero: ");
            valor = input.nextLine();
            try {
                Num = Integer.parseInt(valor);
            } catch (NumberFormatException exp) {}
        } while (Num < 0);

        return Num;
    }

    public static String inputString(Scanner input){
        String palavra = "";

        while (palavra.length() < 0){
            System.out.print("Palavra: ");
            palavra = input.nextLine();
        }
        return palavra;
    }
}
