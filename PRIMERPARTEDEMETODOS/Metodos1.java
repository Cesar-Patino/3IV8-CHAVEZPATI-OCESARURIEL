import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos1{

    Scanner entrada = new Scanner(System.in);

    //Se crea el menú
    public void menu(){

        char eleccion, letra;
        
        JOptionPane.showMessageDialog(null, "Este programa fue elaborado por CHAVEZ PATINO CESAR URIEL 3IV8");
        
        do{
        eleccion = JOptionPane.showInputDialog("CHAVEZ PATINO CESAR URIEL 3IV8. \nSeleccione el programa que desea Utilizar \n A.Calculador de edad. \n B.Area y perimetro \n C.llamadas").charAt(0);

        //Se crea un «switch» presentando los programas disponibles.
        switch(eleccion){
            case 'A':
                //Se llaman los metodos para ejecutar el programa
                do{
                ejercicioa();
                letra = JOptionPane.showInputDialog("Si desea ir al menu, ingrese m, si desea repetir el programa, ingrese s").charAt(0);
                }while(letra == 's');
            break;

            case 'B':
                //Se solicita eligir la figura de la cual se
                //obtendrán su área y perímetro
                do{
                ejerciciob();
                letra = JOptionPane.showInputDialog("Si desea ir al menu, ingrese m, si desea repetir el programa, ingrese s").charAt(0);
                }while(letra == 's');
            break; 

            case 'C':
                //Se mandan a llamar a los métodos.
                do{
                ejercicioc();
                letra = JOptionPane.showInputDialog("Si desea ir al menu, ingrese m, si desea repetir el programa, ingrese s").charAt(0);
                }while(letra == 's');
            break;
        }
        //Se brinda la opción para volver al menú o cerrar el programa.
        letra = JOptionPane.showInputDialog("Si desea ir al menu principal, ingrese m, si desea cerrar el programa, ingrese x").charAt(0);
        }while(letra == 'm');
    }

    //Variables generales de todos los programas (no se me ocurrio otra forma)

    int cel, credito = 10;
    int numeros[] = new int [10];
    int i;
    int pos = 0, neg = 0, cero = 0;
    double todo, sumapos = 0, sumaneg = 0, sumacero = 0;
    double edad, anio, base, altura, perimetro, area, radio, ladoa, ladob;

//se hace el ejercicio para calcular la edad 
    public void ejercicioa(){
		anio = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu anio de nacimiento"));


        if(anio > 2020 || anio <= 1897){
		anio = Double.parseDouble(JOptionPane.showInputDialog("Gracias por poner a prueba el programa pero ingrese su anio de nacimiento correcto"));
        }
        else{
        edad = 2020 - anio;

        EdadR();
        }
    }

    //imprimimos la edad
    public void EdadR(){
		JOptionPane.showMessageDialog(null, "Su edad es de " +edad+ " anios.");
    }

    //aqui realizamos los metodos para poder calcular las areas y perimetrods
    public void Cir(){

        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo"));

        perimetro = 2*3.14*radio;
        area = 3.14*radio*radio;

        CirR();
    }

    //imprimimos el area y perimetro del rectangulo
    public void CirR(){
		JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades.\nEl area es de " +area+ " unidades.");
    }

    //OPERACIONES PARA EL AREA Y PERIMETRO DER RECTANGULO
    public void Rec(){
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));

        area = base*altura;
        perimetro = 2*(base+altura);

        RecR();
    }

    //Imprimimos el area y peimetro del rectangulo con este metodo
    public void RecR(){
        JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades.\nEl area es de " +area+ " unidades.");
    }

    //En este metodo se hacen las operaciones nesesarias para 
    //obtener el perimetro y area del cuadrado
    public void Cuad(){
		JOptionPane.showMessageDialog(null, "Ingresa el valor de uno de los lados del cuadrado");
        base = entrada.nextInt();

        perimetro = base*4;
        area = base*base;

        CuadR();
    }

    //Aqui se imprime el valor del area y perimetro del cuadrado
    public void CuadR(){
        JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades. \nEl area es de " +area+ " unidades.");

    }

    //Con este metodo calculamos el area y perimetro del triangulo
    public void Tri(){

        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura del triangulo"));

        ladoa = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de uno de los 2 lados faltantes del triangulo"));
        ladob = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de el otro lado faltante del triangulo"));

        perimetro = base+ladoa+ladob;
        area = altura*(base/2);

        TriR();
    }

    //Con este metodo imprimimos los valores del triangulo 
    public void TriR(){
        JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades.\nEl area es de " +area+ " unidades.");

    }

    //creamos el metodo para mandar a llamar los metodos anteriores para ponerlos en un menu
    //y el usuario decida  a que figura desea calcular el area y perimetro
    public void ejerciciob(){
        char el;

        el = JOptionPane.showInputDialog("Seleccione la figura a la que desea calcular area y perimetro\n 1. Circulo. \n 2. Rectangulo \n 3.Cuadrado \n 4.Triangulo.").charAt(0);
        
        switch(el){
            case '1':
                Cir();
            break;

            case '2':
                Rec();
            break;
            
            case '3':
                Cuad();
            break;

            case '4':
                Tri();
            break;
        }
    }

    //En este metodo realizaremos las operaciones nesesarias para resolver
    //el ejercicio de las llamadas 
    //en este punto ya estoy muy cansado
    // y ya no lo pude hacer con interfaces
    public void ejercicioc(){
        System.out.println("\nEl cr\u00e9dito incial es de diez pesos (10 $). Seleccione una opci\u00f3n.");
        System.out.println("1 = Llamada nacional (0.5 $).\n2 = Llamada internacional (0.6 $).\n3 = Celular (0.2 $).");
        System.out.println("\nIngrese el n\u00famero acorde a la nomenclatura anterior.");
        for (i = 0; i < numeros.length; i++){
            System.out.print("N\u00famero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
            
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] == 1){
                pos++;
                sumapos = pos*0.5;
            }
            else if (numeros[i] == 2){
                neg++;
                sumaneg = (neg/2)*(0.6);
            }
            else if (numeros[i] == 3){
                cero++;
                sumacero = (cero/3)*0.2;
            }
        }
            
        todo = sumapos + sumaneg + sumacero;

        System.out.println("\nHa gastado un total de " + todo + " $.");
        TelR();
    }

    //Este método permite consultar el saldo actual tras la realización de llamadas mediante la resta del crédito
    //total (10 $) y el gasto por llamadas, la variable «total».
    public void TelR(){
        System.out.println("\nSi desea conocer su saldo, digite \u00ab1\u00bb; si no, pulse \u00ab2\u00bb.");
        cel = entrada.nextInt();
        if(cel == 1){
            System.out.println("Su saldo original era de " + credito + " $.\nActualmente cuenta con " + (credito - todo) + " $.");
        }
    }
}