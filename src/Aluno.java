public class Aluno {
    private static int matricula_default = 0;

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

    public Aluno(String nome, String curso){
        this.nome = nome;
        this.matricula = matricula_default++;
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