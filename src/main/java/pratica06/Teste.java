
package pratica06;

public class Teste {
    
    Pessoa p1 = new Cliente("José", "Rua Centro", 1000.0);
    Pessoa p2 = new Funcionario("Maria", "Rua Principal", 3500.0);
    Pessoa p3 = new Dependente("Pedro", "Rua Principal", 9);
    Pessoa p4 = new Gerente("Carlos", "Rua Alfreda", 12000.0, "Vendas");

    Cliente c = (Cliente) p1;
    Funcionario f = (Funcionario) p2;
    Dependente d = (Dependente) p3;
    Gerente g = (Gerente) p4;
    
    //System.out.println(c.getLimiteCompra());
    //System.out.println(f.getSalario());
    //System.out.println(d.getIdade());
    //System.out.println(g.getDepartamento());
    }
