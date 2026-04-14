public class Pedido {
    private int id;
    private String cliente;
    private Status status;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.status = Status.AGUARDANDO_PAGAMENTO;
    }

    public void avancarStatus() {
        switch (this.status) {
            case AGUARDANDO_PAGAMENTO:
                this.status = Status.PROCESSANDO;
                break;
            case PROCESSANDO:
                this.status = Status.ENVIADO;
                break;
            case ENVIADO:
                this.status = Status.ENTREGUE;
                break;
            case ENTREGUE:
                System.out.println("Pedido já foi entregue");
                break;
            case CANCELADO:
                System.out.println("Pedido cancelado não pode avançar");
                break;
            default:
                System.out.println("Status inválido");
        }
    }

    public void cancelarPedido() {
        if (this.status == Status.ENTREGUE) {
            System.out.printf("não é possivel cancelar ja que ja foi entregue ");
        } else {
            this.status = Status.CANCELADO;
            System.out.printf("Pedido cancelado");

        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
