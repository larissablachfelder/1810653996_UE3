package Uebung3;

import javax.swing.*;

public class Vehicle
{
        private int power; //
        private double weight; //kg kann kommastellen haben deshalb double
        private String name; //Name des autos

        public Vehicle(int power, double weight, String name)
        {
            this.power = power;//this greift auf das attribut außerhalb dieser methode zu
            this.weight = weight;
            this.name = name;
        }


        public String getName()
        {
            return name;
        }

        public void calculatePower()
        {
            JOptionPane.showMessageDialog(null, "Dieses Auto hat " + power * 1.36d + " PS.");
        }
}
