import java.util.Scanner;
public class HypotenuseCalculation {
    public static void main(String[] args) {
        //definition of the lengths of two sides of a triangle adjacent to right angles
        int a, b;
        double c;
        //define Scanner
        Scanner inp=new Scanner(System.in);
        //get values from user
        System.out.print("Length of First Side : ");
        a= inp.nextInt();
        System.out.print("Length of Second Side : ");
        b= inp.nextInt();

        //after entering the values of two sides, the length of side c is found using the Pythagorean expression

        int x=a*a, y=b*b;
        c=Math.sqrt(x+y);

        System.out.print("Length of Hypotenuse : " + c);

    }
}
