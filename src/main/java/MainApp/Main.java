package MainApp;

public class Main {
    public static void main(String[] args) {
        Machine[] array = {new Truck(), new Bulldozer(), new Excavator()};
        for(Machine machine : array){
            machine.doWork();
            machine.stopWork();
        }
    }
}
