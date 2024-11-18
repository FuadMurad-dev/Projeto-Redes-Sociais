package Funcionalidade;

public class Facebook extends RedeSocial  implements Compartilhamento, VideoConferencia {


    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Funcionalidade.Facebook");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Funcionalidade.Facebook");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postando uma foto no Funcionalidade.Facebook");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando um video no Funcionalidade.Facebook");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando um Comentario no Funcionalidade.Facebook");
    }
}
