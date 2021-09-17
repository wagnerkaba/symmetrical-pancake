package Stack;

public class No {
    private int dado;
    private No ref = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public No getRef() {
        return ref;
    }

    public void setRef(No ref) {
        this.ref = ref;
    }

    public int getDado() {
        return dado;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                ", ref=" + ref +
                '}';
    }
}
