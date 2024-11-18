package Funcionalidade;

public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Funcionalidade.Twitter");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postando uma foto no Funcionalidade.Twitter");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postando um Video no Funcionalidade.Twitter");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postando um comentario no Funcionalidade.Twitter");
    }
}
