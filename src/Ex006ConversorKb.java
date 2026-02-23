public class Ex006ConversorKb {

    public static void main(String[] args) {

        mostrarMegaBytesEKiloBytes(2500);

    }

    public static void mostrarMegaBytesEKiloBytes(int kiloBytes) {

        int restoKiloBytes = kiloBytes % 1024;
        int calculatedMegaBytes = kiloBytes / 1024;

        if (kiloBytes < 0) {
            System.out.println("Valor inválido");
        } else {
            System.out.println(kiloBytes + " KB = " + calculatedMegaBytes + " MB and " + restoKiloBytes + " KB");
        }
    }
}

/* Enunciado:

Escreva um método chamado printMegaBytesAndKiloBytes que tenha 1 parâmetro do tipo int com o nome kiloBytes.
O método não deve retornar nada (void) e precisa calcular os megabytes e os quilobytes restantes a partir do parâmetro kiloBytes.
Depois, ele deve imprimir uma mensagem no formato "XX KB = YY MB and ZZ KB".

XX representa o valor original de kiloBytes.
YY representa os megabytes calculados.
ZZ representa os quilobytes restantes calculados.

Por exemplo, quando o parâmetro kiloBytes for 2500, ele deve imprimir "2500 KB = 2 MB and 452 KB".
Se o parâmetro kiloBytes for menor que 0, então imprima o texto "Invalid Value".

EXEMPLO DE ENTRADA/SAÍDA

printMegaBytesAndKiloBytes(2500); → deve imprimir o seguinte texto: "2500 KB = 2 MB and 452 KB"

printMegaBytesAndKiloBytes(-1024); → deve imprimir o seguinte texto: "Invalid Value" porque o parâmetro é menor que 0.

printMegaBytesAndKiloBytes(5000); → deve imprimir o seguinte texto: "5000 KB = 4 MB and 904 KB"

DICA: Tenha extremo cuidado com os espaços na mensagem impressa.
DICA: Use o operador de resto (%).
DICA: 1 MB = 1024 KB.
OBSERVAÇÃO: Não altere o valor do parâmetro kiloBytes dentro do seu método.

Objetivo de aprendizagem: Aprender a realizar divisão inteira e operação de módulo em Java, convertendo quilobytes em megabytes e quilobytes restantes. */