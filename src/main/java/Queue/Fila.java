package Queue;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isNotEmpty(){
        return refNoEntradaFila != null;

    }

    public void enqueue(T o){
        No<T> novoNo = new No<>(o);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(this.isNotEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(this.isNotEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }

            }
            return primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();

        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while(true){
                stringRetorno.append("[No{objeto=").append(noAuxiliar.getObject()).append("}]--->");
                if(noAuxiliar.getRefNo()!=null){
                    noAuxiliar = noAuxiliar.getRefNo();

                } else {
                    stringRetorno.append("null");
                    break;
                }

            }

        }else{
            stringRetorno.append("null");

        }



        return stringRetorno.toString();
    }
}

