package br.com.aplicacaomusica.principal;

import br.com.aplicacaomusica.modelos.MinhasPreferidas;
import br.com.aplicacaomusica.modelos.Musica;
import br.com.aplicacaomusica.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Igual Não Há ");
        minhaMusica.setCantor("Lauriete");

        for (int i = 0; i < 250 ; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Java Podcast- how programming ");
        meuPodcast.setApresentador("Travor Page");
        for (int i = 0; i < 25; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
