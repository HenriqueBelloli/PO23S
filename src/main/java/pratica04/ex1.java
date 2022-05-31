/*
Defina um método estático (static) chamado maior que receba quatro valores numéricos e retorne o maior deles.
 */
package pratica04;

public class ex1 {

    public static void main(String[] args) {
        double n = maior(1, 2, 3, 4);
        System.out.printf("%.1f", n);  
    }
    
    public static double maior(double v1, double v2, double v3, double v4){
        double maior = v1;
        
        if (v2 > maior){
            maior = v2;
        }
        
        if (v3 > maior){
            maior = v3;
        }
        
        if (v4 > maior){
            maior = v4;
        }
        
        return maior;
    }
}
