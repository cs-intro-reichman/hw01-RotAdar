public class Gen3 {
public static void main(String[] args) {
{
int a= Integer.parseInt(args[0]);
int b= Integer.parseInt(args[1]);
int r1= (int)((Math.random())*(b-a))+a;
int r2= (int)((Math.random())*(b-a))+a;
int r3= (int)((Math.random())*(b-a))+a;
int rMin=Math.min((Math.min(r1,r2)),r3);
System.out.println( r1 + "\n" + r2 + "\n" + r3 + "\n" + "The minimal generated number was " + rMin);

}
}
}