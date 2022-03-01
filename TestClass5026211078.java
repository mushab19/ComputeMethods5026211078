import javax.swing.*;

public class TestClass5026211078 {
    public static void main(String[] args) {
        
        //Temperature Converter
        String TempF = JOptionPane.showInputDialog(null, "Type the temperature here! (Fahrenheit)" , "Temperature Converter", 3);
        double TempF1 = Double.parseDouble(TempF);
        ComputeMethods5026211078 CompMet = new ComputeMethods5026211078();
        double TempC = CompMet.fToC(TempF1);
        JOptionPane.showMessageDialog(null, "Temperature in celcius is " +TempC+"\u00B0C", "Temperature Converter", 1);

        //Hypotenuse Calculator
        String a = JOptionPane.showInputDialog(null, "Type side length of a triangle! (cm)", "Hypotenuse Calculator", 3);
        int inta = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog(null, "Type another side length! (cm)", "Hypotenuse Calculator", 3);
        int intb = Integer.parseInt(b);
        double hypo = CompMet.hypotenuse(inta, intb);
        JOptionPane.showMessageDialog(null, "Hypotenuse is " +hypo+ "cm\u00B2", "Hypotenuse Calculator", 1);

        //Dice Calculator
        int dice1 = CompMet.roll();
        JOptionPane.showMessageDialog(null, "The sum of the dice values is " +dice1+ ".");

    }
}
