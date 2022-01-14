import java.util.function.Function;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class Main {
    public static void main(String[] args) {
        

        
        System.out.println("Hello From Java");

        Function<Integer,String> intToString = (num)->num.toString(num);

        String number= intToString.apply(234324);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setTitle("WASSSUP FROM JAVA");
        frame.setSize(300,400);
        frame.setLayout(new GridLayout());
        frame.setIconImage(new ImageIcon("ant.jpg").getImage());
        
        frame.setVisible(true);

        System.out.println("hello world");
        System.out.println('c');
    
        

    }
}
