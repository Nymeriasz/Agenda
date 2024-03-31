package Agenda;

public class Agenda {
    private String nome;
    private int telefone;

    public Agenda(String nome, int telefone){
        this.nome=nome;
        this.telefone=telefone;
    }
    public void exibir(){
        System.out.println("Nome: "+nome+", Telefone: "+telefone);
    }
}
