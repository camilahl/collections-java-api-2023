package main.java.list.Ordenacao.Ordenacao_de_Numeros;

import java.util.*;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> listNumeros;

    // construtor
    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ascendente = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            Collections.sort(ascendente);
            return ascendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ascendente = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            ascendente.sort(Collections.reverseOrder());
            return ascendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listNumeros.isEmpty()) {
            System.out.println(this.listNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
