package metodo;

public class Vetor {
    
    static double pi = 3.141579;
    
    public static int menor(int v[]){
        int me = v[0];
        for (int i=1; i<v.length; i++){
            if (v[i] < me){
                me = v[i];
            }
        }
        return me;
    }
    
    public static void main(String[] args) {
        int vetor[] = new int[5];
        vetor[0] = 34;
        vetor[1] = 4;
        vetor[2] = 14;
        vetor[3] = 567;
        vetor[4] = 3;
        System.out.println("Menor = " + menor(vetor));
    } 
    
}
