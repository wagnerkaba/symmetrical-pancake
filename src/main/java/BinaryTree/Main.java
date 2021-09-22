package BinaryTree;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> myTree = new ArvoreBinaria<>();
        myTree.inserir(1);
        myTree.inserir(-45);
        myTree.inserir(26);
        myTree.inserir(2);
        myTree.inserir(389);
        myTree.inserir(152);
        myTree.inserir(1);

        myTree.exibirInOrdem();
        myTree.exibirPreOrdem();
        myTree.exibirPosOrdem();



    }
}
