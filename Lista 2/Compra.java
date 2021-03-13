/* A classe abaixo representa uma compra em um software de comércio. A classe está com o
código de seus métodos incompleto. Escreva o código faltante dos métodos da classe Compra e
escreva um programa em Java que instancie um objeto da classe Compra, leia do teclado as
informações necessárias para preencher todas as propriedades do objeto e, por último, imprima
essas informações através do método imprimeResumo(). */


class Compra {
    String nomeProduto;
    float preço;
    int quantidade;
    Compra produto;
    
    public Compra(String nomeProduto, float preço, int quantidade) {
        this.produto.nomeProduto = nomeProduto;
        this.produto.preço = preço;
        this.produto.quantidade = quantidade;
    }
    
    public void imprimeResumo(Compra produto) {
        System.out.println("Produto:" + nomeProduto);
        System.out.println("Preço:" + preço);
        System.out.println("Quantidade:" + quantidade);
    }
   }
   
