package Uebung3;

import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        partialString((JOptionPane.showInputDialog("Bitte beliebigen Text eingeben: ")));

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
