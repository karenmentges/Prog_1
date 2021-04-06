class Post{
    private Autor autor;
    private String texto;

    public Post(Autor autor, String texto){
        this.autor = autor;
        this.texto = texto;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    // Imprime todas as propriedades da classe no formato:
    public void imprimeResumo() {
        System.out.println("Nome: " + autor.getNome());
        System.out.println("ID: " + autor.getId());
        System.out.println("Texto: " + this.texto);
    }
}