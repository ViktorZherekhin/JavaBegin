public class JamesBondCar extends Car {   // т.е. этот класс наследует свойства и методы класса "Car"
                                         // класс "Car" в этом случае называют Super-class
                                        // а класс "JamesBondCar" - Sub-class
    int glubinaPogruzheniya;   // автомобиль может плыть под водой
    boolean isGunOnBoard = true;
    final String MANUFACTURER = "AvtoVAZ";  // словом "final" объявляют контсанту.
                                            // Ей можно присовить значение только один раз


    void Pogruzitsya(){

        glubinaPogruzheniya = 50;
        // some code goes here
    }

    void Vsplyt(){
        // some code goes here
    }


}
