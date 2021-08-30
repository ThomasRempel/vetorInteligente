public class Lista {
    private double vetor[];
    private int elementos;

    public Lista(int tamanhoLista) {
        this.vetor = new double[tamanhoLista];
        this.elementos = 0;
    }

    public void adicionar(double numero) {
        this.vetor[this.elementos] = numero;
        this.elementos++;
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
        if (posicao >= elementos) {
            System.out.println("índice inválido");
        }
        return this.vetor[posicao];
    }

    public void set(int posicao, double elemento) {
        this.vetor[posicao] = elemento;
    }


    public void limpar() {
        for (int i = 0; i < this.tamanho(); i++) {
            this.vetor[i] = 0.0;
        }
    }
}
