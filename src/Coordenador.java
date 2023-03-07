public class Coordenador extends Professor{

    public Coordenador(String nome, String email, int id) {
        super(nome, email, id);
    }

    public void removerAluno(Aluno aluno){
        aluno = null;
    }
}