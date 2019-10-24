
package proyecto;

import java.util.ArrayList;

public class proceso {
    
    ArrayList <alumno> alumnos = new ArrayList();
 
    public proceso(){
    }
    
        public proceso(ArrayList<alumno> alumnos){
        this.alumnos = alumnos;
        
    }
        
    
    public void agregarRegistro(alumno alumnos){
        this.alumnos.add(alumnos);
    }

    public void modificarRegistro(int i, alumno alumnos){
        this.alumnos.set(i, alumnos);
    }
    
    public void eliminarRegistro(int i){
        this.alumnos.remove(i);
    }
    
    public alumno obtenerRegistro(int i){//Se obtiene la direccion
        return (alumno)alumnos.get(i);
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
