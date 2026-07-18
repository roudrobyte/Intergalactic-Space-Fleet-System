public class Astronaut {
    public String name;
    public int asExp;
    public String spec;
    public String rank;
    public String misName;
    public double pay;
    public static int total = 0;

    
    public Astronaut(String nm, int exp, String spec, String rank) {
        name = nm;
        asExp = exp;
        this.spec = spec;
        this.rank = rank;
    }

    
    public Astronaut(String nm, int exp, String rank) {
        this(nm, exp, "Generalist", rank);
    }

    public void assign(Mission obj) {
    
        if (this.misName != null) {
            System.out.println("Sorry " + name + ", you cannot join multiple missions. You are locked to " + this.misName + ".");
            return;
        }

    
        if (obj.getTotal() >= obj.getCap()) {
            System.out.println("Sorry " + name + ", the " + obj.getName() + " mission has reached its maximum crew capacity of " + obj.getCap() + ".");
            return;
        }

    
        if (this.asExp < obj.getExp() && !this.spec.equals("Medic")) {
            System.out.println("Sorry " + name + ", minimum experience for " + obj.getName() + " is " + obj.getExp() + " years.");
            return;
        }

    
        this.misName = obj.getName();
        this.pay = obj.getPay();
        
        if (this.rank.equals("Veteran")) {
            this.pay += 500.0;
        }

        obj.arrIn(this);
        total++;

    
        if (this.spec.equals("Medic")) {
            System.out.println("Assignment successful for " + name + " on " + misName + ". Hazard Pay: $" + pay + " (Medic experience bypass applied)");
        } else {
            System.out.println("Assignment successful for " + name + " on " + misName + ". Hazard Pay: $" + pay);
        }
    }

    public void showDetails() {
        System.out.println("ID: Astro-" + name + "-" + spec + ", Name: " + name + ", Exp: " + asExp + " yrs, Rank: " + rank);
        System.out.println("Mission: " + misName + ", Specialty: " + spec + ", Pay Status: $" + pay + " Cleared.");
    }

    public static int getTotalAssigned() {
        return total;
    }
}