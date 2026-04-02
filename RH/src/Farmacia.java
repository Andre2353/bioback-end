public class Farmacia extends Funcionario{
 private String crf;

    public Farmacia(String nome, double salrio, int RG, String crf) {
        super(nome, salrio, RG);
        this.crf = crf;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }



    @Override
    public double calcularsalario(double valor) {
        return valor - (valor * 0.15);
    }
}
