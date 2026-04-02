public class ContaCC extends Conta {

    public ContaCC(double numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        return 12.0;
    }
}