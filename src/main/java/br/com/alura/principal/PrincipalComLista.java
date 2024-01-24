package br.com.alura.principal;

import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PrincipalComLista {

    public static void main(String[] args) {
        //Criando e atruindo valores ao meu Objeto do tipo Filme
        Filme topGun = new Filme("Top Gun: Maverick", 2022);
        topGun.avalia(10);

        Filme avatar = new Filme("Avatar", 2011);
        avatar.avalia(8);

        Filme xmen = new Filme("X-men", 2005);
        xmen.avalia(7);

        //Criando e atruindo valores ao meu Objeto do tipo Serie
        Serie theMentalist = new Serie("The Mentalist", 2007);

        //Criando um Array
        //Para aceitar tanto Filme, como Serie, colocamos o tipo de "Titulo"
        ArrayList<Titulo> lista = new ArrayList<>();

        //Adicionando os filmes e series ao Array
        lista.add(topGun);
        lista.add(avatar);
        lista.add(xmen);
        lista.add(theMentalist);

        //Imprimindo Array com foreach da Classe Filme e Serie
        //Usando toString() da Classe Super: Titulo
        for (Titulo titulo : lista) {
            System.out.println(titulo);
        }
        System.out.println();

        //Chamando um método que só existe na Classe Filme
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            //Realizando Casting para Filme da variável Item que é do tipo Titulo
            //Necessário usar o IF, pois, a Série não pode ser convertida para Filme
            //"instanceof" pergunta se item é do tipo de Objeto Filme
            if(item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + ((Filme) item).getClassificacao());
            }
        }

        System.out.println();

        //Ordenando Listas
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Lucas");
        buscaPorArtista.add("Ana");
        buscaPorArtista.add("Pedro");
        buscaPorArtista.add("Jonas");

        //Sem ordem definida
        System.out.println(buscaPorArtista);

        //Com ordem definida
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println();

        //Ordenar variáveis primitivas é simples, porém, e se quisermos ordenar os elementos da Classe Titulo?
        //Para usar o Titulo, necessita ter algo para comparar. Seja o nome, data de lancamento, e por aí vai
        //Assim sendo, necessário implementar a Classe Comparable na Classe Titulo

        //Ordenando pelo nome os elementos de Titulo
        Collections.sort(lista);
        System.out.println(lista);

        //Ordenando com o Comparator, uma forma mais moderna. Ordenando pelo Ano de lancamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
