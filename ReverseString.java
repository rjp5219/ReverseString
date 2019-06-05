import java.io.*;
import javax.swing.*;

public class ReverseString {
    
public static String reverse(String str) {
    if ((null == str) || (str.length() <= 1)) {
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0);
}
    public static void main(String[] args)throws IOException
    {
        String input;
            
        //Used Dialog boxes to refresh memory 
        input = JOptionPane.showInputDialog("Enter a string:");
        JOptionPane.showMessageDialog(null, input + " reversed is " + reverse(input));
        }
    
}