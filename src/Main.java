import java.util.function.Function;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        

        
        System.out.println("Hello From Java");

        Function<Integer,String> intToString = (num)->num.toString(num);

        String number= intToString.apply(234324);

        

    }
}
