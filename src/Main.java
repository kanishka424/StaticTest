import javax.crypto.spec.PSource;

public class Main {
    public static int multiplier=7;
    public static void main(String[] args) {
//        StaticTest instanceOne=new StaticTest("instance one");
//        System.out.println("Firt instances's name is "+ instanceOne.getName()+" and instance number is "+StaticTest.getNumInstances() );//to call getNumInstances()  we need the class not an intance of the class
//        StaticTest instanceTwo=new StaticTest("instance two");
//        System.out.println("Second instances's name is "+ instanceTwo.getName()+" and instance number is "+StaticTest.getNumInstances() );
            int answer=multiply(6);
        System.out.println("The answer is "+answer);
        System.out.println("The answer is "+multiplier);

    }


    public static int multiply(int number){
        return number *multiplier;
    }


}



//======================================NOTE=================================
//1.parseInt(),max(),min() are static methods
//2.why we make main() static because it is the entry point of java program and at that time no instances can be created
//3.A STATIC VARIABLE OR A NON-STATIC METHOD CAN'T BE REFERED FROM A STATIC CONTEXT
//E.G:-INSIDE Main() WE CANT REFER TO NON-STATIC FROM Main() BECAUSE THE NON-STATIC DOESN'T EXIST AT THE MOMENT OF STATIC CALL