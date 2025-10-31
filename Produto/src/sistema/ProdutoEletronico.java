package sistema;

public class ProdutoEletronico extends Produto{
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaMeses){
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;


    }
    public void adicionarNome(String nome){
        setNome(nome);
    }
    public int getGarantia(){
        return garantiaMeses;

    }
    public void setGarantia(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }
    

    public void exibirDetalhes(int numero){
         
        numero++;
        
        System.out.println("PRODUTO "+ numero);
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("garantia : " + garantiaMeses);
        System.out.println(" ");




    }
    public String toString() {
        return getNome() + getPreco() + garantiaMeses;
    }

}
