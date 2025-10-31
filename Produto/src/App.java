import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import sistema.*;



public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       List<ProdutoEletronico> itens = new ArrayList<>(3);

       System.out.println("=== Cadastro de Produtos Eletrônicos ===");
       for (int i = 0; i < 3; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Garantia (em meses): ");
            int garantia = sc.nextInt();
            sc.nextLine(); // limpar buffer

            itens.add(new ProdutoEletronico(nome, preco, garantia));
        }

        System.out.println("\n=== Produtos Cadastrados ===");
        for (ProdutoEletronico p : itens) {
            int valor = 0;
            valor++;
            p.exibirDetalhes(valor);
        }

        sc.close();


        

        


        
    }
}
