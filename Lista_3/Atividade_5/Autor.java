class Autor {
    private String nome;
    private int id;

    public Autor(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

}