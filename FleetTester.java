public class FleetTester {
    public static void main(String[] args) {
        Mission m1 = new Mission("Apollo-X", "Mars", 5, 3, 2000.0);
        Mission m2 = new Mission("Voyager-Z", "Jupiter", 10, 5, 4000.0);
        
        System.out.println("Total Assigned Crew: " + Astronaut.getTotalAssigned());
        
        Astronaut a1 = new Astronaut("Ripley", 12, "Pilot", "Veteran");
        
        System.out.println("1==========================");
        a1.assign(m1);
        System.out.println("2==========================");
        a1.assign(m2);
        System.out.println("3==========================");
        a1.showDetails();
        
        Astronaut a2 = new Astronaut("Cooper", 3, "Engineer", "Rookie");
        System.out.println("4==========================");
        a2.assign(m1);
        
        Astronaut a3 = new Astronaut("McCoy", 2, "Medic", "Officer");
        System.out.println("5==========================");
        a3.assign(m1);
        
        Astronaut a4 = new Astronaut("Holden", 8, "Veteran");
        System.out.println("6==========================");
        a4.assign(m1);
        a4.showDetails();
        
        System.out.println("7==========================");
        Astronaut a5 = new Astronaut("Miller", 6, "Security", "Officer");
        a5.assign(m1);
        
        System.out.println("8==========================");
        System.out.println("Total Assigned Crew: " + Astronaut.getTotalAssigned());
    }
}