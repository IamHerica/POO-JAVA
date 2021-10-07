public class Aluno {

    private int _ra;
    private String _name;
    private boolean _matriculado;

    public Aluno(int ra, String name, boolean matriculado) {
        _ra = ra;
        _name = name;
        _matriculado = matriculado;
    }

    public void imprimir(){
        System.out.println("Aluno: " + _name);
        System.out.println("RA: " + _ra);
        System.out.println("Esta matriculado? " + _matriculado);
    }

    public int get_ra() {
        return _ra;
    }

    public void set_ra(int _ra) {
        this._ra = _ra;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public boolean is_matriculado() {
        return _matriculado;
    }

    public void set_matriculado(boolean _matriculado) {
        this._matriculado = _matriculado;
    }

}
