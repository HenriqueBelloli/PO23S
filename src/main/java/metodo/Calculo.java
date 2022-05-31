package metodo;

public class Calculo {
    
    public static int quadrado(int numero){
        return numero * numero;
    }
    
    public static void main(String args[]){
        Calculo c1 = new Calculo();
        int resultado = c1.quadrado(4);
        System.out.println("Quadrado = " + resultado);
    }
    
}
