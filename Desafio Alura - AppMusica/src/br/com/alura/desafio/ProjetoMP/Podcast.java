package br.com.alura.desafio.ProjetoMP;

public class Podcast extends Audio{
    private String temaPodcast;
    private double duracaoPodcast;

    public void fichaPodcast() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Tema do Podcast: " + getTemaPodcast());
        System.out.println("Duração: " + getDuracaoPodcast());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("Total de Reproduções: " + getTotalDeReproducoes());

    }

    public String getTemaPodcast() {
        return temaPodcast;
    }

    public void setTemaPodcast(String temaPodcast) {
        this.temaPodcast = temaPodcast;
    }

    public double getDuracaoPodcast() {
        return duracaoPodcast;
    }

    public void setDuracaoPodcast(double duracaoPodcast) {
        this.duracaoPodcast = duracaoPodcast;
    }
    public void CurtirAudio() {
        if (getCurtidas() >= 1 ) {
            System.out.println("Você curtiu o podcast: " + getTitulo());
            System.out.println("Podcast: " + getTitulo() + " foi adicionado a seus favoritos! ");
        } else {
            System.out.println(getTitulo() + " ainda não recebeu curtidas: ");
        }
    }
    @Override
    public void reproduzirAudio(){
        System.out.println("Reproduzindo: " + getTitulo() + ".....");
    }
    @Override
    public void AudioDestaque(){
        System.out.println(getTitulo() + " está no nosso top 5 temas relacionados a " + getTemaPodcast());
    }
}
