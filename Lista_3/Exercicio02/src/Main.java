public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.duracaoEmSegundos = 160;
        musica.popularidade = 7;

        Musica musica1 = new Musica();
        musica.duracaoEmSegundos = 120;
        musica.popularidade = 9;

        Album album = new Album();
        album.nome = "CBJR";
        album.nomeArtista = "Chorão";

        album.musicas.add(musica);
        album.musicas.add(musica1);

        Musica musicaComMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaComMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("A musica com maior popularidade é: " + musicaComMaiorPopularidade.popularidade);
        System.out.println("A musica com menor duração é: " + musicaComMenorDuracao.duracaoEmSegundos);
    }
}