public abstract class Funcionario {
    private String nome;
    private double salrio;
    private int RG;

    public Funcionario() {

    }

    public Funcionario(String nome, double salrio, int RG) {
        this.nome = nome;
        this.salrio = salrio;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalrio() {
        return salrio;
    }

    public abstract double calcularsalario(double valor);

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }



}