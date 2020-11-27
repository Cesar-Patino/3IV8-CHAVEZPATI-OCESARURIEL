import javax.swing.JOptionPane;

public class Libreria{

    //se dan los tres libros a escoger


    protected String Libro[] = {"La educacion sentimental", "Romancero gitano", "Cien anios de soledad"};
    protected String Autor[] = {"Gustave Flaubert", "Federico Garcia Lorca", "Gabriel Garcia Marquez"};
    protected int Ejemplares[] = {7, 8, 5};
    protected int Prestamos[] = new int[1];
   
    
    public String[] getLibro(){
        return Libro;
    }
    //envia u establecer
    public void setLibro(String Libro[]){
        this.Libro = Libro;
    }

    //recibe obtiene
    public String[] getAutor(){
        return Autor;
    }
    //envia u establecer
    public void setAutor(String Autor[]){
        this.Autor = Autor;
    }

    //recibe obtiene
    public int[] getEjemplares(){
        return Ejemplares;
    }
    //envia u establecer
    public void setEjemplares(int Ejemplares[]){
        this.Ejemplares = Ejemplares;
    }

    //recibe obtiene
    public int[] getPrestamos(){
        return Prestamos;
    }
    //envia u establecer
    public void setPrestamos(int Pretamos[]){
        this.Prestamos = Prestamos;
    }


}