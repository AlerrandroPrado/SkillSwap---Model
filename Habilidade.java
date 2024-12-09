

public class Habilidade {
    private int id;
    private String habilidadeEnsinar;
    private String habilidadeAprender;

    public Habilidade(){
        id = 0;
        habilidadeEnsinar = new String();
        habilidadeAprender = new String();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabilidadeEnsinar() {
        return habilidadeEnsinar;
    }

    public void setHabilidadeEnsinar(String habilidadeEnsinar) {
        this.habilidadeEnsinar = habilidadeEnsinar;
    }

    public String getHabilidadeAprender() {
        return habilidadeAprender;
    }

    public void setHabilidadeAprender(String habilidadeAprender) {
        this.habilidadeAprender = habilidadeAprender;
    }

    public Habilidade(int id, String habilidadeEnsinar, String habilidadeAprender) {
        this.id = id;
        this.habilidadeEnsinar = habilidadeEnsinar;
        this.habilidadeAprender = habilidadeAprender;
    }

    @Override
    public String toString() {
        return "Habilidade [id=" + id + ", habilidadeEnsinar=" + habilidadeEnsinar + ", habilidadeAprender="
                + habilidadeAprender + "]";
    }

    
}
