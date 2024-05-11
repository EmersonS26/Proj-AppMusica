package br.com.alura.desafio.ProjetoMP;

public class Musica extends Audio{
    private String nomeArtista;
    private double duracaoMusica;
    private String Album;


    public void exibirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Nome do Artista: " + getNomeArtista());
        System.out.println("Album: " + getAlbum());
        System.out.println("Duração: " + getDuracaoMusica());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Estilo Musical: " + getGenero());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("Total de Reproduções: " + getTotalDeReproducoes());
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
    public void CurtirAudio() {
        if (getCurtidas() >= 1 ) {
            System.out.println("Você curtiu a Música "+ getTitulo() + " do artista " + getNomeArtista());
        } else {
            System.out.println("Essa música ainda não recebeu curtidas: ");
        }
    }

    public double getDuracaoMusica() {
        return duracaoMusica;
    }

    public void setDuracaoMusica(double duracaoMusica) {
        this.duracaoMusica = duracaoMusica;
    }


    @Override
    public void reproduzirAudio(){
        System.out.println("Reproduzindo " + getTitulo() + " do artista " + getNomeArtista() + "......");
    }
    @Override
    public void AudioDestaque(){
        System.out.println(getTitulo() + " do artista " + getNomeArtista() + " está no nosso top 10! ");

    }
}
