package br.com.alura.desafio.ProjetoMP;

public class Audio {
    private String titulo;
    private String Genero;
    private int curtidas;
    private double classificacao;
    private double totalDeReproducoes;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setGenero(String genero) {
        this.Genero = genero;
    }
    public String getGenero() {
        return this.Genero;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public double getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(double totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }
    public void CurtirAudio() {
        if (curtidas >= 1 ) {
            System.out.println("Essa música foi curtida: " + getCurtidas() + " Vez(es).");
        } else {
            System.out.println("Essa música ainda não recebeu curtidas: ");
        }
    }
    public void reproduzirAudio(){
        System.out.println("Música: " + getTitulo() + " foi reproduziada: " + getTotalDeReproducoes() + " vez(es)");
    }
    public void AudioDestaque(){
        System.out.println("Essa música está no nosso top 10! ");
    }
}
