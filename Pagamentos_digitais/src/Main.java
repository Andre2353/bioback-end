import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a sua forma de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Boleto Bancário");
        System.out.println("3 - Pix");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        System.out.print("Digite o valor do pagamento: ");
        double valor = scanner.nextDouble();

        meio_pag pagamento = null;

        if (opcao == 1) {
            pagamento = new Cc("1234", "12/28", "123");
        } else if (opcao == 2) {
            pagamento = new Bb("123456", "2025-12-31");
        } else if (opcao == 3) {
            pagamento = new Pix("email@email.com");
        } else {
            System.out.println("Opção inválida");
            scanner.close();
            return;
        }

        System.out.println();
        pagamento.processar(valor);

        scanner.close();
    }
}