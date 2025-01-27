import java.util.Scanner;

public class desafio2 {

    /**
     * Verifica se uma palavra ou frase é um palíndromo.
     * String -> boolean
     */
    public static boolean eh_palindromo(String texto) {
        if (texto != null) {
            String tratado = texto.replaceAll("\\s+", "").toLowerCase();
            String invertido = new StringBuilder(tratado).reverse().toString();
            return tratado.equals(invertido);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao verificador de palíndromos!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma palavra ou frase: ");
            String frase = scanner.nextLine();
            if (frase.equalsIgnoreCase("sair")) {
                break;
            }
            if (eh_palindromo(frase)) {
                System.out.println("'" + frase + "' é um palíndromo.");
            } else {
                System.out.println("'" + frase + "' não é um palíndromo.");
            }
        }

        System.out.println("Obrigado por usar o verificador de palíndromos!");
        scanner.close();
    }
}
