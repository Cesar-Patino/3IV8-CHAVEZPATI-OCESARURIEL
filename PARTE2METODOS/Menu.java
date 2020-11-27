//libreria
import javax.swing.JOptionPane;

public class Menu{

    //metodo principal
    public void menu(){

        //se definen variables

        int op, letra;
        
        JOptionPane.showMessageDialog(null,"El programa fue realizado por CHAVEZ PATINO CESAR URIEL 3IV8");

        do{

            //se crea el menu para dar a elegir al usuario el programa que sea de su agrado
            //se creo una excepcion owo
            try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el programa que vaya a utilizar. \n1. Sueldo. \n2. Productos. \n3.Libros. "));

            switch(op){

            case 1:
                try{
                op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el puesto que usted tiene. \n1. Jefe. \n2. Empleado. "));
                switch(op){
                    case 1:
                        Jefe m1 = new Jefe("", "", 0, 8000);
                        m1.mostrarJefe();
                        break;
                    case 2:
                        Empleado m2 = new Empleado("", "", 0, 500);
                        m2.mostrarEmpleado();
                        break;
                }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
                }
                break;
            case 2:
                    Provedores2 m3 = new Provedores2();
                    m3.pedirysuma();
                break;
            case 3:
                try{
                op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operacion que vaya a realizar. \n1. Prestamo. \n2. Devolver. "));
                switch(op){
                case 1:
                    Prestamo m4 = new Prestamo();
                    m4.pedirDatos();
                    break;
                case 2:
                    Devolibros m5 = new Devolibros();
                    m5.pedirDatos2();
                    break;
                }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
                }
                break;
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
            }
            letra = Integer.parseInt(JOptionPane.showInputDialog("Si desea regresar al menu ingrese 1, sino ingrese 2. "));
            
        }while(letra == 1);

        JOptionPane.showMessageDialog(null,"Gracias por visitarnos :););)");
    }

}