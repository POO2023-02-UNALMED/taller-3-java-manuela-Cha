package taller3.televisores;

public class TV {
  private Marca marca;
  private int canal = 1;
  private int precio = 500;
  boolean estado;
  private int volumen = 1;
  private Control control;
  static int numTV;

  public TV (Marca marca, boolean estado){
    this.marca = marca;
    this.estado = estado;
    ++TV.numTV;
  }

  public void setMarca (Marca marca){
    this.marca = marca;
  }
  public Marca getMarca(){
    return this.marca;
  }
  
  public void setCanal(int canal){
    this.canal = canal;
  }
  public int getCanal(){
    return this.canal;
  }
  
  public void setPrecio(int precio){
    this.precio = precio;
  }
  public int getPrecio(){
    return this.precio;
  }
  
  public void setVolumen (int volumen){
    this.volumen = volumen;
  }
  public int getVolumen (){
    return this.volumen;
  }

  public void setControl (Control control){
    this.control = control;
  }
  public control getControl (){
    return this.control;
  }

  public static void setNumTV(int numero){
    TV.numTV = numero;
  }
  public static int get (){
    return TV.numTV;
  }
}
