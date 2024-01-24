package br.com.alura.principal;

import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Criando e atruindo valores ao meu Objeto do tipo Filme
        Filme topGun = new Filme("Top Gun: Maverick", 2022);
        topGun.setDuracaoEmMinutos(200);

        Filme avatar = new Filme("Avatar", 2011);
        avatar.setDuracaoEmMinutos(300);

        Filme xmen = new Filme("X-men", 2005);
        xmen.setDuracaoEmMinutos(190);

        //Chamando métodos
        topGun.avalia(10);
        xmen.avalia(10);
        avatar.avalia(10);

        //Criando um Array
        ArrayList<Filme> arrayDeFilmes = new ArrayList<>();

        //Adicionando os filmes ao Array
        arrayDeFilmes.add(topGun);
        arrayDeFilmes.add(avatar);
        arrayDeFilmes.add(xmen);

        //Descobrindo tamanho do Array
        System.out.println("Tamanho da lista: " + arrayDeFilmes.size());

        //Pegando primeiro filme
        System.out.println("Primeiro filme: " + arrayDeFilmes.get(0).getNome());

        //Imprimindo o Array completo
        //Para imprimir dessa forma, precisa de um "toString()"
        System.out.println(arrayDeFilmes);

        //Imprimindo Array com foreach
        for (Filme filme : arrayDeFilmes) {
            System.out.println(filme);
        }
        //arrayDeFilmes.forEach(filme -> System.out.println(filme));
        //arrayDeFilmes.forEach(System.out::println);

        //Criando e atruindo valores ao meu Objeto do tipo Serie
        Serie theMentalist = new Serie("The Mentalist", 2007);
        System.out.println(theMentalist.getNome());

    }
}
