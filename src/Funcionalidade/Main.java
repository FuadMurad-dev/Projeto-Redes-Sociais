package Funcionalidade;

import Excecoes.CheckedException;
import Excecoes.UnchekedException;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws CheckedException {

        Facebook face = new Facebook("SenhaFace", 200);
        Instagram insta = new Instagram("SenhaInsta", 300);
        Twitter x = null;
        GooglePlus google = new GooglePlus("SenhsGoogle", 500);
        HashSet<RedeSocial> redeSocials = new HashSet<>();

        redeSocials.add(face);
        redeSocials.add(x);
        redeSocials.add(insta);

        Usuario usuario = new Usuario("Fuad Murad", "FuadMurad@", redeSocials);

        face.fazStreaming();
        face.compartilhar();
        face.postarComentario();
        insta.postarFoto();
        insta.postarVideo();
        insta.curtirPublicacao();


    }
}

