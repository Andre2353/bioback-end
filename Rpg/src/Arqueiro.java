import java.util.Random;

public class Arqueiro extends Personagem {

    Random random = new Random();

    public Arqueiro(String nome) {
        super(nome, 90, 22);
    }


    public void tiro_certeiro(Personagem inimigo) {
        int dano = this.getAtaque();
        int chance = random.nextInt();

        if (chance < 70) {
            dano *= 3;
            System.out.println("atingido");
        }

        inimigo.receberDano(dano);
        System.out.println("Você causou " + dano + " de dano!");
    }
}
