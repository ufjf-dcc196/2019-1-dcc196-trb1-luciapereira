package dcc196.ufjf.br.trabalho1;

public class Disciplina {

    private final String titulo;
    private final int horas;
    private  final String area;


    public Disciplina(int horas, String area, String titulo) {
        this.horas = horas;
        this.area = area;
        this.titulo =  titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHoras() {
        return horas;
    }

    public String getArea() {
        return area;
    }


}
