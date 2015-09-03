package inheritenceconcept;

public abstract class Computer {
    private boolean isOn;
    
    public void turnOn(){
        if(isOn){
            System.out.println("Already on");
        }else{
            System.out.println("Hello world");
        }
    }
    
    public void turnOff(){
        System.out.println("Goodbye");
    }
}
