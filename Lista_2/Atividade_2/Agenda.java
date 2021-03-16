public class Agenda {
    int index, com=-1;
    String a = new String("NULL");
    String b = new String("NULL");
    Pessoa pessoa = new Pessoa();

    public Agenda(){
      
    }

    public Pessoa armazenaPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return pessoa;
    }

    public void removePessoa(String nome, Agenda vetor[]) {
        a = nome;
        for(int i = 0; i < 10; i++) {
            b = vetor[i].pessoa.nome;
            if(a.equals(b)==true) {
                vetor[i].pessoa.nome = "NULL";
                vetor[i].pessoa.data.dia = 0;
                vetor[i].pessoa.data.mes = 0;
                vetor[i].pessoa.data.ano = 0;
                vetor[i].pessoa.idade = 0;
                vetor[i].pessoa.altura = 0;
                vetor[i].pessoa.peso = 0;
                break;
            }
            else{
                System.out.println("Não foi encontrado o nome buscado.");
            }
        }

    }

    public int buscaPessoa(String nome, Agenda vetor[]) {
        com = -1;
        a = nome;
        for (int i = 0; i < 10; i++) {
            b = vetor[i].pessoa.nome;
            if(a.equals(b)==true) {
                com = i; 
                break;
            }
        }
        return com;
    }

    public void imprimeAgenda(Agenda vetor[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + vetor[i].pessoa.nome);
            System.out.println("\tData: " + vetor[i].pessoa.data.dia + "/" + vetor[i].pessoa.data.mes + "/" + + vetor[i].pessoa.data.ano);
            System.out.println("\tIdade: " + vetor[i].pessoa.idade);
            System.out.println("\tAltura: " + vetor[i].pessoa.altura);
            System.out.println("\tPeso: " + vetor[i].pessoa.peso);
        }
    }

    public void imprimePessoa(int index, Agenda vetor[]) {
        for (int i = 0; i < 10; i++) {
            if (index == i) {
                System.out.println("Nome: " + vetor[i].pessoa.nome);
                System.out.println("\tData: " + vetor[i].pessoa.data.dia + "/" + + vetor[i].pessoa.data.mes + "/" + + vetor[i].pessoa.data.ano);
                System.out.println("\tIdade: " + vetor[i].pessoa.idade);
                System.out.println("\tAltura: " + vetor[i].pessoa.altura);
                System.out.println("\tPeso: " + vetor[i].pessoa.peso);
            }
        }
    } // imprime os dados da pessoa que está na posição “index” da agenda
}
