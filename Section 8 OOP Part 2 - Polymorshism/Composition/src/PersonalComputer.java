package src;

public class PersonalComputer extends Product {
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public int powerUp(int x) {
        computerCase.pressPowerButton();
        drawLogo();
        //1463847412
        long newint = 0;
        while (x != 0){
            int last = x % 10;
            newint += last;
            newint *= 10;
            x = (int) (double) x / 10;
        }
        newint = newint/10;
        System.out.println(newint);
        if (newint > -Math.pow(2, 31) && newint < Math.pow(2, 31) - 1){
            return (int) newint;
        } else{
            return 0;
        }
    }

//    public ComputerCase getComputerCase(){
//        return computerCase;
//    }
//    public Monitor getMonitor(){
//        return monitor;
//    }
//    public Motherboard getMotherboard(){
//        return motherboard;
//    }
}
