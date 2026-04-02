public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 70, 25);
    }

    public Mago(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    public void lancarMagia(Personagem inimigo) {
        int dano = this.ataque * 3;
        inimigo.receberDano(dano);

        System.out.println(" A Bola de fogo causou " + dano + " de dano!");

    }
}
