/*
 * A program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
public static void main(String[] args) {
{
int quarter= Integer.parseInt(args[0]);
int cents= quarter % 25;
quarter= ((quarter - cents) / 25);
System.out.println("Use " + quarter + " quarters and " + cents + " cents");
}
}
}
