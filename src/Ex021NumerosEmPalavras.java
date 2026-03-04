public class Ex021NumerosEmPalavras {

    public static void main(String[] args) {

        printNumberInWord(-1);

    }

    public static void printNumberInWord(int number) {

        String tester = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> {
                String badResponse = "OTHER";
                yield badResponse;
            }
        };
        System.out.println(tester);
    }
}

/* Enunciado:

Escreva um método chamado printNumberInWord.
O método tem um parâmetro chamado number, que é um número inteiro.
O método precisa imprimir "ZERO", "ONE", "TWO", ... "NINE", "OTHER" se o parâmetro inteiro number for 0, 1, 2, ... 9 ou "OTHER" para qualquer outro número, incluindo números negativos.
Você pode usar a estrutura if-else ou switch, o que for mais fácil para você.

Objetivo de aprendizagem:
Criar um método robusto que converta valores numéricos em seus equivalentes por extenso para aprimorar a compreensão do mapeamento entre números e palavras. */
