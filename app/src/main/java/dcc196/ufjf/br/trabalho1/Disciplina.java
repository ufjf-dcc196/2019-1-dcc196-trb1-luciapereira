package dcc196.ufjf.br.trabalho1;

import java.util.ArrayList;

public class Disciplina {

    private String titulo;
    private String horas;
    private  String area;
    private ArrayList<Disciplina> disc = new ArrayList<>();


    public Disciplina(String horas, String area, String titulo) {
        this.horas = horas;
        this.area = area;
        this.titulo =  titulo;
    }

    public Disciplina() {
        if (disc.isEmpty()) {
            criarDisciplina();
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public String getHoras() {
        return horas;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return titulo;
    }


    public ArrayList<Disciplina> getDisc(){
        return disc;
    }

    private void  criarDisciplina()
    {
        disc.add(new Disciplina("10", "exatas", "matematica"));
        disc.add(new Disciplina("11","humanas","portugues"));

    }

    public void adicionarDisciplinas(Disciplina d)
    {
        disc.add(d);
    }

    public ArrayList<Disciplina> getDisciplina() {

        return disc;
    }

    public void addDisciplina(Disciplina d) {

        disc.add(d);

    }
    public Disciplina getParticipantes(String titulo) {
        for (Disciplina d : this.getDisciplina()) {
            if (d.getTitulo().equals(titulo)) {
                return d;
            }
        }
        return null;
    }





}
