
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {

        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(5, 5, 5);
        Rectangle4 three = new Cube4(5,5, 5);
        Rectangle4 four = new RectangularPrism(5,10,5);
        Rectangle4 five = new Square4(4,3);

        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four);
        shapes.add( five);


        for(Rectangle4 rect: shapes)
        {
        	showEffectBoth(rect);
            System.out.println();
        }

        System.out.println("Test ofr Equality: ");

        for (int i = 0; i < shapes.size()-1; i++){
            if (shapes.get(i).equals(shapes.get(i+1))){
                System.out.println(shapes.get(i).toString() + " IS the same size as " + shapes.get(i+1).toString());
                System.out.println();
            }
        }
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}
