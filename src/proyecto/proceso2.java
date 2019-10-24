
package proyecto;

import java.util.ArrayList;

public class proceso2 {
    
    ArrayList<Profesor> profesores = new ArrayList();
    
        public proceso2(){
    }
    
        public proceso2(ArrayList<Profesor> profesores){
        this.profesores = profesores;
        
    }
        
    
    public void agregarRegistro(Profesor profesores){
        this.profesores.add(profesores);
    }

    public void modificarRegistro(int i, Profesor profesores){
        this.profesores.set(i, profesores);
    }
    
    public void eliminarRegistro(int i){
        this.profesores.remove(i);
    }
    
    public Profesor obtenerRegistro(int i){//Se obtiene la direccion
        return (Profesor)profesores.get(i);
    }
    
    public int cantidadRegistro(){//Se obtiene el tamaño del arreglo de objetos
        return this.profesores.size();
    }
    
    public int buscaCodigo(int codigo){// se busca el ID ingresado
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo == obtenerRegistro(i).getId())return i;
        }
        return -1;
    }
    
    
}
