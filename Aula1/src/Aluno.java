public class Aluno {
    //atributos
    private String _nome;
    private String _RA;
    private float _A1;
    private float _A2;
    private float _media;
    private int _Frequencia;

    private float SetCalcularMedia(float n1, float n2) {
        _media = (n1 + (2*n2)) / 3;
        return _media;
    }

    public void  setA1 (float a1) {
        _A1 = a1;
    }

    public void  setA2 (float a2) {
        _A2 = a2;
    }

    public void  setFrequencia (int freq) {
        _Frequencia = freq;
    }

    private String SetSituacaoAluno(int Frequencia, float media) {

        if (Frequencia > 75 && _media >= 5)
            return "Aprovado";
        else if (Frequencia > 75 && _media >= 3)
            return "RE";
        else if (Frequencia < 75 && _media < 3)
            return "Reprovado";
        else
            return "Reprovado por faltas";
    }
}
