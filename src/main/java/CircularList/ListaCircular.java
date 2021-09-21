package CircularList;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public boolean isEmpty(){
        return this.tamanhoLista == 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        No<T> noAuxiliar = cauda;
        for(int i=0; i<this.size();i++){
            str.append("[").append(noAuxiliar.getConteudo().toString()).append("]-->");
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        if (this.size() ==0){
            str.append("[]");
        } else {
            str.append("[Retorna ao inicio]");
        }
        return str.toString();
    }

    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");
        if (index==0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for(int i=0; i< index; i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;

    }
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){ //estou na cauda
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }


    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;



    }




}
