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
        myTree.inserir(-22);


        myTree.exibirPreOrdem();
        myTree.exibirPosOrdem();
        myTree.exibirInOrdem();


        myTree.remover(26);
        myTree.remover(389);
        myTree.remover(1);


        myTree.exibirInOrdem();


    }
}
