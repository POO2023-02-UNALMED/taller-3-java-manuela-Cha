package taller3.televisores;

public class Control (){
  TV tv;
  

public void turnOn(){
  this.estado = true;
  }
public void turnOf(){
  this.estado = false;
  }
  
public void canalUp(){
  ++this.canal;
  }
public void canalDown(){
  --this.canal;
  }

public void volumenUp(){
  ++this.volumen;
}
public void volumenDown(){
  --this.volumen;
}
  
public void setCanal(int canal)
  if (canal > 0 && canal < 121  && this.estado == true){
    this.canal = canal;
    }
public void setVolumen (int volumen)
  if (volumen > 0 && volumen < 8 && this.estado == true){
    this.volumen = volumen;
    }
}
  
