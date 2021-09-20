package DoublyLinkedList;

public class ListaDuplamenteEncadeada <T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;

    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if(primeiroNo==null){
            primeiroNo = novoNo;
        }
        if(ultimoNo!=null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;


    }


    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);
        System.out.println("no auxiliar =" + noAuxiliar);
        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }
        else {
            System.out.println("no proximo =" + novoNo.getNoProximo());
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
            System.out.println("no proximo =" + novoNo.getNoProximo());
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }


    public T get(int index){
        if (getNo(index)==null){
            return null;

        }
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i=0; (i<index)&&(noAuxiliar!=null);i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            if (noAuxiliar==null){
                System.out.println("O indice " + index + " não existe!");
                return;
            }
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }
        }
        tamanhoLista--;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<this.size();i++){
            str.append("[").append(this.getNo(i).getConteudo()).append("]-->");

        }
        str.append("null");
        return str.toString();
    }

    public String toStringCompleto() {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<tamanhoLista;i++){
            str.append("[").append(this.getNo(i).getConteudo()).append(",").append(this.getNo(i).getNoPrevio()).append(",").append(this.getNo(i).getNoProximo()).append("]-->");

        }
        str.append("null");
        return str.toString();
    }

}
