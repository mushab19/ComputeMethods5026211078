import java.util.Random;

public class ComputeMethods5026211078 {
    public double fToC (double degreesF) {
        double TempC = 5.0/9*(degreesF-32);
        return TempC;
        }
    public double hypotenuse (int a, int b) {
        double hypo = Math.sqrt((Math.pow( a, 2)) + (Math.pow( b,2)));
        return hypo;
        }
    public int roll () {
        Random dice = new Random();
        int dice1 = dice.nextInt(12)+1;
        return dice1;
        }
}
