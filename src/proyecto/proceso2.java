
package proyecto;

import java.util.ArrayList;

public class proceso2 {
    
    ArrayList<profesor> profesores = new ArrayList();
    
        public proceso2(){
    }
    
        public proceso2(ArrayList<profesor> profesores){
        this.profesores = profesores;
        
    }
        
    
    public void agregarRegistro(profesor profesores){
        this.profesores.add(profesores);
    }

    public void modificarRegistro(int i, profesor profesores){
        this.profesores.set(i, profesores);
    }
    
    public void eliminarRegistro(int i){
        this.profesores.remove(i);
    }
    
    public profesor obtenerRegistro(int i){//Se obtiene la direccion
        return (profesor)profesores.get(i);
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
