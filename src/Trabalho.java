import java.util.ArrayList;

public class Trabalho {
    private static int id_default = 0;

    private int id;
    private String titulo;
    private Aluno lider;
    private ArrayList<Aluno> participantes;
    private Professor profOrientador;
    private String area;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Aluno getLider() {
        return lider;
    }

    public ArrayList<Aluno> getParticipantes() {
        return participantes;
    }

    public Professor getProfOrientador() {
        return profOrientador;
    }

    public String getArea() {
        return area;
    }

    public Trabalho(String titulo, Aluno lider, Professor profOrientador, String area){
        this.id = id_default++;
        this.titulo = titulo;
        this.lider = lider;
        this.profOrientador = profOrientador;
        this.area = area;
        this.participantes = new ArrayList<>();
    }

    public void inserirParticipante(Aluno participante){
        if (participantes.size() > 2){
            throw new RuntimeException("O trabalho " + this.titulo + " já possui o número máximo de participantes.");
        }
        if (participantes.contains(participante)){
            throw new RuntimeException("O trabalho " + this.titulo + " já contêm o aluno(a) " + participante.getNome() + ".");
        } else {
            participantes.add(participante);
        }
    }

    public void removerParticipante(Aluno participante){
        if (participantes.size() == 0){
            throw new RuntimeException("O trabalho " + this.titulo + " não possui participantes.");
        }
        if (participantes.contains(participante)){
            participantes.remove(participante);
        } else {
            throw new RuntimeException("O trabalho " + this.titulo + " não contêm o aluno(a) " + participante.getNome() + ".");
        }
    }
}