package pratica07_01;

public class DetalheVeiculos {
    private Veiculo veiculos[];

    public DetalheVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }
    
    void printVeiculos(){

        for(int i = 0; i < veiculos.length; i++){
           
            if (veiculos[i] instanceof Carro){
                System.out.println("Carro: " + veiculos[i].getPlaca() + " - " + veiculos[i].getCor() + " - " + ((Carro) veiculos[i]).getRodas());
            }else{
                System.out.println("Moto: " + veiculos[i].getPlaca() + " - " + veiculos[i].getCor() + " - " + ((Moto) veiculos[i]).getRodas());
            }
            
        }
    }
}
