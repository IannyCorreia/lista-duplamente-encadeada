public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    public void adicionarAoFim(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public void inserirInicio(String valor) {
        inserir(valor);
    }

    public void inserirPosicao(String valor, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (posicao == 0) {
            inserirInicio(valor);
            return;
        }
        if (posicao == tamanho) {
            adicionarAoFim(valor);
            return;
        }
        No novoNo = new No(valor);
        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        novoNo.proximo = atual.proximo;
        novoNo.anterior = atual;
        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        }
        atual.proximo = novoNo;
        tamanho++;
    }

    public void removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (posicao == 0) {
            removerInicio();
            return;
        }
        if (posicao == tamanho - 1) {
            removerFim();
            return;
        }
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        }
        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        }
        tamanho--;
    }

    public void removerFim() {
        if (fim == null) return;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
    }

    public void removerInicio() {
        if (inicio == null) return;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
    }

    public void esvaziar() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}