/* A classe abaixo representa uma compra em um software de comércio. A classe está com o
código de seus métodos incompleto. Escreva o código faltante dos métodos da classe Compra e
escreva um programa em Java que instancie um objeto da classe Compra, leia do teclado as
informações necessárias para preencher todas as propriedades do objeto e, por último, imprima
essas informações através do método imprimeResumo(). */

package Lista_2.Atividade_1;

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
