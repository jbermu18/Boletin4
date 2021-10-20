package boletin4libro;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    public Libro() {
    }

    public Libro(String tit, String aut, int an, short numPag) {
        this.titulo = tit;
        this.autor = aut;
        this.ano = an;
        this.numPaginas = numPag;
    }

    public void setTit(String tit) {
        this.titulo = tit;
    }

    public String getTit() {
        return this.titulo;
    }

    public void setAut(String aut) {
        this.autor = aut;
    }

    public String getAut() {
        return this.autor;
    }

    public void setAn(int an) {
        this.ano = an;
    }

    public int getAn() {
        return this.ano;
    }

    public void setNumpag(short numPag) {
        this.numPaginas = numPag;
    }

    public short getNumpag() {
        return this.numPaginas;
    }

    public void setVal(float val) {
        this.valoracion = val;
    }

    public float getVal() {
        return this.valoracion;
    }

    public void amosar(String tit, String aut, int an, float val) {
        System.out.println("Titulo: " + tit);
        System.out.println("Autor: " + aut);
        System.out.println("Año: " + an);
        System.out.println("Valoración: " + val);
    }
}
