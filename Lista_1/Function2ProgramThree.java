public class Function2ProgramThree {
    
    void imprimeFunction1ProgramThree(Function1ProgramThree d) {
        System.out.println("lado = " + d.lado);
        System.out.println("area = " + d.calculaArea());
    }
    Function1ProgramThree multi(Function1ProgramThree a, Function1ProgramThree b) {
        Function1ProgramThree q = new Function1ProgramThree();
        q.lado = a.lado * b.lado;
        return q;
    }
        
}
