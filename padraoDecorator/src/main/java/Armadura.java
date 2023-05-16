public class Armadura implements Item {
    private String nome;
    private int poder;
    private String descricao;

    public Armadura(String nome, int poder, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public String getDescricao() {
        return descricao;
    }
}
