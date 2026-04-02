public abstract class Conta {
    private double numero;
    private String agencia;
    private String titular;
    protected double saldo;

    // construtor
    public Conta(double numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular; // corrigido
        this.saldo = saldo;
    }

    // métodos
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito R$ " + valor + " realizado");
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("O saque R$ " + valor + " foi realizado com êxito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo atual é R$ " + saldo);
    }

    public abstract double calcularTarifaMensal();

    // getters e setters
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