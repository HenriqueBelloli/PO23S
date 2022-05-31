package colecoes;

import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList();
        
        animais.add("Cão");
        animais.add("Gato");
        animais.add("Coelho");
        animais.add("Girafa");
        animais.add("Leão");
        
        System.out.println("Indice 2 = " + animais.get(2));
        System.out.println("Size: " + animais.size());
        System.out.println("Tem Coelho? " + (animais.contains("Coelho") ? "sim" : "não") );
        System.out.println("Qual o indice da Girafa: " + animais.indexOf("Girafa"));
        animais.set( animais.indexOf("Girafa"), "Cobra" );
        System.out.println(animais);
        
        animais.remove("Cobra");
        for (int i=0; i<animais.size(); i++){
            System.out.println(animais.get(i));
        }
        
//        for (String item : animais){
//            System.out.println(item);
//        }

        System.out.println("A lista está vazia? " + animais.isEmpty());
        animais.clear();
        System.out.println("E agora? " + animais.isEmpty());
        System.out.println(animais);
        
    }
}