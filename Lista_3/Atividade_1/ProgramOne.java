public class ProgramOne {
    public static void main(String args[]){
        BlurayDisc c;
        BlurayDisc h = new BlurayDisc("Teste", 1);
        String st = "teste";
        float num;


        // c.dados[10] = ' i ';  O comando não funciona com os espaços antes e após do i, o programa 
        // espera um char e não uma string, e também o objeto deve ser instanciado e inicializado primeiro. 
        // Para corrigir o erro, o comando deve ser escrito como: 
        c = new BlurayDisc("oi", 2);
        c.dados[10] = 'i';

        // h.setIdentificacao(st, num); O comando está chamando a função de forma incorreta, o nome da 
        // função é diferente, e a variável num não cabe a função, pois é do tipo float e a função recebe int. 
        // Segue como está declarada na classe: setIdentificação(String rotulo, int id). Para corrigir o erro, 
        // o comando deve ser escrito como: 
        int id = 1;
        h.setIdentificação(st, id);

        // c.setIdentificacao(12, "Outro rótulo"); R: O comando está chamando a função de forma incorreta: o 
        // nome da função é diferente, além de não coincidir a assinatura, o comando inverteu os atributos da 
        // assinatura, e também o objeto deve ser instanciado e inicializado primeiro. Segue como está declarada 
        // na classe: setIdentificação(String rotulo, int id). Para corrigir o erro, o comando deve ser escrito como: 
        c = new BlurayDisc("oi", 2);
        c.setIdentificação("Outro rótulo", 12);

        // c = new BlurayDisc(); A função está declarada de forma incorreta, a assinatura do método não coincide 
        // com a que foi declarada na classe. Segue como está declarada na classe: BlurayDisc(String rotulo, int id), 
        // o comando precisa dos atributos para o construtor funcionar. Para corrigir o erro, o comando deve ser escrito como:
        c = new BlurayDisc("Rótulo", 1);
        
        // h.rotulo = "Outro rótulo"; Esse comando não é permitido, pois, o atributo rotulo é privado para a classe BlurayDisc, 
        // e não pode ser acessado fora dela.
        
        num = 2.34f; // O comando é executado corretamente, logo que, o f serve para comunicar o programa que o número é do tipo float, 
        // e a variável num também é do tipo float.
        
        num = h.densidade; // O comando está correto.
        
        // st = h.getRotulo(); Esse comando não é permitido, pois, a função getRotulo é privada para a classe BlurayDisc e não 
        // pode ser acessado fora dela
        
        c = new BlurayDisc(st, 234); // O comando está correto.
        
        // c.dados[100] = "Dado posição 100"; O comando não funciona porque o programa espera um char e não uma string. 
        // Para corrigir o erro, o comando deve ser escrito como:
        c.dados[100] = 'c';
    }
}
