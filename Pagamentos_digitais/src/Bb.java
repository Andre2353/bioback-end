public class Bb implements meio_pag{


    private String codigoBarras;
    private String dataVencimento;

    public Bb(String codigoBarras, String dataVencimento) {
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    public void processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " aprovado no Boleto Bancário");
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Data de vencimento: " + dataVencimento);
    }
}


