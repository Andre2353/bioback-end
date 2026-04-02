public class pj extends Conta{
    public pj(double numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }
    @Override
    public void Sacar(double valor){
        valor = valor - 1.50;
        if ( getSaldo() >=valor){
            setSaldo(getSaldo()- valor);
            System.out.println("o saque "+valor+"foi realizado com exito");
        }else {
            System.out.println("saldo insuficiente");
        }
    }

    @Override
    public double Calculartarifamensal() {
        return 20 ;
    }
}
