package pratica07_02;

public class Teste {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("joao", "123", 12000, 3000);
        Autenticador autenticador = new Autenticador();
        if (autenticador.autenticar(g1, false)) {
            System.out.println("Usuário autenticado!");
        } else {
            System.out.println("Login ou password incorretos!");
        }

        float f1 = 10f;
            double d1 = 20;
            long l1 = 10;
            d1 = f1;
            
                    f1 = l1;
        	
Gerente g2 = new Gerente("joao", "aaa", 12000, 3000);
if (autenticador.autenticar(g2, true)){
    System.out.println("Usuário autenticado!");
} else {
    System.out.println("Login ou password incorretos!");
}
    }
}
