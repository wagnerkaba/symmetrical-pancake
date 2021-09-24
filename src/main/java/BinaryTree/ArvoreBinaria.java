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
            System.out.print(atual.getConteudo() + " ");
            System.out.print(atual.getNoEsq() + " ");
            System.out.println(atual.getNoDir());
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
            BinNo<T> tempConteudo = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho;
            BinNo<T> tempPai;

            System.out.println("\nRemovendo conteudo: " + conteudo);

            //-------------------------------------------------------------
            //Buscando por Nó que contenha "conteudo" recebido no parâmetro
            //
            // tempConteudo = nó que receberá o "conteúdo
            // pai = nó que será "pai" do "atual"
            //-------------------------------------------------------------


            while (tempConteudo != null && !tempConteudo.getConteudo().equals(conteudo)){
                pai = tempConteudo;

                if(conteudo.compareTo(tempConteudo.getConteudo()) < 0){
                    tempConteudo = tempConteudo.getNoEsq();
                }else {
                    tempConteudo = tempConteudo.getNoDir();
                }
            }

            if(tempConteudo == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            //-------------------------------------------------------------
            // Iniciando processo de remoção do BinNo que contém "conteudo"
            //
            //-------------------------------------------------------------
            // Hipótese: pai é nulo (ocorre quando o conteúdo está na raiz)
            //-------------------------------------------------------------

            if(pai == null){


                if(tempConteudo.getNoDir() == null){
                    this.raiz = tempConteudo.getNoEsq();
                }else if(tempConteudo.getNoEsq() == null){
                    this.raiz = tempConteudo.getNoDir();
                }else {

                    tempPai = tempConteudo;
                    filho = tempConteudo.getNoEsq();
                    while (filho.getNoDir() != null){
                        tempPai = filho;
                        filho = filho.getNoDir();
                    }

                    if(filho != tempConteudo.getNoEsq()){
                        tempPai.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(raiz.getNoEsq());
                    }

                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }


            }
            //-------------------------------------------------------------
            // Hipótese: nó atual não contém nó direito
            //-------------------------------------------------------------

            else if(tempConteudo.getNoDir() == null){
                if(pai.getNoEsq() == tempConteudo){
                    pai.setNoEsq(tempConteudo.getNoEsq());
                }else {
                    pai.setNoDir(tempConteudo.getNoEsq());
                }
            }
            //-------------------------------------------------------------
            // Hipótese: nó atual não contém nó esquerdo
            //-------------------------------------------------------------

            else if(tempConteudo.getNoEsq() == null){
                if(pai.getNoEsq() == tempConteudo){
                    pai.setNoEsq(tempConteudo.getNoDir());
                }else {
                    pai.setNoDir(tempConteudo.getNoDir());
                }
            }
            //-------------------------------------------------------------
            // Hipótese: nó atual contém nó direito e esquerdo
            //-------------------------------------------------------------

            else{
                tempPai = tempConteudo;
                filho = tempConteudo.getNoEsq();
                while (filho.getNoDir() != null){
                    tempPai = filho;
                    filho = filho.getNoDir();
                    }

                if(filho != tempConteudo.getNoEsq()) {
                    tempPai.setNoDir(filho.getNoEsq());
                    filho.setNoEsq(tempConteudo.getNoEsq());
                    }

                filho.setNoDir(tempConteudo.getNoDir());
                if(pai.getNoEsq() == tempConteudo){
                    pai.setNoEsq(filho);
                }else{
                    pai.setNoDir(filho);
                    }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }


}
