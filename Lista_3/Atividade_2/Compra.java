class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;

    public Compra(String produto, float preco, int quantidade) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNomeProduto(String novo) {
        this.nomeProduto = novo;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void imprimeResumo() {
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

}