package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // atributo
    private Map<String, String> dic;

    public Dicionario() {
        this.dic = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dic.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dic.isEmpty()){
            dic.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public void exibirPalavras(){
        if (!dic.isEmpty()){
            System.out.println(dic);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoCorrespondente = dic.get(palavra);
        if (definicaoCorrespondente != null) {
            return definicaoCorrespondente;
        }
        return "Linguagem não encontrada no dicionário.";

    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
