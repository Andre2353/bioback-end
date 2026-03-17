import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1-Mago  2-Guerreiro  3-Arqueiro");
        int escolha = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        Personagem jogador;

        switch (escolha) {
            case 1:
                jogador = new Mago(nome);
                break;
            case 2:
                jogador = new Guerreiro(nome);
                break;
            case 3:
                jogador = new Arqueiro(nome);
                break;
            default:
                jogador = new Guerreiro(nome);
        }

        Personagem inimigo = new Guerreiro("Inimigo");

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {

            System.out.println("\n1-Atacar  2-Habilidade");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    int dano = jogador.getAtaque();
                    inimigo.receberDano(dano);
                    System.out.println("⚔" +
                            "Você causou " + dano + " de dano!");
                    break;

                case 2:
                    if (jogador instanceof Mago) {
                        ((Mago) jogador).lancarMagia(inimigo);
                    } else if (jogador instanceof Guerreiro) {
                        ((Guerreiro) jogador).defender();
                    } else if (jogador instanceof Arqueiro) {
                        ((Arqueiro) jogador).esquivar();
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }


            if (inimigo.getVida() <= 0) break;

            // inimigo ataca
            int danoInimigo = inimigo.getAtaque();
            jogador.receberDano(danoInimigo);
            System.out.println(" Inimigo causou " + danoInimigo + " de dano!");

            System.out.println(" Sua vida: " + jogador.getVida());
            System.out.println(" Vida do inimigo: " + inimigo.getVida());
        }

        System.out.println(
                jogador.getVida() > 0 ? "\n Você venceu!" : "\n Você perdeu!"
        );


    }
}