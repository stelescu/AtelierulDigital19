package Lab2;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("First", 100, 10);
        Fighter f2 = new Fighter("Second", 100, 15);
        BoxingMatch boxingMatch=new BoxingMatch(f1,f2);
        System.out.println("Result:"+boxingMatch.fights());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("NumberOfFighters=" + Fighter.getNumberOfFighters());
    }
}
