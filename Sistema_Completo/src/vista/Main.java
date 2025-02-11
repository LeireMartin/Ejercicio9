package vista;

import modelo.Curso;
import modelo.Estudiante;
import modelo.Profesor;

public class Main {
    public static void main(String[] args) {
        Profesor p1=new Profesor("Jesus", 40, "Java");
        Profesor p2=new Profesor("Chema", 40, "PHP");

        Estudiante e1=new Estudiante("Luis", 20, "Software");
        Estudiante e2=new Estudiante("Ana", 25, "Hardware");
        Estudiante e3=new Estudiante("Juan", 30, "Sistemas");

        Curso c1=new Curso("1º", p2);
        Curso c2=new Curso("2º", p1);

        c1.matricularEstudiante(e1);
        c1.matricularEstudiante(e3);
        c2.matricularEstudiante(e2);

        c1.mostrarProfesor();
        c2.mostrarRstudiantes();

        p1.trabajar();
        p2.trabajar();
    }

}
