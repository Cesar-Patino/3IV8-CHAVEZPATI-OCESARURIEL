import java.util.*;

public class Buscaminas extends Variables{

    Scanner entrada = new Scanner(System.in);

   // protected int tablero [][] = new int [6][6];

    //public Buscaminas(){
        //constructor
    //}

    /*public Buscaminas(int tablero [][], String nombre,int bomba1, int bomba2, int bomba3, int bomba4, int bomba5, int bomba6, int bomba7, int bomba8, int bomba9, int bomba10, int bomba11, int bomba12, int bomba13, int coordenada_x, int coordenada_y){
      

        //utilizamos la palabra reservada super
        super(tablero, nombre, bomba1, bomba2, bomba3, bomba4, bomba5, bomba6, bomba7, bomba8, bomba9, bomba10, bomba11, bomba12, bomba13, coordenada_x, coordenada_y);

    }*/

    public void Mostrartablero(){
        char letra;
        int x, y;


        do{
            System.out.println("El juego fue realizado por Chavez Patino Cesar Uriel grupo 3IV8");
            System.out.println("Por favor ingrese su nombre");
            System.out.println();
            this.nombre = entrada.nextLine();
            System.out.println();
            System.out.println("Holiii "+this.nombre+" a continuacion se te muestra el tablero!!");

            for(int i=0; i<this.tablero.length; i++){
                System.out.println();
                for(int j=0; j<this.tablero.length; j++){
                    System.out.print(this.tablero[i][j]+"  ");
                }
            }

            System.out.println();
            System.out.println();
            System.out.println(this.nombre + " Ingresa el numero de fila, recuerda que van de en el siguiente orden de arriba hacia abajo\n0\n1\n2\n3\n4");
            System.out.println();
            x=entrada.nextInt();
            System.out.println();
            System.out.println(this.nombre + " Ingresa el numero de columna, recuerda que van de en el siguiente orden de izquierda a derecha\n0  1  2  3  4");
            System.out.println();
            y=entrada.nextInt();
            System.out.println();
            tablero[x][y]=0;

        
            if (tablero[x][y] != this.bomba1){
                System.out.println("Bien master continua con la siguiente coordenada");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba2){
                System.out.println("Bien master continua con la siguiente coordenada");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba3){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba4){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba5){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba6){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba7){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba8){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba9){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba10){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba11){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba12){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else if(tablero[x][y] != this.bomba13){
                System.out.println("Bien continua la siguiente casilla");
                System.out.println("Pero ten cuidado hay bombas cerca!!!");
            }else{
                System.out.println("Lo siento te morites");
                System.out.println();
            }

            System.out.println("Deseas repetir el programa?, si lo desea escriba s, sino ingrese p");
            System.out.println();
            letra = entrada.next().charAt(0);

        }while(letra == 's');



    }

}