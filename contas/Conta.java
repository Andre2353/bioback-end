public abstract class Conta {

    protected double numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    // Construtor
    public Conta(double numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public abstract double calcularTarifaMensal();

    // Getters e Setters
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}