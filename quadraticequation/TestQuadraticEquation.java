
package quadraticequation;
import java.util.Arrays;
import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args){
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a");
        double a=kb.nextDouble();
        System.out.println("Enter b");
        double b=kb.nextDouble();
        System.out.println("Enter c");
        double c=kb.nextDouble();
        
        QuadraticEquation quad=new QuadraticEquation(a,b,c);
        System.out.println("Equation is:"+quad.toString());
                System.out.println("discriminant is " + quad.getDiscriminant());

        double[] res = quad.getRoots();
        System.out.println("The roots are " + Arrays.toString(res));

        
        
       
    }
}
