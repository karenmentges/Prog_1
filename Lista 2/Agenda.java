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

    }

    int buscaPessoa(String nome) {

        return index;
    } // informa em que posição da agenda está a pessoa

    void imprimeAgenda() {

    } // imprime os dados de todas as pessoas da agenda

    void imprimePessoa(int index) {

    } // imprime os dados da pessoa que está na posição “index” da agenda
}
