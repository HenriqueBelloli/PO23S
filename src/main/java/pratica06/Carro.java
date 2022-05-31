
package pratica06;

public class Carro extends Veiculo{
    private int NumeroDePortas;
    private int PotenciaMotor;

    public int getNumeroDePortas() {
        return NumeroDePortas;
    }

    public int getPotenciaMotor() {
        return PotenciaMotor;
    }

    public void setNumeroDePortas(int NumeroDePortas) {
        this.NumeroDePortas = NumeroDePortas;
    }

    public void setPotenciaMotor(int PotenciaMotor) {
        this.PotenciaMotor = PotenciaMotor;
    }
    
    public void printInformacoes(){
        System.out.println("Renavam: " + this.getRenavam() + ", Placa: " + this.getPlaca() + ", Cor: " + this.getCor() + ", NumeroDePortas: " + this.getNumeroDePortas() + ", PotenciaMotor: " + this.getPotenciaMotor());
    }
            
}
