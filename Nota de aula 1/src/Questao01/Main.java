package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scNome = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.print("Digite seu nome: ");
        a.nome = scNome.nextLine();

        System.out.print("Digite sua primeira nota: ");
        a.nota1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        a.nota2 = sc.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        a.nota3 = sc.nextDouble();


        System.out.println("Olá " + a.nome);
        System.out.println("Sua média foi de: " + a.calcularMedia());


        if (a.media >= 7) {
            System.out.println("Você foi aprovado!");
        } else if (a.media < 4) {
            System.out.println("Você foi reprovado!");
        } else {
            System.out.println("Você está na final!");
        }
    }
}

