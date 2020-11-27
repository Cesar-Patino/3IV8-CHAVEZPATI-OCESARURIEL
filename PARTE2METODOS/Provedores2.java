import javax.swing.JOptionPane;

public class Provedores2 extends Provedores{

    //se crea un  metodo

    public void pedirysuma(){
        pedirdatos();
        sumatotal();
    }

    //se crea un metodo para imprimir todos los datos.
    public void sumatotal(){
        promedio=suma/10;
        JOptionPane.showMessageDialog(null, "Resumen de su pedido:"
                                            + "\nSu nombre es: "+nombrecliente
                                            + "\nLa sumatoria total de los costos de todas las existencias es: "+suma+ " pesos."
                                            + "\nEl producto con el costo mas bajo es: "+productomenor+" que tiene un precio de: "+ menor+" pesos."
                                            + "\nEl producto con el costo mas alto es: "+productomayor+" que tiene un precio de: "+ mayor+" pesos."
                                            + "\nEl promedio del costo total es: "+promedio+" pesos.");
    }
}
