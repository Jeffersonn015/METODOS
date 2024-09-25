package Etapa02;

public class Fatorial {
    int numero;

    // Construtor da classe Fatorial
    Fatorial(int numero) {
        this.numero = numero;
    }

    // metodo para calcular o fatorial
    int calcularFatorial() {
        if (numero < 0) { // verificar se o numero é negativo
            System.out.println("O fatorial não é permitido para numeros negativos!!!");
            return -1; // no caso de erro retorna -1
        }

        int fatorial = 1; // inicializa
        //loop para calcular o fatorial
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // muplica o fatorial
        }
        return fatorial; // aqui vai retornar o resultado da faatorial
    }

    public static void main(String[] args) { 

        Fatorial fatorial = new Fatorial(5);

        int resultado = fatorial.calcularFatorial(); // chama o metodo

        if (resultado != -1) {
        	System.out.println("O fatorial de " + fatorial.numero + " é: " + resultado); // mostra o resultado se der certo
        }
    }
}
