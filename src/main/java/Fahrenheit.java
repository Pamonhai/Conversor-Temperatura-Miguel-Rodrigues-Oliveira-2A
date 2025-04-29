public class Fahrenheit extends Temperatura {

public Fahrenheit(double valorGraus) {
super(valorGraus);
}
//METODO QUE CONVERTE Fahrenheit PARA CELSIUS
public double paraCelsius(){
return (getGraus()-32)*5/9;
}
//METODO QUE CONVERTE CELSIUS PARA KELVIN
public double paraKelvin(){
return paraCelsius()+273;
}
}
