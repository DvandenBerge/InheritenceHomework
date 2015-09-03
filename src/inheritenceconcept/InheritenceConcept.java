package inheritenceconcept;

public class InheritenceConcept {

    public static void main(String[] args) {
        GamingPC pc1 = new GamingPC();
        System.out.println(pc1 instanceof Computer);
        LightningStrike lightStrike1 = new LightningStrike();
        System.out.println(lightStrike1 instanceof MagicPower);
    }
    
}
