package main.java.set.Ordenacao.Lista_de_Alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // atributos
    private Set<Alunos> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        listaAlunos.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;
        if(!listaAlunos.isEmpty()){
            for (Alunos a : listaAlunos){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(listaAlunos);
        if (!listaAlunos.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!listaAlunos.isEmpty()) {
            alunosPorNota.addAll(listaAlunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        if(!listaAlunos.isEmpty()){
            System.out.println(listaAlunos);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.listaAlunos);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.listaAlunos);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
