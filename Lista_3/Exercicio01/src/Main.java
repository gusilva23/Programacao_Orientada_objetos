public class Main {
    public static void main(String[] args) {
        Inimigo inimigo = new Inimigo();
        inimigo.ataque = 75;
        inimigo.defesa = 66;
        inimigo.pontos = 82;

        Inimigo inimigo1 = new Inimigo();
        inimigo1.ataque = 77;
        inimigo1.defesa = 69;
        inimigo1.pontos = 89;


        Heroi heroi = new Heroi();
        heroi.ataque = 77;
        heroi.defesa = 60;
        heroi.pontos = 88;

        Mapa mapa = new Mapa();
        mapa.nome = "Free fire";
        mapa.altura = 100;
        mapa.largura = 75;
        mapa.inimigos.add(inimigo);
        mapa.inimigos.add(inimigo1);

        Inimigo inimigoComMaiorAtaque = mapa.getInimigoMaiorAtaque();

        System.out.println(inimigoComMaiorAtaque.pontos);
    }
}