import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos = new HashMap<>();

    public void cadastrarProduto(String nome , int quantidade) {
        Produto p = new Produto(nome, quantidade);
        if(produtos.containsKey(p.getCodigo())) {
            System.out.println("Produto existente");
        } else {
            produtos.put(p.getCodigo(), p);
            System.out.println("Produto adicionado com sucesso. Codígo :  " + p.getCodigo());
        }
    }

    public void atualizarEstoque (String codigo, int  quantidade) {
        Produto p = produtos.get(codigo);
        if (p == null){
           System.out.println("Produto não encontrado.");
        }
        if (quantidade >= 0){
            p.adicionarQuantidade(quantidade);
            System.out.println("Estoque Atualizado (Entrada)");
        }else{
            p.removerQuantidade(-quantidade);
            System.out.println("Estoque Atualizado(Saida)");
        }
    }

        public void listarProdutos(){
            if(produtos.isEmpty()){
                System.out.println("Nenhum produto encontrado");
            }else {
                for (Produto p : produtos.values()){
                    System.out.println(p);
                }
            }
        }
   }

