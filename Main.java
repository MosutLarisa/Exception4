
public class Main {
	
    public static void main(String[] args) {
    	
        Joc joc1 = new Joc("Echipa1", "Echipa2");
        joc1.simuleaza();
        System.out.println(joc1);
        
        Joc joc2 = new Joc("Echipa3", "Echipa4");
        joc2.simuleaza();
        System.out.println(joc2);
    }
}
