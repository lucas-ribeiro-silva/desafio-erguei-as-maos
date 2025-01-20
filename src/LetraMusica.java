import java.util.Scanner;

public class LetraMusica {

    // Função para gerar as repetições incrementais dos animaizinhos
    public static String gerarAnimaisIncremental() {
        StringBuilder letra = new StringBuilder();

        // Definindo os animais e partes da música
        String[] animais = {"O elefante", "A minhoquinha", "O canguru", "Deus disse a Noé"};
        String[] animais2 = {"E os passarinhos", "E os pinguins", "E o sapinho", "Deus disse a Noé"};

        for (int i = 0; i < animais.length; i++) {
            // Adiciona as partes incrementais
            letra.append("Os animaizinhos subiram de dois em dois\n");
            letra.append("Os animaizinhos subiram de dois em dois\n");
            letra.append(animais[i] + "\n");
            letra.append(animais2[i] + ", como os filhos do Senhor\n\n");
        }

        return letra.toString();
    }

    // Função para gerar a parte dos movimentos incrementais (braços, pernas, etc.)
    public static String gerarMovimentosIncremental() {
        StringBuilder letra = new StringBuilder();

        // Movimentos incrementais
        String[] movimentos = {
                "Braço direito",
                "Braço direito, braço esquerdo",
                "Braço direito, braço esquerdo\nPerna direita",
                "Braço direito, braço esquerdo\nPerna direita, perna esquerda",
                "Balança a cabeça",
                "Balança a cabeça, dá uma voltinha",
                "Balança a cabeça, dá uma voltinha\nDá um pulinho",
                "Balança a cabeça, dá uma voltinha\nDá um pulinho e abraça o irmão"
        };

        for (String movimento : movimentos) {
            letra.append("O senhor tem muitos filhos\n");
            letra.append("Muitos filhos ele tem\n");
            letra.append("Eu sou um deles, você também\n");
            letra.append("Louvemos ao senhor\n\n");
            letra.append(movimento + "\n\n");
        }

        return letra.toString();
    }

    // Função para gerar a parte do "Erguei as mãos"
    public static String gerarErgueiAsMaos() {
        return "Erguei as mãos e dai glória a Deus\n" +
                "Erguei as mãos e dai glória a Deus\n" +
                "Erguei as mãos\n" +
                "E cantai como os filhos do Senhor\n";
    }

    // Função para limpar o terminal
    public static void limparTerminal() {
        String sistemaOperacional = System.getProperty("os.name").toLowerCase();

        try {
            if (sistemaOperacional.contains("win")) {
                // Para sistemas Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para sistemas Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao tentar limpar o terminal.");
        }
    }

    public static void main(String[] args) {
        // Frase de separação
        String separador = "E atenção agora, porque\n";

        // Usando o Scanner para ler a escolha do usuário
        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
            // Apresentando opções ao usuário
            System.out.println("Escolha o que deseja ouvir:");
            System.out.println("1 - Ouvir a música inteira");
            System.out.println("2 - Ouvir apenas a primeira parte");
            System.out.println("3 - Ouvir apenas a segunda parte");
            System.out.println("4 - Limpar o terminal");
            System.out.println("0 - Sair");

            // Lendo a escolha do usuário
            escolha = scanner.nextInt();

            // Com base na escolha do usuário, exibe a música correspondente
            switch (escolha) {
                case 1:
                    // Exibe a música inteira
                    System.out.println(gerarErgueiAsMaos());
                    System.out.println(gerarAnimaisIncremental());
                    System.out.println(separador);
                    System.out.println(gerarMovimentosIncremental());
                    break;
                case 2:
                    // Exibe apenas a primeira parte
                    System.out.println(gerarErgueiAsMaos());
                    System.out.println(gerarAnimaisIncremental());
                    break;
                case 3:
                    // Exibe apenas a segunda parte
                    System.out.println(separador);
                    System.out.println(gerarMovimentosIncremental());
                    break;
                case 4:
                    // Limpa o terminal
                    limparTerminal();
                    break;
                case 0:
                    // Sair do loop
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida! Por favor, escolha uma opção entre 0, 1, 2, 3 ou 4.");
                    break;
            }

        } while (escolha != 0); // O loop continua até o usuário escolher "0" para sair.

        // Fechar o scanner
        scanner.close();
    }
}
