class jogo implements Comparable<jogo>{

    private String nome;
    private int preco; // numero
    private String genero; // posição

    // Construtor da calsse com os atributos
    public jogo(String nome, int preco, String genero) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    // Contrutor da classe sem os atributos
    public jogo() {
    }


    // Getters e Setters dos atributos private da classe Jogo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Sobrescrição do método compareTo da intervaface Comparable, aqui sendo usada para encontrar a ordem de jogos descresentes baseado no numero do jogo
    @Override
    public int compareTo(jogo o) {
        return Integer.compare(o.preco, this.preco);
    }
}
