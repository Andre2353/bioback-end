public class Guerreiro extends Personagem {

    private boolean defendendo = false;

    public Guerreiro(String nome) {
        super(nome, 120, 10);
    }

    public void defender() {
        defendendo = true;
        System.out.println("Defendendo! Próximo dano será reduzido.");
    }

    @Override
    public void receberDano(int dano) {
        if (defendendo) {
            dano /= 2;
            defendendo = false;
            System.out.println("Dano reduzido para " + dano);
        }
        super.receberDano(dano);
    }
}