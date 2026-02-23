public class Ex004CalculadoraPosicao {

    public static void main(String[] args) {

        int posicaoJogador = calcularPosicao(1500);
        mostrarPosicao("Peter", posicaoJogador);

        posicaoJogador = calcularPosicao(1000);
        mostrarPosicao("Jorge", posicaoJogador);

        posicaoJogador = calcularPosicao(500);
        mostrarPosicao("Nyx", posicaoJogador);

    }

    public static void mostrarPosicao(String nomeJogador, int posicaoJogador) {
        System.out.println(nomeJogador + " conseguiu ficar na posição " + posicaoJogador);

    }

    public static int calcularPosicao(int pontuacaoJogador) {

        int posicao = 4;

        if (pontuacaoJogador >= 1000) {
            posicao = 1;
            
        } else if (pontuacaoJogador >= 500) {
            posicao = 2;
            
        } else if (pontuacaoJogador >= 100) {
            posicao = 3;

        } return posicao;

    }
}

/* Enunciado:

Neste desafio, vamos criar dois métodos:

O primeiro método deve se chamar displayHighScorePosition.

Este método deve ter dois parâmetros: um para o nome do jogador e outro para a posição do jogador em uma lista de pontuações altas (high score).

Este método deve imprimir uma mensagem como:  "Peter conseguiu chegar à posição 2 na lista de pontuações altas."

O segundo método deve se chamar calculateHighScorePosition.

Este método deve ter apenas um parâmetro: a pontuação do jogador.

Este método deve retornar um número entre 1 e 4, com base nos valores de pontuação mostrados nesta tabela:

Pontuação maior ou igual a 1000 = 1

Pontuação maior ou igual a 500 e menor que 1000 = 2

Pontuação maior ou igual a 100 e menor que 500 = 3

Todas as outras pontuações = 4

Por fim, vamos chamar ambos os métodos e exibir os resultados para as seguintes pontuações: 1500, 1000, 500 e 25. */