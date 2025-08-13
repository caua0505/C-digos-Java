import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\n==== WMS - Sistema do Estoque ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Atualizar Estoque");
            System.out.println("3. Listar Produto");
            System.out.println("4. Escolha uma das Opções");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                 System.out.println("Nome : ");
                 String nome = scanner.nextLine();
                 System.out.println("Quantidade : ");
                 int qtd = scanner.nextInt();
                 estoque.cadastrarProduto(nome, qtd);
                 break;
             case 2:
                 System.out.println("Codígo do Produto : ");
                 String codigo = scanner.nextLine();
                 System.out.println("Quantidade (positiva ou negativa): ");
                 qtd = scanner.nextInt();
                 estoque.atualizarEstoque(codigo, qtd);
                 break;
             case 3:
                 estoque.listarProdutos();
                 break;
                 case 4:
                    System.out.println("Encerrado...");
                    System.exit(0);
                 default:
                     System.out.println("Opção Inválida");
            }
        }
    }
}