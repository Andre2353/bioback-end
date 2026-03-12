public class Torta extends Doce {

    public Torta(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void Massa() {
        System.out.println("massa fina ");
    }
}
