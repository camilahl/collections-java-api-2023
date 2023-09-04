package main.java.set.Ordenacao.Lista_de_Alunos;

import main.java.set.Ordenacao.Cadastro_de_Produtos.Produtos;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    // atributos
    private String nome;
    private long matricula;
    private double media;

    public Alunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Alunos aluno) {
        return nome.compareTo(aluno.getNome());
    }
}

class ComparatorNota implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}

