public class AlunoPosGrad extends Aluno {
    private String _orientador;
    private  String _tese;

    public AlunoPosGrad(int ra, String name, boolean matriculado, String _orientador, String _tese) {
        super(ra, name, matriculado);
        this._orientador = _orientador;
        this._tese = _tese;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Orientador: " + _orientador );
        System.out.println("Tese: " + _tese);
    }
}
