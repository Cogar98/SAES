
package proyecto;

import java.util.ArrayList;

public class Herramientas {
    
    ArrayList <Alumno> alumnos = new ArrayList();
 
    public Herramientas(){
    }
    
        public Herramientas(ArrayList<Alumno> alumnos){
        this.alumnos = alumnos;
        
    }
        
    
    public void agregarRegistro(Alumno alumnos){
        this.alumnos.add(alumnos);
    }

    public void modificarRegistro(int i, Alumno alumnos){
        this.alumnos.set(i, alumnos);
    }
    
    public void eliminarRegistro(int i){
        this.alumnos.remove(i);
    }
    
    public Alumno obtenerRegistro(int i){//Se obtiene la direccion
        return (Alumno)alumnos.get(i);
    }
    
    public int cantidadRegistro(){//Se obtiene el tamaño del arreglo de objetos
        return this.alumnos.size();
    }
    
    public int buscaCodigo(int codigo){// se busca el ID ingresado
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo == obtenerRegistro(i).getId())return i;
        }
        return -1;
    }
    
}
