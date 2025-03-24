public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void vender(int qtd) {
        if (quantidade >= qtd) {
            quantidade -= qtd;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
        System.out.println("Estoque atualizado!");
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
