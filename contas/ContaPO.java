public class ContaPO extends Conta {

    public ContaPO(double numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0;
    }
}