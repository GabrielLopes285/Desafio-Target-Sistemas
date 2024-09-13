package questao1;

public class Questao1 {
    public static int fibonacci (int tamanho){
        if (tamanho <= 1){
            return tamanho;
        }
        return fibonacci(tamanho - 1) + fibonacci(tamanho - 2);
    }

    public static int buscar (int numero){
        int resultado = 0;
        int posicao;
        System.out.println();
        for(posicao = 0; resultado < numero; posicao++){
            int fib = Questao1.fibonacci(posicao);
            resultado = fib;
            System.out.println(fib);
        }
        return resultado;
    }
}
