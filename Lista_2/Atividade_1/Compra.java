class Compra {
    String nomeProduto;
    float preco;
    int quantidade;

    public Compra(String nomeProduto, float preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void imprimeResumo() {
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade); 
    }
}
