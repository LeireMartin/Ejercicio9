package modelo;

public class Estudiante extends Persona {
private String carrera;

public Estudiante(String nombre, int edad, String carrera) {
    super(nombre, edad);
    this.carrera = carrera;
}

public String getCarrera() {
    return carrera;
}

public void setCarrera(String carrera) {
    this.carrera = carrera;
}
@Override
public void muestraInformacion(){
    super.muestraInformacion();
    System.out.println("Carrera: "+carrera);
}

}
