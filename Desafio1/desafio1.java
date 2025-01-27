import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio1 {

    public static void adicionarAluno(String nome, List<String> listaAlunos) {
        String nomeFormatado = formatarNome(nome);
        if (listaAlunos.contains(nomeFormatado)) {
            System.out.println("Aluno já está na lista.");
        } else {
            listaAlunos.add(nomeFormatado);
        }
    }

    public static String formatarNome(String nome) {
        String[] palavras = nome.toLowerCase().split(" ");
        StringBuilder nomeFormatado = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {
            if (i == 0 || palavras[i].length() > 3) {
                nomeFormatado.append(Character.toUpperCase(palavras[i].charAt(0)))
                             .append(palavras[i].substring(1));
            } else {
                nomeFormatado.append(palavras[i]);
            }
            if (i < palavras.length - 1) {
                nomeFormatado.append(" ");
            }
        }

        return nomeFormatado.toString();
    }

    public static void exibirLista(List<String> listaAlunos) {
        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println((i + 1) + ". " + listaAlunos.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> listaAlunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }
                adicionarAluno(nome, listaAlunos);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
            }
        }

        exibirLista(listaAlunos);
        scanner.close();
    }
}