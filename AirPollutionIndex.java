import java.util.Scanner;
public class AirPollutionIndex
{
    public static void main (String [] args)
    {
        //Assembles the scanner 
        Scanner index = new Scanner(System.in);
        
        //Asks user for a number on the Air Quality Index, saves it
        System.out.println("Enter a number on the Air Pollution Index, and I can tell you what range it belongs in!");
        int quality = index.nextInt();
        
        //Runs a series of if, else if, and else statements to determine where it fits on the scale
        if(quality>500)
        {
            System.out.println(quality + "?! That's above the Hazardous range on the Air Quality Index!");
        }
        else if(quality>=301)
        {
            System.out.println(quality + " is on the Hazardous range on the Air Quality Index.");
        }
        else if(quality>=201)
        {
            System.out.println(quality + " is on the Very Unhealthy range on the Air Quality Index.");
        }
        else if(quality>=151)
        {
            System.out.println(quality + " is on the Unhealthy range on the Air Quality Index.");
        }
        else if(quality>=101)
        {
            System.out.println(quality + " is on the Unhealthy for Sensitive Groups range on the Air Quality Index.");
        }
        else if(quality>=51)
        {
            System.out.println(quality + " is on the Moderate range on the Air Quality Index.");
        }
        else if(quality>=0)
        {
            System.out.println("Congrats! " + quality + " is on the Good range on the Air Quality Index.");
        }
        if(quality<0)
        {
            System.out.println(quality + "?! Sorry, that's an invalid number.");
        }
    }
}
