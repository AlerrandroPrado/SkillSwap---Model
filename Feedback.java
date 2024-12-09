public class Feedback {
    private int id;
    private Usuario idAvaliador;
    private Usuario idAvaliado;
    private String comentario;
    private int nota;

    public Feedback(){
        id = 0;
        idAvaliador = new Usuario();
        idAvaliado = new Usuario();
        comentario = new String();
        nota = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getIdAvaliador() {
        return idAvaliador;
    }

    public void setIdAvaliador(Usuario idAvaliador) {
        this.idAvaliador = idAvaliador;
    }

    public Usuario getIdAvaliado() {
        return idAvaliado;
    }

    public void setIdAvaliado(Usuario idAvaliado) {
        this.idAvaliado = idAvaliado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Feedback(int id, Usuario idAvaliador, Usuario idAvaliado, String comentario, int nota) {
        this.id = id;
        this.idAvaliador = idAvaliador;
        this.idAvaliado = idAvaliado;
        this.comentario = comentario;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Feedback [id=" + id + ", idAvaliador=" + idAvaliador + ", idAvaliado=" + idAvaliado + ", comentario="
                + comentario + ", nota=" + nota + "]";
    }

    
}
