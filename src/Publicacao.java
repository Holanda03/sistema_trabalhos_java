import java.util.ArrayList;

public class Publicacao {
    private int id;
    private Trabalho trabalho;
    private int curtidas = 0;
    private ArrayList<String> comentarios;
    private String area;

    public Publicacao(int id, Trabalho trabalho, String area){
        this.id = id;
        this.trabalho = trabalho;
        this.comentarios = new ArrayList<>();
        this.area = area;
    }
}