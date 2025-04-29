//CLASSE FILHA
public class Celsius extends Temperatura {
//CONSTRUTOR
public Celsius(double ValorGraus){
super(ValorGraus);

}
//CRIANDO OS MÈTODOS PARA CONVERTER
public double paraFahrenheit(){
return (getGraus()*9/5)+32;

}
//CRIANDO O MÉTODO DE CELSIUS PARA KELVIN
public double paraKelvin(){
return getGraus()+273;

}

}