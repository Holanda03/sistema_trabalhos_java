import java.util.ArrayList;

public class Publicacao {
    private int id;
    private Trabalho trabalho;
    private int curtidas = 0;
    private ArrayList<String> comentarios;
    private String area;

    public int getId() {
        return id;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public String getArea() {
        return area;
    }

    public Publicacao(int id, Trabalho trabalho, String area){
        this.id = id;
        this.trabalho = trabalho;
        this.comentarios = new ArrayList<>();
        this.area = area;
    }

    public void armazenarCurtidas(){
        curtidas = curtidas + 1;
    }

    public void armazenarComentarios(String comentario) {
        comentarios.add(comentario);
    }
}