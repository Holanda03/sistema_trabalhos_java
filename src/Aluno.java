public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public Aluno(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void visualizarTrabalho(Publicacao publicacao){
        System.out.println(publicacao.getTrabalho());
    }

    public void curtirTrabalho(Publicacao publicacao){
        publicacao.armazenarCurtidas();
    }

    public void comentarTrabalho(Publicacao publicacao, String comentario){
        publicacao.armazenarComentarios(comentario);
    }
}