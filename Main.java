public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Moll", 1);
        lista.exibir();

        lista.esvaziar();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirInicio("Lisa");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Marge", 1);
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

        lista.esvaziar();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.esvaziar();

        lista.inserirInicio("Homer");
        lista.inserirInicio("Bart");
        lista.inserir("Marge");
        lista.inserirPosicao("Maggie", 1);
        lista.inserirInicio("Ned Flanders");
        lista.inserir("Sr. Burns");
        lista.exibir();

        lista.removerFim();
        lista.exibir();

        lista.removerPosicao(1);
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.removerInicio();
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();
    }
}