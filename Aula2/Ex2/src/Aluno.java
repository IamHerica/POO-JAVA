public class Aluno {
    //atributos
    private String _nome;
    private String _RA;
    private float _A1;
    private float _A2;
    private float _media;
    private int _Frequencia;


    public void setNome(String nome) {
        _nome = nome;
    }
    public void setRA(String RA) {
        _RA = RA;
    }
    public void setA1 (float a1) {
        _A1 = a1;
    }
    public void  setA2 (float a2) {
        _A2 = a2;
    }
    public void  setFrequencia (int freq) {
        _Frequencia = freq;
    }

    public float getMedia() {
        CalcularMedia();
        return _media;
    }

    public void CalcularMedia() {
        _media = (_A1 + (_A2 * 2)) / 3;
    }

    public void imprimir() {
        System.out.print("Média do aluno " + _nome + ": " );
        System.out.println(getMedia());
        System.out.println(SituacaoAluno());
        System.out.println();
    }

     public String SituacaoAluno() {

        if (_Frequencia > 75 && _media >= 5)
            return "Aprovado";
        else if (_Frequencia > 75 && _media >= 3)
            return "RE";
        else if (_Frequencia < 75 || _media < 3)
            return "Reprovado";
        else
            return "Reprovado por faltas";
    }
}
