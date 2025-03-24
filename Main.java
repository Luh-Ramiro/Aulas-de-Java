import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Controle de Produtos");
        Produto produto = null;

        boolean executando = true;
        while (executando) {
            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Vender Produto");
            System.out.println("3 - Adicionar Estoque");
            System.out.println("4 - Exibir Informações");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidade = scanner.nextInt();

                    produto = new Produto(nome, preco, quantidade);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado. Cadastre um produto primeiro!");
                        break;
                    }

                    System.out.print("Quantidade a vender: ");
                    int qtdVenda = scanner.nextInt();

                    if (produto.getQuantidade() >= qtdVenda) {
                        double total = produto.getPreco() * qtdVenda;
                        System.out.println("Selecione a forma de pagamento:");
                        System.out.println("1 - Pix");
                        System.out.println("2 - Espécie");
                        System.out.println("3 - Transferência");
                        System.out.println("4 - Débito");
                        System.out.println("5 - Crédito");
                        int pagamento = scanner.nextInt();

                        if (pagamento >= 1 && pagamento <= 4) {
                            total *= 0.95; // 5% de desconto
                            System.out.printf("Desconto aplicado! Total a pagar: R$%.2f\n", total);
                        } else if (pagamento == 5) {
                            System.out.printf("Parcelado em 3x sem juros. Valor das parcelas: R$%.2f\n", total / 3);
                        }

                        if (pagamento == 2) { // Caso pagamento em espécie
                            System.out.print("Informe o valor pago: ");
                            double valorPago = scanner.nextDouble();
                            if (valorPago >= total) {
                                System.out.printf("Troco: R$%.2f\n", valorPago - total);
                            } else {
                                System.out.println("Valor insuficiente!");
                                break;
                            }
                        }

                        produto.vender(qtdVenda);
                    } else {
                        System.out.println("Quantidade em estoque insuficiente.");
                    }
                    break;
                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado. Cadastre um produto primeiro!");
                        break;
                    }

                    System.out.print("Quantidade a adicionar ao estoque: ");
                    int qtdAdicionar = scanner.nextInt();
                    produto.adicionarEstoque(qtdAdicionar);
                    break;
                case 4:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado. Cadastre um produto primeiro!");
                        break;
                    }

                    produto.exibirInformacoes();
                    break;
                case 5:
                    executando = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
