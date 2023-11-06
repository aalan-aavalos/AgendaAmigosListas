package models;

import java.util.List;

/**
 *
 * @author Aalan
 */
public class ListaD {
    private NodoD start;
    private NodoD end;
    
    private NodoD current;
    
    public ListaD() {
    }
    
    public ListaD(List<Friend> lista2){
        for (int i = 0; i < lista2.size(); i++) {
            insertAsc(new NodoD(lista2.get(i)));
        }
    }
    
    public void insertAsc(NodoD neew){
        current = neew;
        
        //Caso 1; Lista vacia
        if(start == null){ 
            end = start = neew;
        }
        else{
            NodoD aux = start;
            NodoD ant = null;
            
            while(aux != null && neew.getFriend().getName().compareTo(aux.getFriend().getName()) > 0){
                ant = aux;
                aux = aux.getNext();
            }
            
            //Caso 2: Insertar al inicio
            if(ant == null){
                neew.setNext(start);
                start.setPrev(neew);
                start = neew;
                
            }
            //Caso 3: Insertar al final
            else if(aux == null){
                neew.setPrev(end);
                end.setNext(neew);
                end = neew;
            }
            //Caso 4: Insertar entre dos
            else{
                neew.setPrev(ant);
                neew.setNext(aux);
                
                ant.setNext(neew); 
                aux.setPrev(neew);
            }
        }
    }
    
    
    public void delete(NodoD elim){
        
        NodoD ant = elim.getPrev();
        NodoD sig = elim.getNext();
                
        if(ant == elim && sig == elim){
            start = end = null;
        }
        else if(elim == start){
            start = sig;
            start.setPrev(end);
            end.setNext(start);
        }
        else if(elim == end){
            end = ant;
            end.setPrev(start);
            start.setNext(end);
        }
        else{
            ant.setNext(sig);
            sig.setPrev(ant);
        }
    }
    
    public NodoD find(String item){
        NodoD aux = start;
        
        while(aux != null && !item.equalsIgnoreCase(aux.getFriend().getName())){
            aux = aux.getNext();
        }
        
        return aux;
    }
    
    public void goPreviusly(){
        if(current != start){
            current = current.getPrev();
        }
        else{
            System.out.println("Es todo Ant");
        }
    }
    
    public void goNext(){
        if(current != end){
            current = current.getNext();
        }
        else{
            System.out.println("Es todo Sig");
        }
    }

    public NodoD getCurrent() {
        return current;
    }
    
    public void recorridoAde(){
        NodoD aux = start;
        
        while(aux != null){
            System.out.print(" --> " + aux.getFriend().getName());
            
            aux = aux.getNext();
        }
        System.out.println("");
    }
}
