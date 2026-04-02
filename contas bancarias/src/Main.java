public class Main {
    public static void main(String[] args) {

        // Criando contas
        Conta cc = new ContaCC(1, "001", "João", 1000);
        Conta cp = new po(2, "001", "Maria", 1000);
        Conta pj = new pj(3, "001", "Empresa X", 1000);

        // Conta Corrente
        cc.depositar(200);
        cc.sacar(100);
        cc.exibirSaldo();
        System.out.println("Tarifa mensal: R$ " + cc.calcularTarifaMensal());

        System.out.println("---------------------");

        // Conta Poupança
        cp.depositar(200);
        cp.sacar(100);
        cp.exibirSaldo();
        System.out.println("Tarifa mensal: R$ " + cp.calcularTarifaMensal());

        System.out.println("---------------------");

        // Conta PJ
        pj.depositar(200);
        pj.sacar(100);
        pj.exibirSaldo();
        System.out.println("Tarifa mensal: R$ " + pj.calcularTarifaMensal());
    }
}