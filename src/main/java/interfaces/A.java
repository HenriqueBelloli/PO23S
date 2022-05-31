package interfaces;

public class A implements MinhaPrimeiraInterface {
    private String nomeInterno;
    @Override
    public void m1() {

    }
    @Override
    public void m2(String nome) {
        nomeInterno = nome;
    }
    @Override
    public String m3() {
        return nomeInterno;
    }
    
    public int m4(int num){
        return num * 3;
    }
}