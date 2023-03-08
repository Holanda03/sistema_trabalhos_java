public class Professor {
    private static int id_default = 0;

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

    public Professor(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.id = id_default++;
    }

    public void publicarTrabalho(Trabalho trabalho, String area){
        new Publicacao(trabalho, area);
    }

    public void removerTrabalho(Publicacao publicacao){
        if (publicacao == null){
            throw new RuntimeException("Publicação não existe.");
        } else {
            System.out.println("Publicação " + publicacao.getId() + " removida com sucesso.");
        }
    }
}