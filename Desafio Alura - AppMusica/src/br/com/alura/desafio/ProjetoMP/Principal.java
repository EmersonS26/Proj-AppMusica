package br.com.alura.desafio.ProjetoMP;

public class Principal {
    public static void main (String [] args) {
        Audio audio = new Audio();
        Musica musica = new Musica();
        musica.setTitulo("Ventilador");
        musica.setNomeArtista("Gupe");
        musica.setAlbum("Primário");
        musica.setDuracaoMusica(3.37);
        musica.setCurtidas(2000);
        musica.setClassificacao(4.9);
        musica.setGenero("MPB");
        musica.setTotalDeReproducoes(78.427);
        musica.exibirFicha();
        musica.AudioDestaque();
        musica.CurtirAudio();
        musica.reproduzirAudio();


        Podcast podcast = new Podcast();
        podcast.setTitulo("A importância do JAVA");
        podcast.setTemaPodcast("Mundo da Tecnologia");
        podcast.setDuracaoPodcast(15.53);
        podcast.setCurtidas(3500);
        podcast.setClassificacao(5.0);
        podcast.setTotalDeReproducoes(25000);
        podcast.fichaPodcast();
        podcast.reproduzirAudio();
        podcast.AudioDestaque();
        podcast.CurtirAudio();



    }
}
