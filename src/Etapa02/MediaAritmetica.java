package Etapa02;

public class MediaAritmetica {
    int a;
    int b;
    int c;

    // Construtor da classe
    MediaAritmetica(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular a media
    double calcularMedia() {
        return (a + b + c) / 3; 
    }

    public static void main(String[] args) {
        
        MediaAritmetica numeros = new MediaAritmetica(70, 70, 70);

        // calcula a média
        double media = numeros.calcularMedia();

        // mostra a média dos tres numeros
        System.out.println("A média é: " + media);
    }
}
