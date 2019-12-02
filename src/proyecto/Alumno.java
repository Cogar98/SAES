
package proyecto;

public class Alumno extends Persona{
    int id;
    String carrera;
    String asignaturas[] = new String[10];
    /*String asignatura;
    String asignatura2;
    String asignatura3;
    String asignatura4;
    String asignatura5;
    String asignatura6;*/
    //persona Alumno;
    
    public Alumno(){
    }

    public Alumno(int id, String nombre, String edad, String sexo, String direccion, String carrera, String asignatura, String
            asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.carrera = carrera;
        this.asignaturas[0] = asignatura;
        this.asignaturas[1] = asignatura2;
        this.asignaturas[2] = asignatura3;
        this.asignaturas[3] = asignatura4;
        this.asignaturas[4] = asignatura5;
        this.asignaturas[5] = asignatura6;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAsignatura() {
        return asignaturas[0];
    }

    public void setAsignatura(String asignatura) {
        this.asignaturas[0] = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAsignatura1() {
        return asignaturas[1];
    }

    public void setAsignatura1(String asignatura2) {
        this.asignaturas[1] = asignatura2;
    }

    public String getAsignatura2() {
        return asignaturas[2];
    }

    public void setAsignatura2(String asignatura3) {
        this.asignaturas[2] = asignatura3;
    }

    public String getAsignatura3() {
        return asignaturas[3];
    }

    public void setAsignatura3(String asignatura4) {
        this.asignaturas[3] = asignatura4;
    }

    public String getAsignatura4() {
        return asignaturas[4];
    }

    public void setAsignatura4(String asignatura5) {
        this.asignaturas[4] = asignatura5;
    }

    public String getAsignatura5() {
        return asignaturas[5];
    }

    public void setAsignatura5(String asignatura6) {
        this.asignaturas[5] = asignatura6;
    }
    
    
    
        
}
