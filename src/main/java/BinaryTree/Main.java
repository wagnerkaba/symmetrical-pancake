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
        myTree.inserir(3);
        myTree.inserir(5);
        myTree.inserir(4);
        myTree.inserir(-32);
        myTree.inserir(7);
        myTree.inserir(6);


        myTree.exibirPreOrdem();
        myTree.exibirPosOrdem();
        myTree.exibirInOrdem();


        myTree.remover(26);
        myTree.remover(389);
        myTree.remover(1);
        myTree.remover(6);


        myTree.exibirInOrdem();
        myTree.exibirPosOrdem();


    }
}
