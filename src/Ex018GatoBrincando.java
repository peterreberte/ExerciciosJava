public class Ex018GatoBrincando {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 45));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        }
        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }
}

/* Enunciado:

Os gatos passam a maior parte do dia brincando. Em particular, eles brincam se a temperatura estiver entre 25 e 35 (inclusive).
A menos que seja verão, nesse caso o limite superior passa a ser 45 (inclusive) em vez de 35.

Escreva um método chamado isCatPlaying que tenha 2 parâmetros. O método precisa retornar true se o gato estiver brincando, caso contrário deve retornar false.

O primeiro parâmetro deve ser do tipo boolean e se chamar summer; ele representa se é verão.

O segundo parâmetro representa a temperatura e deve ser do tipo int com o nome temperature.

EXEMPLOS DE ENTRADA/SAÍDA:

isCatPlaying(true, 10); deve retornar false, pois a temperatura não está no intervalo de 25 a 45.

isCatPlaying(false, 36); deve retornar false, pois a temperatura não está no intervalo de 25 a 35 (já que summer é false).

isCatPlaying(false, 35); deve retornar true, pois a temperatura está no intervalo de 25 a 35.

Objetivo de aprendizado:
Praticar verificações condicionais mais avançadas determinando se um gato está brincando, levando em consideração faixas de temperatura diferentes dependendo da estação e respeitando limites inclusivos. */
