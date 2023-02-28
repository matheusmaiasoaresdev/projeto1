package Exercicios.somas;

import java.util.Scanner;

public class ExSomaDeInteirosMain {
    public static void main(String[] args) {
// Variaveis mais usadas Strings e Integer(int)
        //criei as variaveis de numeros e de resultado
        int num1;
        int num2;
        int resultado;
        //criei scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        num2 = scanner.nextInt();

        resultado = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+resultado);

    }
}