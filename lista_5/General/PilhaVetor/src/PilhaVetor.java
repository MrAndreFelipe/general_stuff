public class PilhaVetor<T> implements Pilha<T> {

    private T[] info;
    private int limite;
    private int tamanho;


    public PilhaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new PilhaCheiaException();
        } else {
            this.info[tamanho] = info;
            tamanho++;
        }
    }

    @Override
    public T pop() {
        T valor = peek();
        info[tamanho - 1] = null;
        tamanho--;

        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
    }

    public String toString() {
        String resultado = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            resultado += info[i].toString();
            if (i > 0) {
                resultado = resultado + ", ";
            }
        }
        return resultado;
    }

    public void concatenar(PilhaVetor<T> p) {
        for (int i = 0; i < p.tamanho; i++) {
            this.push(p.info[i]);
        }
    }
}
