public class Pix implements meio_pag {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " aprovado no Pix");
        System.out.println("Chave Pix: " + chavePix);
    }
}