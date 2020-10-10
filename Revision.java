import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalpassengers ;
        char Class ;
        double weight , excessweight=0 , addcharge ;

        System.out.println("How many passenger");

         totalpassengers=input.nextInt();

         for (int counter = 1 ; counter <= totalpassengers ; counter++)
         {

        System.out.println("Enter The class of passenger no."+counter);

        Class=input.next().charAt(0);

        System.out.println("Enter the bag weight");

        weight=input.nextDouble();

        switch (Class) {
            case 'f':
            case 'F':
                if (weight > 30)
                    excessweight = weight - 30;
                addcharge = excessweight * 10;

                System.out.println("Additional charge =" + addcharge);break;

            case 'b':
            case 'B':
                if (weight > 25)
                    excessweight = weight - 25;
                addcharge = excessweight * 10;

                System.out.println("Additional charge =" + addcharge);break;

            case 'e':
            case 'E':
                if (weight > 20)
                    excessweight = weight - 20;
                addcharge = excessweight * 10;

                System.out.println("Additional charge =" + addcharge);break;


            default:
                System.out.println("Invalid class entered");
        }


        }


    }


}
