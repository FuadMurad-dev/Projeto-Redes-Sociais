package Funcionalidade;

public class GooglePlus extends RedeSocial implements Compartilhamento,VideoConferencia{


    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Funcionalidade.GooglePlus");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Funcionalidade.GooglePlus");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postando uma foto no Funcionalidade.GooglePlus");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando um Video no Funcionalidade.GooglePlus");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando um Comentario no Funcionalidade.GooglePlus");
    }
}
