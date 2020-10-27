import java.util.Scanner;

import java.util.*;

class Poke {


    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion,pv,Fuerza,Defensa,ataqueP,ataqueS;
        String Nombre;
        double ID;
        char rep,rep2;

        System.out.println("No pude hacer todo jsjsj");
        System.out.println("El programa fue trabajado por Chavez Patino Cesar Uriel");
        System.out.println("Pongame 10 asies");
        rep = 's';
        do{
            System.out.println("El programa fue trabajado por Chavez Patino Cesar Uriel");
            System.out.println("Pongame 10 asies");
            System.out.println("Por favor selecciona la opcion que deseas hacer");
            System.out.println("1_Charmander");
            System.out.println("2_Bulbasaur");
            System.out.println("3_Squirtle");
            System.out.println("4_Pelea pokemon");
            System.out.println("5_Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    do{
                    System.out.println("Elegiste Charmander");
                    ID = 0001;
                    System.out.println("su ID es: "+ID);
                    pv = 10;
                    System.out.println("Sus puntos de vida: "+pv);
                    Fuerza = 3;
                    System.out.println("Su fuerza es: "+Fuerza);
                    Defensa = 4;
                    System.out.println("Su defensa es: "+Defensa);
                    System.out.println("si quieres regresar al menu  ingresa n, plis");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;


                    case 2:
                    rep2 = 's';
                    do{
                    System.out.println("Bulbasaur");
                    ID = 69;
                    System.out.println("Su ID es:"+ID);
                    pv = 15;
                    System.out.println("sus puntos de vida son: "+pv);
                    Fuerza = 6;
                    System.out.println("Su ferza: "+Fuerza);
                    Defensa = 7;
                    System.out.println("Su defensa es: "+Defensa);
                    System.out.println("si quieres regresar al menu  ingresa n, plis");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;
                case 3:
                    do{
                    System.out.println("Squirtle");
                    ID = 0420;
                    System.out.println("ID:"+ID);
                    pv = 15;
                    System.out.println("Sus puntos de vida son: "+pv);
                    Fuerza = 6;
                    System.out.println("Su fuerza es:"+Fuerza);
                    Defensa = 4;
                    System.out.println("Su defensa es:"+Defensa);
                    System.out.println("si quieres regresar al menu  ingresa n, plis");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;

                case 4:
                    do{

                    System.out.println("no lo pude hacer ajsjs");
                    System.out.println("si quieres regresar al menu  ingresa n, plis");
                    rep2 = entrada.next().charAt(0);
                    }while (rep2 == 's');
                    break;
                default:
                    rep = 'n';

            }
        } while (rep == 's');  
    }
}