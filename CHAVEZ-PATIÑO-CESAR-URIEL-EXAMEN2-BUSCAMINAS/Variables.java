public class Variables{

    //definir las variables privadas
    protected int tablero [][] = new int [5][5];
    protected String nombre = "";
    protected int bomba1 = tablero [0][0];
    protected int bomba2 = tablero [0][2];
    protected int bomba3 = tablero [0][4];
    protected int bomba4 = tablero [1][1];
    protected int bomba5 = tablero [1][3];
    protected int bomba6 = tablero [2][0];
    protected int bomba7 = tablero [2][2];
    protected int bomba8 = tablero [2][4];
    protected int bomba9 = tablero [3][1];
    protected int bomba10 = tablero [3][3];
    protected int bomba11 = tablero [4][0];
    protected int bomba12 = tablero [4][2];
    protected int bomba13 = tablero [4][4];
    protected int coordenada_x, coordenada_y;


    public Variables(){
    
        //constructor
    }

    public Variables(String nombre, int bomba1, int bomba2, int bomba3, int bomba4, int bomba5, int bomba6, int bomba7, int bomba8, int bomba9, int bomba10, int bomba11, int bomba12, int bomba13, int coordenada_x, int coordenada_y){
      

        //utilizamos la palabra reservada this

        this.nombre = nombre;
        this.bomba1 = bomba1;
        this.bomba2 = bomba2;
        this.bomba3 = bomba3;
        this.bomba4 = bomba4;
        this.bomba5 = bomba5;
        this.bomba6 = bomba6;
        this.bomba7 = bomba7;
        this.bomba8 = bomba8;
        this.bomba9 = bomba9;
        this.bomba10 = bomba10;
        this.bomba11 = bomba11;
        this.bomba12 = bomba12;
        this.bomba13 = bomba13;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }


    //para poder enviar y obtener las variables necesitamos los metodos get y set

    //recibe obtiene
    public String getNombre(){
    return nombre;
    }

    //envia u establecer
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    //recibe obtiene
    public int getBomba1(){
        return bomba1;
    }
    //envia u establecer
    public void setBomba1(int bomba1){
    this.bomba1 = bomba1;
    }

    //recibe obtiene
    public int getBomba2(){
        return bomba2;
    }
        
    //envia u establecer
    public void setBomba2(int bomba2){
    this.bomba2 = bomba2;
    }

    //recibe obtiene
    public int getBomba3(){
        return bomba3;
    }
    //envia u establecer
    public void setBomba3(int bomba3){
    this.bomba3 = bomba3;
    }

    //recibe obtiene
    public int getBomba4(){
        return bomba4;
    }
        
    //envia u establecer
    public void setBomba4(int bomba4){
    this.bomba4 = bomba4;
    }

    //recibe obtiene
    public int getBomba5(){
        return bomba1;
    }
    //envia u establecer
    public void setBomba5(int bomba5){
    this.bomba5 = bomba5;
    }

    //recibe obtiene
    public int getBomba6(){
        return bomba6;
    }
        
    //envia u establecer
    public void setBomba6(int bomba6){
    this.bomba6 = bomba6;
    }

    //recibe obtiene
    public int getBomba7(){
        return bomba7;
    }

    //envia u establecer
    public void setBomba7(int bomba7){
    this.bomba7 = bomba7;
    }

    //recibe obtiene
    public int getBomba8(){
        return bomba8;
    }
        
    //envia u establecer
    public void setBomba8(int bomba8){
    this.bomba8 = bomba8;
    }


    public int getCoordenada_x(){
        return coordenada_x;
    }

    //envia u establecer
    public void setCoordenada_x(int coordenada_x){
    this.coordenada_x = coordenada_x;
    }

    //recibe obtiene
    public int getCoordenada_y(){
        return coordenada_y;
    }
        
    //envia u establecer
    public void setCoordenada_y(int coordenada_y){
        this.coordenada_y = coordenada_y;
    }

}