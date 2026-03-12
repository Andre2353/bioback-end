public class Doce {
    private String nome;
    private String cor ;
    private double peso;

    public Doce(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }


    public  void Cobertura() {
        System.out.println("cobertura de morango");
    }

    public void Massa () {
        System.out.println("massa fina de Leito ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
