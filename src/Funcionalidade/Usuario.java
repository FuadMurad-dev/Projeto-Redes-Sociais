package Funcionalidade;

import Excecoes.CheckedException;

import java.util.HashSet;

public class Usuario {

    private String nome;
    private String email;

    public HashSet<RedeSocial> redesociais = new HashSet<>();

    public Usuario(String nome, String email, HashSet<RedeSocial> redesociais) throws CheckedException {
        this.nome = nome;
        this.email = email;
        try {
            verificarContas(redesociais);
        }
        catch(Exception e){
            System.out.println("Erro:" + e);
        }
        this.redesociais = redesociais;
    }

    public static void verificarContas(HashSet<RedeSocial> redesociais) throws CheckedException {
        // Procura uma instância de Twitter no conjunto
        for (RedeSocial redeSocial : redesociais) {
            if(redeSocial == null){
                throw new CheckedException("Voce Nao tem conta criada no x");
            }
        }
    }

    public static void realizaracao()
    {



    }

}

