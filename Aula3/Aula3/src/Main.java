public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Amarelo", "Celta", 2);

        Carro c2 = new Carro("Preto", "Ferrari", 4, true);

        Carro c3 = new Carro("Roxo", "Porsche", 2,
                true,true, true);

        c1.imprimeCarro();
        c2.imprimeCarro();
        c3.imprimeCarro();
    }

}
