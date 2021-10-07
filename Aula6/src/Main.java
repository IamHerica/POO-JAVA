public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Hérica", true);
        a1.imprimir();
        AlunoGrad a2 = new AlunoGrad(2, "Lucas", true, 10);
        a2.imprimir();
        AlunoPosGrad a3 = new AlunoPosGrad(3, "Diego", true, "Antero", "Como fazer seus alunos gostarem de java");
        a3.imprimir();
    }
}
