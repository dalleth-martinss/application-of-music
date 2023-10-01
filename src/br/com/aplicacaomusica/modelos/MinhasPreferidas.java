package br.com.aplicacaomusica.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if( audio.getClassificacao()>= 8){
            System.out.println(audio.getTitulo() + "É um sucesso!!");
        }else {
            System.out.println(audio.getTitulo() + "Vale apena ouvir de novo! " );
        }
    }



}
