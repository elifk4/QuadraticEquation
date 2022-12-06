
package quadraticequation;


public class QuadraticEquation {

 private double a;
 private double b;
 private double c;

 
 public QuadraticEquation(){
     
     this(2,3,5);
 }
 
 public QuadraticEquation(double a,double b,double c){
     
     this.a=a;
     this.b=b;
     this.c=c;
 }
 
 public double getA(){
     
     return a;
 }
 
 public double getB(){
     return b;
 }
 
 public double getC(){
     return c;
 }
 
 public void setA(double a){
     this.a=a;
 }
 
 public void setB(double b){
     this.b=b;
 }
 
 public void setC(double c){
     this.c=c;
 }
 
 public double getDiscriminant(){
     return b*b-4*a*c;
 }
 
 public double[] getRoots(){
     
     double roots[]=new double[2];
     double discriminant=getDiscriminant();
     if(discriminant<0){
         roots[0]=0;
         roots[1]=0;
         
     }
     else{
    roots[0]=(-b - Math.sqrt(discriminant)) / (2 * a);
    roots[1]=(-b + Math.sqrt(discriminant)) / (2 * a);

     }
     return roots;
     
 }
public String toString(){
    return a + "x^2+" + b + "x+" + c + "=0";

        
    
}
}