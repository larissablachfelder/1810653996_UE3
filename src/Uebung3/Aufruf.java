package Uebung3;

public class Aufruf
{

    public static void main(String[] args)//Aufruf der zwei Fahrzeuge
    {
        Vehicle auto = new Vehicle(100, 200.5, "Auto");
        Vehicle lkw = new Vehicle(400, 1500.5, "LKW");

        System.out.println("Der Name des ersten Fahrzeugs:" + auto.getName());
        System.out.println("Der Name des zweiten Fahrzeugs:" + lkw.getName());

        auto.calculatePower();
        lkw.calculatePower();



    }
}
