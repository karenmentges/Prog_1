public class Pessoa {
    String nome;
    Data data = new Data();
    int idade;
    float altura;
    float peso;

    public Pessoa(){
        
    }

    public Pessoa(String nome, Data data, int idade, float altura, float peso) {
        this.nome = nome;
        this.data = data;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

    }
}
