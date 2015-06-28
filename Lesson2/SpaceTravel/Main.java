public class MainClass {
    public static void main(String[] args) {
        Ship ship = new Ship();
        System system = new System(); 
        Planet planet = new planet();		
        System.out.println();   
        ship.Warp();
		ship.ScanLocation();
        planet.explore();		
    }
}
