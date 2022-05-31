
package pratica09;

public class MinhaClasse implements MinhaInterface{
    private String frase;

    @Override
    public void concatenar(String s) {
        this.frase += s;
    }

    @Override
    public int tamanho() {
        return this.frase.length();
    }

    @Override
    public String getFrase() {
        return this.frase;
    }

    @Override
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
}
