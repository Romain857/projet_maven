package dev;
import com.github.lalyos.jfiglet.FigletFont;

import java.time.format.ResolverStyle;
import java.util.ResourceBundle;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String titre = ResourceBundle.getBundle("application").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);
        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environnement : " + environnement);
    }
}
