public class Ex014ConversorDeSegundosSobrecarregado {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationStrings(-65, 45));
        System.out.println(getDurationStrings(65, 145));
        System.out.println(getDurationStrings(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int segundos) {

        if (segundos < 0) {
            return "Valor inválido para segundos (" + segundos + "), número positivo necessário";
        }

        return getDurationStrings(segundos / 60, segundos % 60);
    }

    public static String getDurationStrings(int minutos, int segundos) {

        if (minutos < 0) {
            return "Valor inválido para minutos (" + minutos + "), número positivo necessário";
        }

        if ( segundos < 0 || segundos > 59) {
            return "Valor inválido para segundos (" + segundos + "), número entre 0 e 59 necessário";
        }

        int horas = minutos / 60;
        int restMinutos = minutos % 60;

        return horas + "h " + restMinutos + "m " + segundos + "s";
    }
}

/* Enunciado:

Neste desafio, vamos criar um método que recebe um tempo, representado em segundos, como parâmetro.

Depois, vamos transformar os segundos em horas.

Em seguida, você deverá exibir o tempo em horas, com os minutos e segundos restantes, em uma String.

Faremos essa transformação em duas etapas, o que nos permite usar sobrecarga de métodos (overloading).

Queremos criar dois métodos com o mesmo nome: getDurationString

O primeiro método deve ter um parâmetro do tipo int, chamado seconds.

O segundo método deve ter dois parâmetros, chamados minutes e seconds, ambos do tipo int.

Amos os métodos devem retornar uma String no seguinte formato:

"XXh YYm ZZs"

Onde:
XX representa o número de horas,
YY representa o número de minutos,
ZZ representa o número de segundos.

O primeiro método deve chamar o segundo método para retornar o resultado.

Adicione validação aos métodos como um bônus:

Para o primeiro método, o parâmetro seconds deve ser >= 0.

Para o segundo método, o parâmetro minutes deve ser >= 0, e o parâmetro seconds deve ser >= 0 e <= 59.

Se qualquer um dos métodos receber um valor inválido, imprima algum tipo de mensagem significativa para o usuário. */