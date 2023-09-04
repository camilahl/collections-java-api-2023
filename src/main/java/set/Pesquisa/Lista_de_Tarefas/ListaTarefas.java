package main.java.set.Pesquisa.Lista_de_Tarefas;

import java.util.HashSet;
import java.util.Set;
public class ListaTarefas {
    // atributo
    private Set<Tarefas> listaTarefasSet;

    public ListaTarefas() {
        this.listaTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefasSet.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefas tarefaParaRemocao = null;
        if(!listaTarefasSet.isEmpty()) {
            for(Tarefas t : listaTarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemocao = t;
                    break;
                }
            }
            listaTarefasSet.remove(tarefaParaRemocao);
        } else {
            System.out.println("O conjunto está vazio");
        }
        if(tarefaParaRemocao == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!listaTarefasSet.isEmpty()) {
            System.out.println(listaTarefasSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefas(){
        return listaTarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : listaTarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for (Tarefas t : listaTarefasSet) {
            if (! t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefas t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefas tarefaParaMarcarComoPendente = null;
        for (Tarefas t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            tarefaParaMarcarComoPendente.setConcluida(true);
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if(listaTarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            listaTarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.exibirTarefas();

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
