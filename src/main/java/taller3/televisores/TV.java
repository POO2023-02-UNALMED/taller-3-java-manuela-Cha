package taller3.televisores;

public class TV {
  private Marca marca;
  private int canal = 1;
  private int precio = 500;
  private boolean estado;
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
    if (canal > 0 && (canal < 121  && (estado == true))){
       this.canal = canal;
    }
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
    if (volumen > 0 && (volumen < 8 && (estado == true))){
      this.volumen = volumen;
    }
  }
  public int getVolumen (){
    return this.volumen;
  }

  public void setControl (Control control){
    this.control = control;
  }
  public Control getControl (){
    return this.control;
  }

  public static void setNumTV(int numero){
    TV.numTV = numero;
  }
  private static int get (){
    return TV.numTV;
  }

  public void turnOn(){
    this.estado = true;
  }
  public void turnOff(){
    this.estado = false;
  }
  
  public boolean getEstado (){
    return this.estado;
  }

  public void canalUp(){
    this.canal += 1;
  }
  public void canalDown(){
    this.canal -= 1;
  }

  public void volumenUp(){
    this.volumen += 1;
  }
  public void volumenDown(){
    this.volumen -= 1;
  }
}
