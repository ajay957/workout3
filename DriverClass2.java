package SportStar;

import java.util.Scanner;

class Footballer
{
    int individual_income;

    void calculateIncome(int rating1)
    {
        this.individual_income=rating1*100000;
        System.out.println("Individual income of footballer is "+this.individual_income);
    }
}

class Cricketer
{
    int individual_income;

    void calculateIncome(int rat)
    {
        this.individual_income=rat*120000;
        System.out.println("Individual income of cricketer is "+this.individual_income);

    }

}
public class DriverClass2 {

    public static void main(String args[]) {

        abstract class OutdoorGame {
            abstract void play();
        }

        class Football extends OutdoorGame {
            void play() {
                System.out.println("playing football");
            }
        }

        class Cricket extends OutdoorGame {
            void play() {
                System.out.println("playing cricket");
            }
        }
    }
}