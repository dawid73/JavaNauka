package naukaKlass;

/**
 * Created by Dawid on 17.06.2017.
 */
public class Prostokat {

    private  int a, b;

    //kostruktor klasy:
    public Prostokat(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int obliczPole(){
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
