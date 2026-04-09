public class ContaPJ extends Conta {

    public ContaPJ(double numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + 1.50;

        if (getSaldo() >= valorTotal) {
            setSaldo(getSaldo() - valorTotal);
            System.out.println("Saque de R$ " + valor + " (+ taxa de R$ 1.50) realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.0;
    }
}