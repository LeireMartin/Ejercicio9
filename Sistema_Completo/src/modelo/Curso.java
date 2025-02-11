package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
private String nombreCurso;
private Profesor profesor;
private List<Estudiante> estudiantes;
public Curso(String nombreCurso, Profesor profesor) {
    this.nombreCurso = nombreCurso;
    this.profesor = profesor;
    this.estudiantes = new ArrayList<>();
}
//matricular-------------------------------------
public void matricularEstudiante( Estudiante estudiante){
    estudiantes.add(estudiante);
    System.out.println(estudiante.getNombre()+" ha sido matriculado en el curso "+ nombreCurso);
}
 //Mostrar lista estudiantes________________________________

 public void mostrarRstudiantes(){
    System.out.println("Estudiantes del curso "+ nombreCurso+": ");
    for (Estudiante estudiante : estudiantes) {
        estudiante.muestraInformacion();
    }
 }

 //-----------------Mostrar profesores--------------

 public void mostrarProfesor(){
    System.out.println("Profe sor del curso "+nombreCurso+":");
    profesor.muestraInformacion();
 }
}
