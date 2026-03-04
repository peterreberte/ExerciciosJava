public class Ex020DiaDaSemana {

    public static void main(String[] args) {

        mostrarDiaDaSemana(7);
        diaSemana(7);

    }

    public static void mostrarDiaDaSemana(int dia) {

        String diaDaSemana =
                switch (dia) {
                    case 0 -> "Domingo";
                    case 1 -> "Segunda";
                    case 2 -> "Terça";
                    case 3 -> "Quarta";
                    case 4 -> "Quinta";
                    case 5 -> "Sexta";
                    case 6 -> "Sábado";
                    default -> {
                        String badResponse = dia + " é inválido, tente um número de 0 a 6";
                        yield badResponse;
                    }
                };
        System.out.println(diaDaSemana);
    }

    public static void diaSemana(int dia) {

        if (dia == 0) {
            System.out.println("Domingo");
        } else if (dia == 1) {
            System.out.println("Segunda");
        } else if (dia == 2) {
            System.out.println("Terça");
        } else if (dia == 3) {
            System.out.println("Quarta");
        } else if (dia == 4) {
            System.out.println("Quinta");
        } else if (dia == 5) {
            System.out.println("Sexta");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else {
            System.out.println(dia + " é inválido, tente um número de 0 a 6");
        }
    }
}

/* Objetivo de aprendizagem: Introduzir à função switch melhorada (Java 14+) */
