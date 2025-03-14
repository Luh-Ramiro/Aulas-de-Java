import javax.swing.plaf.PanelUI;

public class Pessoa {
    private double peso, altura;
    public double imc;

    public void setPeso(double peso){
       this.peso =  peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;

    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double calculeIMC() {
        imc = peso / (altura * altura);
        return imc;



    }
}
