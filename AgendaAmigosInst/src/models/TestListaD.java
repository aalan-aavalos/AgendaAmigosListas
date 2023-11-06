package models;

/**
 *
 * @author Aalan
 */
public class TestListaD {
    public static void main(String[] args) {
        ListaD ld = new ListaD();
        Friend friend;
        Friend friend2;
        Friend friend3;
        
        String nombre = "Alan";
        String telefono = "1234567890";
        String emaill = "a.com";
        String faceboook = "Alan Alan";
        String cump = "2 de septiembre";
        
        String nombre2 = "Nueve Once";
        String telefono2 = "911";
        String emaill2 = "ttx";
        String faceboook2 = "Torre x Torre x Avios";
        String cump2 = "11 de septiembre";
        
        String nombre3 = "Josue";
        String telefono3 = "911";
        String emaill3 = "ttx";
        String faceboook3 = "Torre x Torre x Avios";
        String cump3 = "11 de septiembre";
        
       friend = new Friend(nombre, telefono, emaill, faceboook, cump);
       friend2 = new Friend(nombre2, telefono2, emaill2, faceboook2, cump2);
       friend3 = new Friend(nombre3, telefono3, emaill3, faceboook3, cump3);
       
       NodoD nodo;
       
       ld.insertAsc(new NodoD(friend));
       ld.insertAsc(new NodoD(friend2));
       ld.insertAsc(new NodoD(friend3));
       
       
       
       
       
       /**
       if (ld.find("Alan") != null) {
           System.out.println("Encontrado tio");
       } else {
           System.err.println("No encontrado tio");
       }
       */
       
        //ld.delete(ld.getCurrent());
        
        

       
        
       ld.goPreviusly();
       ld.goPreviusly();
       ld.goPreviusly();
       ld.goNext();
       ld.delete(ld.getCurrent());
       ld.goNext();
       ld.recorridoAde();
       ld.goPreviusly();
       ld.recorridoAde();
       
       System.out.println("Nombre " + ld.getCurrent().getFriend().getName());
       
       System.out.println("Nombre " + ld.getCurrent().getFriend().getName());
       
       
       System.out.println("Nombre " + ld.getCurrent().getFriend().getName());
       
       System.out.println("Nombre " + ld.getCurrent().getFriend().getName());
       
    }
}
