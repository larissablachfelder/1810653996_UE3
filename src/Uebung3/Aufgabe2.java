package Uebung3;

import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        partialString((JOptionPane.showInputDialog("Bitte beliebigen Text eingeben: ")));

        //aufgabe3

        System.out.println(Taschenrechner.Addition(5.7,6.3));
        System.out.println(Taschenrechner.Subtraktion(15.6,7.4));
        System.out.println(Taschenrechner.Multiplikation(5.4,6.9));
        System.out.println(Taschenrechner.Division(15.6,3.2));

        System.out.println(Taschenrechner.Addition(5,6));
        System.out.println(Taschenrechner.Subtraktion(15,7));
        System.out.println(Taschenrechner.Multiplikation(5,6));
        System.out.println(Taschenrechner.Division(15,3));
    }

    public static void partialString(String a)
    {
        if(a.length()<=3)
        {
            System.err.println("Falsche Eingabe.");

        }

        else
        {
            System.out.println(a.substring(a.length()/2));
        }
    }

}
