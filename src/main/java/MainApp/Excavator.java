package MainApp;

abstract class Machine{
    public abstract void doWork();
    public abstract void stopWork();
}

public class Excavator extends Machine{
    @Override
    public void doWork(){
        System.out.println("Excavator started its work");
    }
    @Override
    public void stopWork(){
        System.out.println("Excavator stopped working");
    }
}

