public class Ex003CalculadoraPontuacao {

    public static void main(String[] args) {

        int highScore = calcularPontuacao(true, 800, 5, 100);
        System.out.println("A pontuação é " + highScore);

        System.out.println("A próxima pontuação é " +
                calcularPontuacao(true, 10000, 8, 200));
    }

    public static int calcularPontuacao(boolean gameOver, int pontuacao, int nivelCompleto, int bonus) {

        int pontuacaoFinal = pontuacao;

        if (gameOver) {
            pontuacaoFinal += (nivelCompleto * bonus);
            pontuacaoFinal += 1000;
        }

        return pontuacaoFinal;
    }
}

/* Exercício feito com a finalidade de familiarização de métodos e da função return. */