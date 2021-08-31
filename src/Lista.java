public class Lista {
    private double vetor[];
    private int dados;

    public Lista(int tamanhoLista) {
        this.vetor = new double[tamanhoLista];
        this.dados = 0;
    }

    public void adicionar(double unidade) {
        this.vetor[this.dados] = unidade;
        this.dados++;
    }

    public int tamanho() {
        int contador = 0;

        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] != 0.0) {
                contador++;
            }
        }
        return contador;
    }

    public double get(int posicao) {
        if (posicao >= dados) {
            System.out.println("índice inválido");
        }
        return this.vetor[posicao];
    }

    public void set(int posicao, double dado) {
        this.vetor[posicao] = dado;
    }


    public void limpar() {
        for (int i = 0; i < this.tamanho(); i++) {
            this.vetor[i] = 0.0;
        }
    }
}
