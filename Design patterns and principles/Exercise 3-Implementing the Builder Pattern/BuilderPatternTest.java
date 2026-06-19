public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.ComputerBuilder()
                .setProcessor("Intel i9")
                .setRam(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();
        Computer officePC = new Computer.ComputerBuilder()
                .setProcessor("Intel i5")
                .setRam(8)
                .setStorage(512)
                .setGraphicsCard("Integrated Graphics")
                .build();
        System.out.println("Gaming PC Configuration:");
        gamingPC.displayConfiguration();
        System.out.println("\nOffice PC Configuration:");
        officePC.displayConfiguration();
    }
}