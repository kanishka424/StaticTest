public class StaticTest {
    private static int numInstances=0;//since static this belongs to the class not the instance
    private String name;

    public StaticTest(String name){
        this.name=name;
        numInstances++;
    }

    public static int getNumInstances(){//since static this belongs to the class not the instance
        return numInstances;
    }

    public String getName(){
        return name;
    }
}
