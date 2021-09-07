public class Carro {

    private String _tipo;
    private String _cor;
    private String _modelo;
    private int _portas;
    private boolean _tracao;
    private boolean _bancoDeCouro;
    private boolean _arCondicionado;

    public Carro(String _cor, String _modelo, int _portas) {
        _tipo = "Casual";
        this._cor = _cor;
        this._modelo = _modelo;
        this._portas = _portas;
    }

    public Carro(String _cor, String _modelo, int _portas, boolean _tracao) {
        _tipo = "Esporte";
        this._cor = _cor;
        this._modelo = _modelo;
        this._portas = _portas;
        this._tracao = _tracao;
    }

    public Carro(String _cor, String _modelo, int _portas, boolean _tracao, boolean _bancoDeCouro, boolean _arCondicionado) {
        _tipo = "Luxo";
        this._cor = _cor;
        this._modelo = _modelo;
        this._portas = _portas;
        this._tracao = _tracao;
        this._bancoDeCouro = _bancoDeCouro;
        this._arCondicionado = _arCondicionado;
    }

    public void imprimeCarro() {
        System.out.println("Carro do tipo: " + _tipo);
        System.out.println("Cor: " + _cor);
        System.out.println("Modelo: " + _modelo);
        System.out.println("Possui portas? " + _portas);
        System.out.println("Possui tração? " + _tracao);
        System.out.println("Possui banco de couro? " + _bancoDeCouro);
        System.out.println("Possui ar condicionado? " + _arCondicionado);
        System.out.print("\n\n\n");
    }
}

