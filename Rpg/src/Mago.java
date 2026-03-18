public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 15);
    }

    public Mago(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    public void lancarMagia(Personagem inimigo) {
        int dano = this.ataque * 2;
        inimigo.receberDano(dano);
        System.out.println(" Magia de raio causou " + dano + " de dano!");
    }
}
