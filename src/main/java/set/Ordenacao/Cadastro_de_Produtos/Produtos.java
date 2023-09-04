package main.java.set.Ordenacao.Cadastro_de_Produtos;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
    //atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /*vai ficar fazendo a comparacao do nome e vai ver se
    o produto que ta consultando é, na ordem alfabetica,
    maior ou menor que o proximo*/
    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // para um produto ser igual, ele tem que ter o mesmo codigo
    // entao nao precisa de colocar ele no Set de novo
    // um produto só é igual a partir do código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produtos> {
    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}






