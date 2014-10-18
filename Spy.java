public class Spy {
    
    private static int spyCount = 0;
    
    private int spyID;
    
    public Spy(int spyID) {
        spyCount++;
        this.spyID = spyID;
        
        System.out.println("Spy ID: " + this.spyID +
                           "\nTotal Spies; " + spyCount);
    }
    
    public void die() {
        spyCount--;
        System.out.println("Spy " + this.spyID +
                           " Has been detected and eliminated." +
                           "\nTotal Spies: " + spyCount);
    }
    
    public static void main(String[] args) {
        int spyID = Integer.parseInt(args[0]);
        Spy spy1 = new Spy(spyID);
        spyID = Integer.parseInt(args[1]);
        Spy spy2 = new Spy(spyID);
        spyID = Integer.parseInt(args[2]);
        Spy spy3 = new Spy(spyID);
        spyID = Integer.parseInt(args[3]);
        Spy spy4 = new Spy(spyID);
        spy4.die();
/*         userSpy.launch();
 */ }
    
    /* public void launch() { */
        
         
}