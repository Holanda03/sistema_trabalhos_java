public class Coordenador extends Professor{

    public Coordenador(String nome, String email) {
        super(nome, email);
    }

    public void removerAluno(Aluno aluno){
        if (aluno == null){
            throw new RuntimeException("Aluno(a) não existe.");
        } else {
            System.out.println("Aluno(a) " + aluno.getNome() + " foi removido(a) com sucesso.");
        }
    }
}