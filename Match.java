import java.util.ArrayList;

public class Match {
    private int id;
    private Usuario idUsuario;
    private Usuario idUsuario2;
    ArrayList<Habilidade> habilidades;

    public Match(){
        id = 0;
        idUsuario = new Usuario();
        idUsuario2 = new Usuario();
        habilidades = new ArrayList<>();
    }

    public Match(int id, Usuario idUsuario, Usuario idUsuario2, ArrayList<Habilidade> habilidades) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idUsuario2 = idUsuario2;
        this.habilidades = habilidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getIdUsuario2() {
        return idUsuario2;
    }

    public void setIdUsuario2(Usuario idUsuario2) {
        this.idUsuario2 = idUsuario2;
    }

    public ArrayList<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Match [id=" + id + ", idUsuario=" + idUsuario + ", idUsuario2=" + idUsuario2 + ", habilidades="
                + habilidades + "]";
    }
}
