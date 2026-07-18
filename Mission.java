public class Mission {
    private String name;
    private int minExp;
    private int crewCap;
    private String destination;
    private double hazPay;
    private Astronaut[] arr;
    private int count;


    public String getName(){
        return name;
    }
    
    public int getCap(){
        return crewCap;
    }
    
    public int getExp(){
        return minExp;
    }

    public double getPay(){
        return hazPay;
    }


    public void arrIn(Astronaut a){
        if(count<crewCap){
        arr[count] = a;
        count++;
        }
    }

    public int getTotal(){
        return count;
    }

    public Mission(String nm, String dest, int exp, int cap, double pay){
        name = nm;
        destination = dest;
        minExp = exp;
        crewCap = cap;
        hazPay = pay;
        arr = new Astronaut[crewCap];
        count = 0;
    }

}
