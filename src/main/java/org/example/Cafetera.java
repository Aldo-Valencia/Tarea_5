package org.example;
public class Cafetera {
    private int Deposito_Agua;
    private int Deposito_Cafe;
    private int Deposito_Crema;
    private int Deposito_Vasos;

    public Cafetera() {
        Deposito_Agua=5000;
        Deposito_Cafe=1000;
        Deposito_Crema=1500;
        Deposito_Vasos=50;
    }

    public Cafetera(int deposito_Agua, int deposito_Cafe, int deposito_Crema, int deposito_Vasos) {
        Deposito_Agua = deposito_Agua;
        Deposito_Cafe = deposito_Cafe;
        Deposito_Crema = deposito_Crema;
        Deposito_Vasos = deposito_Vasos;
    }

    public int getDeposito_Agua() {
        return Deposito_Agua;
    }

    public void setDeposito_Agua(int deposito_Agua) {Deposito_Agua = deposito_Agua;}

    public int getDeposito_Cafe() {
        return Deposito_Cafe;
    }

    public void setDeposito_Cafe(int deposito_Cafe) {
        Deposito_Cafe = deposito_Cafe;
    }

    public int getDeposito_Crema() {
        return Deposito_Crema;
    }

    public void setDeposito_Crema(int deposito_Crema) {
        Deposito_Crema = deposito_Crema;
    }

    public int getDeposito_Vasos() {
        return Deposito_Vasos;
    }

    public void setDeposito_Vasos(int deposito_Vasos) {
        Deposito_Vasos = deposito_Vasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "Deposito_Agua=" + Deposito_Agua +
                ",Deposito_Vasos=" + Deposito_Vasos +
                ", Deposito_Cafe=" + Deposito_Cafe +
                ", Deposito_Crema=" + Deposito_Crema +
                '}';
    }

    public  void Americano (){
        int agua =180;
        int cafe =15;
        int vasos =1;
        int resta =Deposito_Agua-agua;
        int resta2 =Deposito_Cafe-cafe;
        int resta3 =Deposito_Vasos-vasos;
            setDeposito_Agua(resta);
            setDeposito_Cafe(resta2);
            setDeposito_Vasos(resta3);
            System.out.println("Cafe realizado");


    }

    public  void Expresso (){
        int agua =120;
        int vasos =1;
        int cafe =20;
        int resta =Deposito_Agua-agua;
        int resta2 =Deposito_Cafe-cafe;
        int resta3 =Deposito_Vasos-vasos;
        setDeposito_Agua(resta);
        setDeposito_Cafe(resta2);
        setDeposito_Vasos(resta3);
        System.out.println("Cafe realizado");

    }

    public  void Capuchino (){
        int agua =100;
        int cafe =14;
        int crema =70;
        int vasos =1;
        int resta =Deposito_Agua-agua;
        int resta2 =Deposito_Cafe-cafe;
        int resta3 =Deposito_Crema-crema;
        int resta4 =Deposito_Vasos-vasos;
        setDeposito_Agua(resta);
        setDeposito_Cafe(resta2);
        setDeposito_Crema(resta3);
        setDeposito_Vasos(resta4);
        System.out.println("Cafe realizado");

    }


}
