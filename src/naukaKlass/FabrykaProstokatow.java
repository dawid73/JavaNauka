package naukaKlass;

/**
 * Created by Dawid on 17.06.2017.
 */
public class FabrykaProstokatow {
    public static void main(String[] args) {

        Prostokat prostokatNumerJeden = new Prostokat(200, 5);

        System.out.println(prostokatNumerJeden.obliczPole());

        System.out.println(prostokatNumerJeden.getA());

        prostokatNumerJeden.setA(400);

        System.out.println(prostokatNumerJeden.obliczPole());

    }
}
