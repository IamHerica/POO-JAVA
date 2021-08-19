public class Conta {

    private int _numero;
    private double _saldo;
    private String _nome;

    public double get_numero() {
        return _numero;
    }

    public double get_saldo() {
        return _saldo;
    }

    public String get_nome() {
        return _nome;
    }

    public void set_numero(int _numero) {
        this._numero = _numero;
    }

    public void set_saldo(double _saldo) {
        this._saldo = _saldo;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }


    public void Depositar(double valor) {
        set_saldo(valor);
        System.out.println("Deposito concluido");
    }

    public void Sacar(double saque) {
        set_saldo(_saldo -= saque);
        System.out.println("Saque concluido");
    }

    public void Saldo() {
        System.out.println(get_nome() + ", da conta " + (int)get_numero() + " você possui o saldo de R$" + get_saldo());
    }
}
