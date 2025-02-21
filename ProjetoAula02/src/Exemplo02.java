import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
    do {
        System.out.println("Qual nome do aluno?");
        String nome = sc2.nextLine();

        System.out.println("Qual a sua idade?");
        int x = sc.nextInt();

        System.out.println("Qual a mensalidade?");
        double mensalidade = sc.nextDouble();

        System.out.println("Para ver novamente, digite S");
        r = sc.next();


    }while(r.equalsIgnoreCase("S"));



    }

}
