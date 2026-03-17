public class Arqueiro extends Personagem {

    private boolean esquiva = false;

    public Arqueiro(String nome) {
        super(nome, 90, 12);
    }

    public void esquivar() {
        esquiva = true;
        System.out.println("🏹 Esquivando! Pode evitar o próximo ataque.");
    }

    @Override
    public void receberDano(int dano) {
        if (esquiva) {
            System.out.println(" Ataque esquivado!");
            esquiva = false;
            return;
        }
        super.receberDano(dano);
    }
}