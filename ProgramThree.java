public class ProgramThree {
    public static void main(String[] args) {
        Function1ProgramThree c1 = new Function1ProgramThree(), c2 = new Function1ProgramThree(), c3;
        c1.lado = 2;
        c2.lado = 5;
        Function2ProgramThree f = new Function2ProgramThree();
        f.imprimeFunction1ProgramThree(c1);
        f.imprimeFunction1ProgramThree(c2);
        c3 = f.multi(c1, c2);
        f.imprimeFunction1ProgramThree(c3);
    }

}
