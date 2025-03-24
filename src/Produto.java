public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void alterarPreco(double novoPreco){
        this.preco = novoPreco;
    }
    public void alterarQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    }
    public void Informacoes() {
        System.out.println("nome: " + this.nome);
        System.out.println("preço: R$" + this.preco);
        System.out.println("quantidade em estoque: " + this.quantidade);
    }



}

