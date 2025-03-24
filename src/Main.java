public class Main{
    public static void main(String[] args){
        Produto produto = new Produto("café", 42.99, 70);

        System.out.println("informacoes do produto");
        produto.Informacoes();

        produto.alterarPreco(46.88);
        produto.alterarQuantidade(85);

        System.out.println("atualizacoes das informacoes do produto");
        produto.Informacoes();
    }
}

