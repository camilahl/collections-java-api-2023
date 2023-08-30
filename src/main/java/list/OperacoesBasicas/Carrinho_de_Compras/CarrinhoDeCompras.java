package main.java.list.OperacoesBasicas.Carrinho_de_Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itensCarrinhoList;

    public CarrinhoDeCompras(){
        this.itensCarrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensCarrinhoList.add(new Item(nome, preco, quantidade));
        // Item item_ = new Item(nome, preco, quantidade);
        // this.itensCarrinhoList.add(item_);
    }

    public void removerItem(String nome){
        List<Item> nomeParaRemover = new ArrayList<>();
        if(!(itensCarrinhoList.isEmpty())){
            for (Item i : itensCarrinhoList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    nomeParaRemover.add(i);
                }
            }
            itensCarrinhoList.removeAll(nomeParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        // ve a quantidade total de itens
        // return itensCarrinhoList.size();
        double valorTotal = 0d;
        if (!itensCarrinhoList.isEmpty()) {
            for (Item item : itensCarrinhoList) {
                double valorItem = item.getPreco() * item.getQntd();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itensCarrinhoList.isEmpty()) {
            System.out.println(this.itensCarrinhoList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}


