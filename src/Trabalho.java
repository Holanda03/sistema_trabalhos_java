import java.util.ArrayList;

public class Trabalho {
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

    public Trabalho(int id, String titulo, Aluno lider, Professor profOrientador, String area){
        this.id = id;
        this.titulo = titulo;
        this.lider = lider;
        this.profOrientador = profOrientador;
        this.area = area;
        this.participantes = new ArrayList<>();
    }
}
