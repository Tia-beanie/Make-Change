public class MakeChange {
    public static void main(String[] args){

        int purchase = 58;
        int change = 100 - purchase;
 
        makeChange(change);
        
    }

    public static void makeChange(int change){
        
        int quarter = change / 25;
        System.out.print(quarter + " quarters ");
        change -= quarter * 25;

        int dime = change / 10;
        System.out.print(dime + " dimes ");
        change -= dime * 10;

        int nickel = change / 5;
        System.out.print(nickel + " nickels ");
        change -= nickel * 5;

        int penny = change;
        System.out.print(penny + " pennies ");

    }
}
