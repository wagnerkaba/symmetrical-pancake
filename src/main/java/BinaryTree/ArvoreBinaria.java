package BinaryTree;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + " / ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + " / ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + " / ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }



    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho;
            BinNo<T> temp;

            System.out.println("\nRemovendo conteudo: " + conteudo);

            //-------------------------------------------------------------
            //Buscando por Nó que contenha "conteudo" recebido no parâmetro
            //
            // atual = nó que receberá o "conteúdo
            // pai = nó que será "pai" do "atual"
            //-------------------------------------------------------------


            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;

                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            //-------------------------------------------------------------
            // Iniciando processo de remoção do BinNo que contém "conteudo"
            //
            //-------------------------------------------------------------
            // Hipótese: pai é nulo (ocorre quando o conteúdo está na raiz)
            //-------------------------------------------------------------

            if(pai == null){

                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else {
                    //-------------------------------------------------------------
                    //JAVA FOR LOOP SYNTAX
                    //
                    // Statement 1 is executed (one time) before the execution of the code block.
                    // Statement 2 defines the condition for executing the code block.
                    // Statement 3 is executed (every time) after the code block has been executed.
                    //-------------------------------------------------------------

                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }


            }
            //-------------------------------------------------------------
            // Hipótese: nó atual não contém nó direito
            //-------------------------------------------------------------

            else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }
            //-------------------------------------------------------------
            // Hipótese: nó atual não contém nó esquerdo
            //-------------------------------------------------------------

            else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }
            //-------------------------------------------------------------
            // Hipótese: nó atual contém nó direito e esquerdo
            //-------------------------------------------------------------

            else{

                //-------------------------------------------------------------
                //JAVA FOR LOOP SYNTAX
                //
                // Statement 1 is executed (one time) before the execution of the code block.
                // Statement 2 defines the condition for executing the code block.
                // Statement 3 is executed (every time) after the code block has been executed.
                //-------------------------------------------------------------
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }


}
