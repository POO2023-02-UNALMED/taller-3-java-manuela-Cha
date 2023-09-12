package taller3.televisores;

public class Control{
  private TV tv;
    
  public void enlazar(TV televisor){
    this.tv = televisor;
  }  
  
  public void turnOn(){
    this.estado = true;
  }
  public void turnOf(){
    this.estado = false;
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
    
  public void setCanal(int canal){
    if (canal > 0 && canal < 121  && this.estado == true){
      this.canal = canal;}
  }
  public void setVolumen (int volumen){
    if (volumen > 0 && volumen < 8 && this.estado == true){
      this.volumen = volumen;}
  }

  public TV setTV(TV televisor){
    this.tv = televisor;
  }
  public void getTV (){
    return this.tv;
  }
}
