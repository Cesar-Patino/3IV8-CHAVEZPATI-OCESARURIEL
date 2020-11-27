import javax.swing.JOptionPane;

public class Devolibros extends Libreria{

    int libro, prestados;

    public void pedirDatos2(){
        
        try{
        libro = Integer.parseInt(JOptionPane.showInputDialog("Segun la nomencaltura ingrese el libro que vaya a devolver "+"\n1. " + Libro[0] + ": " + Ejemplares[0]+" Ejemplares disponibles\n2. " + Libro[1] + ": " + Ejemplares[1] +" Ejemplares disponibles\n3. " + Libro[2] + ": " + Ejemplares[2]+" Ejemplares disponibles"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
        }


        //se crean ifas para imprimir los resultados del pograma
        if(libro == 1){
            JOptionPane.showMessageDialog(null, "Gracias por devolver " + Libro[0] + " de " + Autor[0] +", faltan personas como usted.");
            prestados = Ejemplares[libro-1] + 1; 
            JOptionPane.showMessageDialog(null, "Quedan "+prestados+ " ejemplares");
        }else if(libro == 2){
            JOptionPane.showMessageDialog(null, "Gracias por devolver " + Libro[1] + " de " + Autor[1] +", faltan personas como usted.");
            prestados = Ejemplares[libro-1] + 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestados+ " ejemplares");
        }else if(libro == 3){
            JOptionPane.showMessageDialog(null, "Gracias por devolver " + Libro[2] + " de " + Autor[2] +", faltan personas como usted.");
            prestados = Ejemplares[libro-1] + 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestados+ " ejemplares");
        }
    
    }

}