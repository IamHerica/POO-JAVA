public class AlunoGrad extends Aluno {
    private double _media;

    public AlunoGrad(int ra, String name, boolean matriculado, double _media) {
        super(ra, name, matriculado);
        this._media = _media;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Média: " + _media);
    }
}
