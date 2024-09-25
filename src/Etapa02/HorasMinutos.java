package Etapa02;

import java.util.Scanner;

public class HorasMinutos {
    int minutos;

    // Construtor
    HorasMinutos(int minutos) {
        this.minutos = minutos;
    }

    // metodo para converter minutos em horas e minutos
    String conversao() {
        int horas = minutos / 60;  // Calcula o número de horas
        int minutosRestantes = minutos % 60; // Calcula os minutos restantes
        return horas + " hora(s) e " + minutosRestantes + " minutos";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");// pede que o usuário insira a quantidade de minutos

        int minutos = scanner.nextInt();

        HorasMinutos converter = new HorasMinutos(minutos);

        
        String resultado = converter.conversao(); // tras o metodo para conversão

        
        System.out.println(minutos + " minutos é igual a: " + resultado);// Exibe o resultado

        scanner.close();
    }
}
