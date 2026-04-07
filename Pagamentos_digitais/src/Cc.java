public class Cc implements meio_pag {
    private String numeroCartao;
    private String validade;
    private String cvv;

    public Cc(String numeroCartao, String validade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
    }

    public void processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " aprovado no Cartão de Crédito");
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Validade: " + validade);
        System.out.println("CVV: " + cvv);
    }
}
