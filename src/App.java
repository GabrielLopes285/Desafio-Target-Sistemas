import java.util.*;
import menu.Menu;
import static questao1.Questao1.buscar;
import questao2.Questao2;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            Boolean loop = true;

            while (loop) {
                int selecao = -1;
                
                Menu.index();
                
                while (selecao < 0 || selecao > 2) {
                    selecao = Menu.inputNumPositivo(input);
                }
                System.out.println();
                
                switch (selecao) {
                    
                    case 0 -> loop = false;
                    
                    case 1 -> {
                        System.out.println("Escolha um número");
                        int numero = Menu.inputNumPositivo(input);
                        int resultado = buscar(numero);
                        System.out.println();
                        if(resultado == numero){
                            System.out.println("Número pertence a sequência!");
                        }else{
                            System.out.println("Número não pertence a sequência...");
                        }
                        Menu.voltar(input);
                    }
                    
                    case 2 -> {
                        System.out.println("Digite uma frase");
                        System.out.print("Frase:");
                        String frase = input.nextLine();
                        int instancias = Questao2.letra(frase);
                        System.out.println();
                        System.out.println("A letra 'A' ocorre " + instancias + " vezes na frase");
                        Menu.voltar(input);
                    }
                    
                    default -> {
                    }
                }
            }
            input.close();
        }
    }
}

