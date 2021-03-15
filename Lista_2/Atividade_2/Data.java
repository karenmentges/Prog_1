/* Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar
as seguintes operações: Uma pessoa deve possuir os seguintes atributos: nome, data de nascimento
(Data(dia, mes, ano)), altura, peso. Crie um método construtor para a classe Pessoa
passando todos os atributos como parâmetro. */

package Lista_2.Atividade_2;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
