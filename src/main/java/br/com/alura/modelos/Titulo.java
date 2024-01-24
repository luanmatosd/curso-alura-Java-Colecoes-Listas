package br.com.alura.modelos;
//Usando o conceito de Herança
//Titulo serve tanto para a Classe Filme quanto para Série

//Necessário invocar a Classe Comparable, passando o Titulo, que é o que queremos comparar
public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Construtor na Classe Super
    //É necessário criar nas classes Filhas. Construtor não é passado por herança
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Getters e Setters
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public String getNome() {
        return nome;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Métodos que não são básicos igual Getters e Setters
    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Lançado em: " + anoDeLancamento);
    }
    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double exibeMedia (){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    //Sobrescrita do método "toString()"
    //toda Classe possui por herdar da Classe Mãe: Object
    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                " Ano de lançamento: " + this.getAnoDeLancamento();
    }


    //Método obrigatório a ser assinado da Classe Comparable
    //Aqui eu coloco a regra de comparação que desejo fazer, seja por nome, data de lancamento, etc
    @Override
    public int compareTo(Titulo nomeDoTitulo) {
        return this.getNome().compareTo(nomeDoTitulo.getNome());
    }
}
