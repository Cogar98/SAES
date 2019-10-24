
package proyecto;

public class alumno extends Persona{
    int id;
    String carrera;
    String asignatura;
    String asignatura2;
    String asignatura3;
    String asignatura4;
    String asignatura5;
    String asignatura6;
    //persona alumno;
    
    public alumno(){
    }

    public alumno(int id, String nombre, String edad, String sexo, String direccion, String carrera, String asignatura, String
            asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.carrera = carrera;
        this.asignatura = asignatura;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.asignatura4 = asignatura4;
        this.asignatura5 = asignatura5;
        this.asignatura6 = asignatura6;
        
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
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
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

    public String getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public String getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(String asignatura3) {
        this.asignatura3 = asignatura3;
    }

    public String getAsignatura4() {
        return asignatura4;
    }

    public void setAsignatura4(String asignatura4) {
        this.asignatura4 = asignatura4;
    }

    public String getAsignatura5() {
        return asignatura5;
    }

    public void setAsignatura5(String asignatura5) {
        this.asignatura5 = asignatura5;
    }

    public String getAsignatura6() {
        return asignatura6;
    }

    public void setAsignatura6(String asignatura6) {
        this.asignatura6 = asignatura6;
    }
    
    
    
        
}
