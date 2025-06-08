import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do cartão de crédito:");
        String cardNumber = scanner.nextLine().replaceAll("\\s+", "");

        String brand = ValidadorBandeiraCartao.identificar(cardNumber);
        System.out.println("Bandeira identificada: " + brand);
    }
}