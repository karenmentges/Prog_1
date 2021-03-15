public class ProgramFour1 {
    public static void main(String[] args) {
        FunctionProgramFour q1, q2;
        int i = 3, a = 4;
        q1 = new FunctionProgramFour();

        q1.x = 8;
        q1.y = 5;
        q2 = q1;
        a = i;
        q1.lado = 10;
        q2.x = 2;
        q2.y = 3;
        q2.imprime();
        q1.imprime();
    }        
}
