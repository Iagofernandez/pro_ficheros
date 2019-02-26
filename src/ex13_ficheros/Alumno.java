/*
 * Tclase alumno para probar a guardar en un arraylist un fichero que contenga
 * string y int 
 */
package ex13_ficheros;

/**
 *
 * @author lvazquezdorna
 */
public class Alumno {

    private String nome;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", nota= " + nota;
    }

}
