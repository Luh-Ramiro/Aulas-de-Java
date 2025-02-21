import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
do {
    System.out.println("1 feijao, 2 blusa, 3 aten");
    int x = sc.nextInt();
    switch (x) {
        case 1:
            System.out.println("Ótima escolha! comprou feijao kkkk");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$ 2,00");
                    break;
                case 3:
                    System.out.println("Falar com atendente");
                    break;
                default:
                    System.out.println("Opção inválido");
                    break;
            }
            System.out.println("Para ver novamente, digite S");
            r = sc.next();
            }while(r.equalsIgnoreCase("S"));

    }
}
