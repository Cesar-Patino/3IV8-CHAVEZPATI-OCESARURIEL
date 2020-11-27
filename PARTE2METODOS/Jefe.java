import javax.swing.JOptionPane;

public class Jefe extends Sueldos{

    private float dinerito;

    public Jefe(String nombre_empleado, String puesto, float ID_empleado, float dinerito){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(nombre_empleado, puesto, ID_empleado);
        //acceso a la variable propia de la clase
        this.dinerito = dinerito;
    }

    public Float getdinerito(){
        dinerito = 8000-((8000*0.1f)+(8000*0.2f)+(8000*0.16f));
        return dinerito;
    }

    public Float setdinerito(){
        return dinerito;
    }

    public void mostrarJefe(){
        JOptionPane.showMessageDialog(null,"A continuacion se muestran sus datos: \n Su nombre es: " + getNombre() + "\nSu ID es " + getIDempleado()+ "\n Su sueldo es " + getdinerito() + " pesos MX ");
    }
}