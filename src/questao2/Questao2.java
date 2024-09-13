package questao2;

public class Questao2 {
    public static int letra (String input){

        int instancias = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++){
            char caractere = input.charAt(i);  
            System.out.println(caractere);      
            if(Character.compare(caractere, 'a') == 0){
                instancias += 1;
            }
        }
        return instancias;
        
    }
}
