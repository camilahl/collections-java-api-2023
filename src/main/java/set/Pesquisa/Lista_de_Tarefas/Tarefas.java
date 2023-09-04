package main.java.set.Pesquisa.Lista_de_Tarefas;

import java.util.Objects;

public class Tarefas {
    //atributos
    private String descricao;
    private boolean concluida;

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
