package inheritenceconcept;

public abstract class Computer {
    private boolean isOn;
    
    public void turnOn(){
        if(isOn){
            System.out.println("Already on");
        }else{
            isOn=true;
            System.out.println("Hello world");
        }
    }
    
    public void turnOff(){
        isOn=false;
        System.out.println("Goodbye");
    }
}
