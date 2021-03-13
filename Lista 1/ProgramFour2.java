public class ProgramFour2 {
    public static void main(String[] args) {
        FunctionProgramFour q1, q2, q3;
        q1 = new FunctionProgramFour();

        q1.x = 4;
        q1.y = 7;
        q2 = q1;
        q3 = q2;
        q1.imprime();
        q2.imprime();
        q1.lado = 10;
        q3.x = 2;
        q3.y = 3;
        q3.imprime();
        }
        
}
