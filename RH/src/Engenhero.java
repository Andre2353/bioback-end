public class Engenhero extends Funcionario {
    private String numcrea;

    public Engenhero(){

    }
    public Engenhero(String nome, double salrio, int RG, String numcrea) {
        super(nome, salrio, RG);
        this.numcrea = numcrea;
    }

    public String getNumcrea() {
        return numcrea;
    }

    public void setNumcrea(String numcrea) {
        this.numcrea = numcrea;
    }

    @Override
    public double calcularsalario(double valor) {
        return valor -(valor * 0.27);
    }
}
