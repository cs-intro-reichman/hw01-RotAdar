public class GenThree {
public static void main(String[] args) {
{
int min= Integer.parseInt(args[0]);
int max= Integer.parseInt(args[1]);
int rand1= (int)((Math.random())*(max-min))+min;
int rand2= (int)((Math.random())*(max-min))+min;
int rand3= (int)((Math.random())*(max-min))+min;
int randMin=Math.min((Math.min(rand1,rand2)),rand3);
System.out.println( rand1 + "\n" + rand2 + "\n" + rand3 + "\n" + "The minimal generated number was " + randMin);

}
}
}
