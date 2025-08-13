import java.util.Random;

public class Produto {
    private String codigo ;
    private String nome;
    private int quantidade;

    public Produto (String nome, int quantidade) {
        this.codigo = gerarCodAleatorio();
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String gerarCodAleatorio(){
        Random aleatorio = new Random();
        int numero = 100000 + aleatorio.nextInt(900000);
        return String.valueOf(numero);

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void  adicionarQuantidade(int qtd){
        this.quantidade += qtd;
    }

    public void removerQuantidade(int qtd) {
        this.quantidade -= qtd;
    }

    @Override
    public String toString(){
        return codigo + " - " + nome + " - " + quantidade;
    }

}