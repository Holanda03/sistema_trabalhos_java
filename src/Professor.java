public class Professor {
    protected String nome;
    protected String email;
    protected int id;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public Professor(String nome, String email, int id){
        this.nome = nome;
        this.email = email;
        this.id = id;
    }
}