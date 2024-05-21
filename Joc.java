
public class Joc {
	
    private String echipa1,echipa2;
    private int goluriEchipa1, goluriEchipa2;
    private int out, cornere;
    
    public Joc(String echipa1, String echipa2) {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.goluriEchipa1 = 0;
        this.goluriEchipa2 = 0;
        this.out = 0;
        this.cornere = 0;
    }
    
    public void simuleaza() {
        Minge m = new Minge(50, 25); 
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + m.getX() + "," + m.getY() + ")");
                m.suteaza();
            } catch (Out e) {
                out++;
                System.out.println(e.getMessage());
            } catch (Gol e) {
                if (m.getX() == 0) {
                    goluriEchipa2++;
                } else {
                    goluriEchipa1++;
                }
                System.out.println(e.getMessage());
                m = new Minge(50, 25); 
            } catch (Corner e) {
                cornere++;
                System.out.println(e.getMessage());
                if (m.getX() == 0) {
                    if (m.getY() == 0) {
                        m = new Minge(0, 0);
                    } else {
                        m = new Minge(0, 50);
                    }
                } else {
                    if (m.getY() == 0) {
                        m = new Minge(100, 0);
                    } else {
                        m = new Minge(100, 50);
                    }
                }
            }
        }
    }
    
    public String toString() {
        return "Echipe: " + echipa1 + " vs " + echipa2 + "\n" + "Scor: " + goluriEchipa1 + " - " + goluriEchipa2 + "\n" +
               "Outuri: " + out + "\n" + "Cornere: " + cornere;
    }
}
