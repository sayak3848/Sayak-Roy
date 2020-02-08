package abstraction;

public class CheckAbstraction extends AbstractDemo{
	
    void showData() {
        System.out.println("inside show data.");
    }

    public static void main(String[] args) {
        CheckAbstraction abstraction=new CheckAbstraction();
        abstraction.showData();
    }

   

}
