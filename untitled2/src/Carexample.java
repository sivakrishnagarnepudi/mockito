import model.Car;

public class Carexample extends Car {


    @Override
     public void carWheel(String Wheel) {
        System.out.println("wheeltype"+Wheel);

    }

    @Override
    public void carColor(String Color) {
        System.out.println("Carcolor"+Color);

    }
}
