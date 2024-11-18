package Funcionalidade;

public class Instagram  extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando uma foto no Funcionalidade.Instagram");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando um video no Funcionalidade.Instagram");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando um Comentario no Funcionalidade.Instagram");
    }
}
