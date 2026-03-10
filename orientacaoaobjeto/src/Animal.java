public class Animal {
    private String Nome;
    private String cor;
    private String peso;

    public Animal(String nome, String cor, String peso) {
        Nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
    public void Fazersom() {
        System.out.println("o son é : ");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
