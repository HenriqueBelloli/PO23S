package interfaces2;

public class Programa {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("apple", "iphone");
        Gerente g1 = new Gerente("joão", "123");
        Seguranca s1 = new Seguranca();
        
        AutenticadorDeUsuarios autenticador = new AutenticadorDeUsuarios();
        
        if (autenticador.autenticar(e1) == true){
            System.out.println("Carregando sistema...");
            //.....
        } else {
            System.out.println("Erro: login ou password inválidos!");
        }
        
    }
}
