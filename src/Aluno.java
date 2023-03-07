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
        if (publicacao == null){
            throw new RuntimeException("Essa publicação não existe. visualizarTrabalho()");
        } else{
            System.out.println(publicacao.getTrabalho());
        }
    }

    public void curtirTrabalho(Publicacao publicacao){
        if (publicacao == null){
            throw new RuntimeException("Essa publicação não existe. curtirTrabalho()");
        } else{
            publicacao.armazenarCurtidas();
        }
    }

    public void comentarTrabalho(Publicacao publicacao, String comentario){
        if (publicacao == null){
            throw new RuntimeException("Essa publicação não existe. comentarTrabalho()");
        } else{
            publicacao.armazenarComentarios(comentario);
        }
    }
}