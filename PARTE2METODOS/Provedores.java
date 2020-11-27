import javax.swing.JOptionPane;

public class Provedores{

    // definimos las variables a utilizar  y tambien los arreglos

    String nombrecliente;
    String productos[] = {"Agua", "Refresco", "Chicle", "Papas", "Power", "Jumex", "Monster", "Salsa", "Audifonos", "Cargador"};
    int suma=0;
    int menor=0;
    int mayor=0;
    float promedio=0;
    String productomayor, productomenor;
    int precios[] = {10, 15, 2, 20, 30, 20, 50, 15, 100, 100};
    int existencias[] = {400, 100, 200, 60, 100, 200, 100, 200, 200, 200};
    
    //se crea el metodo para realizar las operaciones

    public void pedirdatos(){
        nombrecliente = JOptionPane.showInputDialog("Ingrese su nombre por favor: ");
        JOptionPane.showMessageDialog(null,"Estos son los productos disponibles");

        //utilice un for para imprimir los datos de los productos
        
        for(int i=0; i<10; i++){
            JOptionPane.showMessageDialog(null, "-"+productos[i]+ " Su costo es de: "+ precios[i]+ " pesos, y hay "+existencias[i]+" existencias.");
        

            //se crean ifs para realizar las operaciones e imprimirlas mas adelante
            suma=suma+precios[i]*existencias[i];
            if(i==0){
                menor=precios[i];
                mayor=precios[i];
                productomayor=productos[i];
                productomenor=productos[i];
            }else{
                if(precios[i]>mayor){
                    mayor=precios[i];
                    productomayor=productos[i];
                }
                if(precios[i]<menor){
                    menor=precios[i];
                    productomenor=productos[i];
                }
            }
        }
    }

}