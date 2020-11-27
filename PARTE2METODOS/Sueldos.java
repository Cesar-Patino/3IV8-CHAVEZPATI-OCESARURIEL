  
import javax.swing.JOptionPane;

public class Sueldos{

        //se definen las variables privadas

    private String nombre_empleado;
    protected String puesto;
    private float ID_empleado;

    public Sueldos(){
    
    }

    public Sueldos(String nombre_empleado, String puesto, float ID_empleado){

        this.nombre_empleado = nombre_empleado;
        this.puesto = puesto;
        this.ID_empleado = ID_empleado;
    }
    
    public String getNombre(){
        nombre_empleado = JOptionPane.showInputDialog("Ingrese su nombre por favor");
        return nombre_empleado;
    }
    //envia u establecer
    public void setNombre(String nombre_empleado){
        this.nombre_empleado = nombre_empleado;
    }

    //recibe obtiene
    public String getPuesto(){
        return puesto;
    }
    //envia u establecer
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    //recibe obtiene
    public Float getIDempleado(){
        ID_empleado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su ID por favor."));
        return ID_empleado;
    }
    //envia u establecer
    public void setIDempleado(Float ID_empleado){
        this.ID_empleado = ID_empleado;
    }

}