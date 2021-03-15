/* Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar
as seguintes operações: Uma pessoa deve possuir os seguintes atributos: nome, data de nascimento
(Data(dia, mes, ano)), altura, peso. Crie um método construtor para a classe Pessoa
passando todos os atributos como parâmetro. */

public class Agenda {
    int index;
    String nome;
    int idade;
    float altura;

    void armazenaPessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void removePessoa(String nome) {
        for (int i = 0; i < 10; i++) {
            if (nome.equals(vetor[i].nome)) {
                vetor[i].nome = "NULL";
                vetor[i].idade = 0;
                vetor[i].altura = 0;
            }
        }
    }

    int buscaPessoa(String nome) {
        for (int i = 0; i < 10; i++) {
            if (nome.equals(vetor[i].nome)) {
                return i;
            }
        }
    } // informa em que posição da agenda está a pessoa

    void imprimeAgenda() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + vetor[i].nome);
            System.out.println("Idade: " + vetor[i].idade);
            System.out.println("Altura: " + vetor[i].altura);
        }

    } // imprime os dados de todas as pessoas da agenda

    void imprimePessoa(int index) {
        for (int i = 0; i < 10; i++) {
            if (index == i) {
                System.out.println("Nome: " + vetor[i].nome);
                System.out.println("Idade: " + vetor[i].idade);
                System.out.println("Altura: " + vetor[i].altura);
            }
        }
    } // imprime os dados da pessoa que está na posição “index” da agenda
}
