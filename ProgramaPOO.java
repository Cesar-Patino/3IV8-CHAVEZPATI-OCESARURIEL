import java.util.Scanner;
import java.util.*;
import java.io.*;

class ProgramaPOO{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int opcion, edad, temp, numero, base, altura, ladoa, ladob, radio, paleta, agua, chocolate, coca;
        char letra, temperatura, convertir;
        double area, perimetro, volumen, resultado, uno, dos, tres, primero, segundo, ppaleta, pagua, pchocolate, pcoca, total, totaldos; 

    do{
        System.out.println("El programa presentado fue trabajaado por:");
        System.out.println("CHAVEZ PATINO CESAR URIEL");
        System.out.println(" ");
        System.out.println("Elija la herramienta que va a utilizar colocando su numero:");
        System.out.println("NOTA: Los programas 9, 10, 11 y 12 no estan disponibles en este momento");
        System.out.println("1. Aplicacion de descuento.");
        System.out.println("2. Convertir numeros decimales a binarios.");
        System.out.println("3. Conversion de temperaturas.");
        System.out.println("4. Identificador de positivos y negativos.");
        System.out.println("5. Precio");
        System.out.println("6. Calcular area, perimetro o volumen.");
        System.out.println("7. Tabla de valores.");
        System.out.println("8. Calcular factorial de un numero entero.");
        System.out.println("9. Hacer cuadrado de asteriscos.");
        System.out.println("10. Hacer cuadrado de asteriscos con hueco.");
        System.out.println("11. Hacer patron de asteriscos.");
        System.out.println("12. Diamante de asteriscos.");
        System.out.println("13. Calculadora.");
        System.out.println("14. Salir.");

        opcion = entrada.nextInt();

        switch(opcion) {
            case 1:
  
                do{
                    System.out.println("Por favor escriba su edad.");
                edad = entrada.nextInt();
                if(edad > 65){
                    System.out.println("Su descuento es del 40 %. Gracias por su visita.");
                }
                if(edad < 21){
                    System.out.println("Si sus padres son socios de este establecimiento escriba s, si no lo son escriba n");
                        letra = entrada.next().charAt(0);
                         if(letra == 's'){
                        System.out.println("Su descuento es de 45 %. Gracias por su visita.");
                        }
                        else if(letra == 'n'){
                        System.out.println("Su descuento es de 25 %. Gracias por su visita.");
                        }
                }
                if(edad >= 21 & edad <= 65){
                    System.out.println("Gracias por su visita");
                }

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                    break;

            case 2:
                do{
                System.out.println("Ingrese un numero entero y positivo para covertirlo al sistema binario.");
                numero = entrada.nextInt ();
                String binario = "";
                if (numero > 0){

                while (numero > 0){
                    if (numero % 2 == 0){
                        binario = "0" + binario;
                    }
                    else{
                        binario = "1" + binario;
                    }

                    numero = (int) numero/2;
                }
                }
                else if(numero == 0){
                    binario = "0";
                }
                else{
                    binario = "Por favor ingrese sus numeros pero solo POSITIVOS";
                }
                System.out.println("El numero en binario es: " + binario + ".");

                System.out.println(" ");
                System.out.println("Escriba a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 3:
                do{

                temp = 0;

                System.out.println("Por favor ingrese la temperatura");
                temp = entrada.nextInt();

                System.out.println(" ");
                System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                System.out.println(" ");
                System.out.println("Tomando en cuenta la nomenclatura de arriba introduzca la unidad de su temperatura inicial:");
                temperatura = entrada.next().charAt(0);

                System.out.println("Tomando en cuenta la nomenclatura de arriba introduzca la unidad a la que desea convertirla");
                convertir = entrada.next().charAt(0);

                if(temperatura == 'C' & convertir == 'C')
                    {
                        System.out.println("El valor es igual. Por favor introduzca una conversion valida.");
                    }
                    else if(temperatura == 'C' & convertir == 'F')
                    {
                        resultado = temp*33.8;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertir == 'K')
                    {
                        resultado = temp*274.15;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertir == 'R')
                    {
                        resultado = temp*493.47;
                    System.out.println("El resultado de la conversion es: " + resultado);
                    }

                    if(temperatura == 'F' & convertir == 'F')
                    {
                        System.out.println("El valor es igual. Por favor introduzca una conversion valida.");
                    }
                    else if(temperatura == 'F' & convertir == 'C')
                    {
                        resultado = temp*-17.22;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertir == 'K')
                    {
                        resultado = temp*255.92;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertir == 'R')
                    {
                        resultado = temp*460.67;
                        System.out.println("El resultado de la conversion e: " + resultado);
                    }

                    if(temperatura == 'K' & convertir == 'K')
                    {
                        System.out.println("El valor es igual. Por favor introduzca una conversion valida.");
                    }
                    else if(temperatura == 'K' & convertir == 'F')
                    {
                        resultado = temp*-457.87;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertir == 'C')
                    {
                        resultado = temp*-272.15;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertir == 'R')
                    {
                        resultado = temp*1.8;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }

                    if(temperatura == 'R' & convertir == 'R')
                    {
                        System.out.println("El valor es igual. Por favor introduzca una conversion valida.");
                    }
                    else if(temperatura == 'R' & convertir == 'F')
                    {
                        resultado = temp*-458.67;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertir == 'K')
                    {
                        resultado = temp*0.55;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertir == 'C')
                    {
                        resultado = temp*-272.594;
                        System.out.println("El resultado de la conversion es: " + resultado);
                    }

                    System.out.println(" ");
                    System.out.println("Escribe la letra a si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, escriba m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'a');

                break;

            case 4:

                do{
                System.out.println("Digita tres numeros, uno a uno, para decirte si son positivos o negativos.");
                uno = entrada.nextDouble();
                dos = entrada.nextDouble();
                tres = entrada.nextDouble();

                if(uno == 0){
                    System.out.println("El primer n\u00famero es neutro.");
                }
                    else if(uno < 0){
                        System.out.println("El primer n\u00famero es negativo.");
                    }
                    else{
                        System.out.println("El primer n\u00famero es positivo.");
                    }

                if(dos == 0){
                    System.out.println("El segundo n\u00famero es neutro.");
                }
                    else if(dos < 0){
                        System.out.println("El segundo n\u00famero es negativo.");
                    }                
                    else{
                        System.out.println("El segundo n\u00famero es positivo.");
                    }

                if(tres == 0){
                    System.out.println("El tercer n\u00famero es neutro.");
                }
                    else if(tres < 0){
                        System.out.println("El tercer n\u00famero es negativo.");
                    }
                    else{
                    System.out.println("El tercer n\u00famero es positivo.");
                    }

                    System.out.println(" ");
                    System.out.println("Escriba a si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'a');

                break;

            case 5:
                do{
                System.out.println("Tenemos los siguientes productos");
                System.out.println("Paleta 1 peso");
                System.out.println("Chocolate 5 pesos");
                System.out.println("Agua 8 pesos");
                System.out.println("Refresco 10 pesos");



                do{System.out.println("Por favor introduzca la cantidad de paletas que adquirio");
                paleta = entrada.nextInt();
                }while(paleta < 0);
                ppaleta = paleta * 1;
                do{System.out.println("Por favor introduzca la cantidad de chocolates que adquirio");
                chocolate = entrada.nextInt();
                }while(chocolate < 0);
                pchocolate = chocolate * 5;
                do{System.out.println("Por favor introduzca la cantidad de botellas de agua que adquirio");
                agua = entrada.nextInt();
                }while(agua < 0);
                pagua = agua * 8;
                do{System.out.println("Por favor introduzca la cantidad de refrescos que adquirio");
                coca = entrada.nextInt();
                }while(coca < 0);
                pcoca = coca * 10;

                total = (paleta + chocolate + agua + coca);

                System.out.println("El total de articulos es: " + total + " unidades. Gracias por su preferencia.");

                totaldos = (ppaleta + pchocolate + pagua + pcoca);
                System.out.println("El total de los articulos es: " + totaldos + " pesos. Gracias por su preferencia.");

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;
            case 6:
               
                do{System.out.println("Seleccione la funcion que desea realizar");
                System.out.println("1, area y perimetro de un rectangulo; 2, perimetro y area de un triangulo; 3, volumen de una esfera; 4, volumen de un cilindro.");

                opcion = entrada.nextInt();

                if(opcion == 1){
                System.out.println("Ingrese la base del rectangulo");
                    base = entrada.nextInt();

                    System.out.println("Ingrese la altura del rectangulo");
                    altura = entrada.nextInt();

                    perimetro = base*altura;
                    area = 2*(base+altura);

                    System.out.println("El perimetro es de" + perimetro);
                    System.out.println("El area es de " + area);
                }

                if(opcion == 2){
                    System.out.println("Ingrese la base del triangulo.");
                    base = entrada.nextInt();

                    System.out.println("Ingresa, uno a uno, los dos lados restantes del triangulo:");
                    ladoa = entrada.nextInt();
                    ladob = entrada.nextInt();

                    System.out.println("Introduce la altura del triangulo");
                    altura = entrada.nextInt();

                    perimetro = base+ladoa+ladob;
                    area = (altura*base)/2;

                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de " + area);
                }

                if(opcion == 3){
                    System.out.println("Ingresa el radio de la esfera");
                    radio = entrada.nextInt();

                    System.out.println("Ingresa la altura de la esfera");
                    altura = entrada.nextInt();

                    volumen = 4*3.14*((radio*radio*radio)/3);

                    System.out.println("El volumen es de " + volumen);
                }

                if(opcion == 4){
                    System.out.println("Ingresa el radio del cilindro");
                    radio = entrada.nextInt();

                    System.out.println("Ingresa la altura del cilindro");
                    altura = entrada.nextInt();

                    volumen = 3.14*(radio*radio)*altura;

                    System.out.println("El volumen es de " + volumen);
                }

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 7:
                do{
                System.out.println("Tabla de unidades, decenas, centenas y millares.");

                System.out.println("\tNma\t\t\t");
                System.out.println("\t1\t10\t100\t1000");
                System.out.println("\t2\t20\t200\t2000");
                System.out.println("\t3\t30\t300\t3000");
                System.out.println("\t4\t40\t400\t4000");
                System.out.println("\t5\t50\t500\t5000");
                System.out.println("\t6\t60\t600\t6000");
                System.out.println("\t7\t70\t700\t7000");
                System.out.println("\t8\t80\t800\t8000");
                System.out.println("\t9\t90\t900\t9000");
                System.out.println("\t10\t100\t1000\t1000");

                System.out.println(" ");
                System.out.println("Escriba La letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 8:
                do{
                System.out.println("Introduzca el numero para indicarle su factorial:");

                int calculo = 0;

                while(calculo < 1) {
                    try {
                        calculo = entrada.nextInt();
                        if(calculo < 1)
                            System.out.println("Por favor, ingrese un numero con un valor superior y distinto de 0.");
                    }catch(InputMismatchException e) {
                        System.out.println("Por favor, ingrese el numero.");
                        entrada.nextLine();
                    }
                }

                long factorial = 1L;

                for(int i = calculo; i > 0; i--) {
                    factorial=factorial*i;
                }

                System.out.println("El factorial de " + calculo + " es " + factorial + ".");

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 9:
                do{

                System.out.println("Esta funcion no esta disponible en este momento");

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 10:
                do{
                System.out.println("Esta funcion no esta disponible porr el momento");

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, escriba la letra m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 11:
                do{

                System.out.println("Esta funcion no esta disponible por el momento");

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu escriba la letra m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;

            case 12:
                do{

                System.out.println("Esta funcion no esta disponible por el momento");

                System.out.println(" ");
                System.out.println("Escriba la letra a si desea repetir el programa.");
                System.out.println("Si desea volver al menu, esfriba la letra m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');

                break;
            case 13:
                do{

                System.out.println("Bienvenido a la calculadora ");
                System.out.println("NOTA: Solo funciona con dos variables");
                System.out.println("NOTA: Si vas a realizar una resta primero ingresa el minuendo y posteriormente el sustraendo");
                System.out.println("NOTA: Si vas a realizar una division primero ingresa el dividendo y despues el divisor");
                System.out.println("Ingresa el primer numero.");
                primero = entrada.nextDouble();

                System.out.println(" ");
                System.out.println("Ingresa el segundo numero");
                segundo = entrada.nextDouble();

                System.out.println(" ");
                System.out.println("Elige la operacion a realizar");
                System.out.println(" ");
                System.out.println("g = suma. h = resta. i = multiplicaci\u00f3n. j = divisi\u00f3n. k = residuo.");
                letra = entrada.next().charAt(0);
                System.out.println(" ");

                if(letra == 'g')
                {
                    resultado = primero+segundo;
                    System.out.println("El resultado de sumar " + primero + " m\u00e1s " + segundo + " es: " + resultado);
                }

                if(letra == 'h')
                {
                    resultado = primero-segundo;
                    System.out.println("El resultado de restar " + primero + " menos " + segundo + " es: " + resultado);
                }

                if(letra == 'i')
                {
                    resultado = primero*segundo;
                    System.out.println("El resultado de multiplicar " + primero + " por " + segundo + " es: " + resultado);
                }

                if(letra == 'j')
                {
                    resultado = primero/segundo;
                    System.out.println("El resultado de dividir " + primero + " entre " + segundo + " es: " + resultado);
                }

                if(letra == 'k')
                {
                    resultado = primero%segundo;
                    System.out.println("El residuo de dividir " + primero + " entre " + segundo + " es: " + resultado);
                }

                    System.out.println(" ");
                    System.out.println("Escriba la letra a si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, escriba la letra m.");
                    letra = entrada.next().charAt(0);
                }while(letra ==  'a');
                
                break;
            
            default:
                System.out.println("Gracias por tomar parte.");   
        }
        System.out.println(" ");
        System.out.println("Escriba m una vez mas para ir al menu.");
        System.out.println("Escriba x para cerrar el programa.");
        System.out.println(" ");
        System.out.println("Este programa fue elaborado por:");
        System.out.println("3IV8 CHAVEZ PATINO CESAR URIEL");
        letra = entrada.next().charAt(0);

    }while(letra == 'm');       
    }
}