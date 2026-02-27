public class Ex015ConversorDeArea {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));

    }

    public static double area(double raio) {

        double areaCirculo = 3.14159 * (raio * raio);
        if (raio < 0) {
            return -1.0;
        }

        return areaCirculo;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}

/* Enunciado:

Escreva um método chamado area com um parâmetro do tipo double chamado raio.

O método precisa retornar um valor do tipo double que represente a área de um círculo.

Se o parâmetro radius for negativo, então retorne -1.0 para representar um valor inválido.

Escreva outro método sobrecarregado (overloaded) com 2 parâmetros x e y (ambos double), onde x e y representam os lados de um retângulo.

O método precisa retornar a área de um retângulo.

Se um ou ambos os parâmetros forem negativos, retorne -1.0 para indicar um valor inválido.

Para as fórmulas e o valor de PI, verifique as dicas abaixo.

Exemplos de entrada/saída:

area(5.0); deve retornar 78.53981633974483 ou 78.53981

area(-1); deve retornar -1, pois o parâmetro é negativo

area(5.0, 4.0); deve retornar 20.0 (5 * 4 = 20)

area(-1.0, 4.0); deve retornar -1, pois o primeiro parâmetro é negativo

Objetivo de aprendizado: Reforçar sobrecarga de métodos (method overloading) e cálculos geométricos escrevendo métodos que calculam a área de círculos e retângulos com validação de entrada. */