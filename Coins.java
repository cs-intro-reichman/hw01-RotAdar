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
