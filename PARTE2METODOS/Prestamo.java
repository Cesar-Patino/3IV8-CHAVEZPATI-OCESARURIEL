  
import javax.swing.JOptionPane;

public class Prestamo extends Libreria{

    //se definen variables

    int libro, prestamos, op;

    public void pedirDatos(){

        // metodo para devolver un libro

        try{
        libro = Integer.parseInt(JOptionPane.showInputDialog("Estos son los libros que tenemos disponibles\nDigite el numero, segun la nomenclatura, del libro a solicitar.\n1. " + Libro[0] + ": " + Ejemplares[0]+"\n2. " + Libro[1] + ": " + Ejemplares[1]+"\n3. " + Libro[2] + ": " + Ejemplares[2]+"\n owo."));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
        }
        
        if(libro == 1){
            JOptionPane.showMessageDialog(null, "Que tenga una satisfactoriaa lectura con el libro " + Libro[0] + " de " + Autor[0] +" pero recuerde devolverlo a tiempo por favor.");
            prestamos = Ejemplares[libro-1] - 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestamos+ " ejemplares disponibles");
        }else if(libro == 2){
            JOptionPane.showMessageDialog(null, "Que tenga una satisfactoriaa lectura con el libro " + Libro[1] + " de " + Autor[1] +" pero recuerde devolverlo a tiempo por favor.");
            prestamos = Ejemplares[libro-1] - 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestamos+ " ejemplares disponibles");
        }else if(libro == 3){
            JOptionPane.showMessageDialog(null, "Que tenga una satisfactoriaa lectura con el libro " + Libro[2] + " de " + Autor[2] +" pero recuerde devolverlo a tiempo por favor.");
            prestamos = Ejemplares[libro-1] - 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestamos+ " ejemplares disponibles");
        }

        
    }
}