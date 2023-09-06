package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributos
    private Map<String, Integer> contarPalavras;

    public ContagemPalavras() {
        this.contarPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contarPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contarPalavras.isEmpty()){
            contarPalavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio!");
        }
    }

    public int exibirContagemPalavras(){
        int qntdPalavras = 0;
        if (!contarPalavras.isEmpty()){
            for (int c : contarPalavras.values()){
                qntdPalavras += c;
            }
        } else {
            System.out.println("O Map está vazio!");
        }
        return qntdPalavras;
    }

    /*pega o map que contém palavras e suas frequências e encontra a palavra
    com a frequência mais alta, retornando essa palavra como resultado*/
    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contarPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
