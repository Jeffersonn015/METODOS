package Etapa02;

public class positivoOuNegativo {
    int numero;

    // Construtor
    positivoOuNegativo(int numero) {
        this.numero = numero;
    }

    // metodo para verificar se o número é positivo ou negativo
    String verificaronumero() {
        if (numero >= 0) {
            return "O número " + numero + " é POSITIVO!";
        } else {
            return "O número " + numero + " é NEGATIVO!";
        }
    }

    public static void main(String[] args) {
        // objeto
        positivoOuNegativo numero = new positivoOuNegativo(15);

        // Exibe o resultado do metodo
        System.out.println(numero.verificaronumero());
    }
}
