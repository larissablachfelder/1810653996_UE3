package Uebung3;

public class Aufgabe4
{
    public static void main(String[] args)
    {
        System.out.println(fibonaccioRekursiv(25));
        System.out.println(fibonaccioIterativ(25));

    }

    public static int fibonaccioRekursiv(int a)
    {
        if(a == 0)//ABbruchfunktion wenn die Zahl 0 ist soll 0 zurückgegeben werden
        {
            return 0;//= wird zurückgegeben da es keine fibunacci zahl dafür gibt bzw. 0 von sich selbst ist
        }

        else if(a == 1)// bei eins genauso
        {
            return 1;
        }

        else
        {
            return fibonaccioRekursiv(a-1) + fibonaccioRekursiv(a-2);
        }
    }

    public static int fibonaccioIterativ(int b)

    {
        //Muss mit -1 starten da 0 benötigt wird um die zweite 1 zu berechnen
        int previous = -1;
        int number = 1;
        int result =0;

        for(int i = 0; i <= b; i++) //b ist die anzahl der durchläufe bzw. position der zahl, welche in der main eingegeben wird
        {
            result = previous+number; //die nächste fibo zahl ist die summe der beiden vorherigen
            previous = number; //die nächste zahl ist beim nächsten durchgang dann die vorherige zahl
            number = result; //das ergebnis der beiden vorherigen zahlen ist beim nächsten mal die nächste zahl
        }
        return result;//das ergebnis soll ausgegeben werden bzw. hier zurückgegeben
    }
        //unterschied der laufzeiten, weil die rekursive folge vorher alle if überprüfen muss und dann erst weiß was zu tun ist und erst endet, wenn das erfüllt ist;
        // die andere überprüft nur einmal und macht immer dasselbe solang bis die überprüfung stimmt
}
