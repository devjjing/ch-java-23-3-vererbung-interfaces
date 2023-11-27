public class Main{
    public static void main(String[] args){
        ElectronicDevice mouse = new ElectronicDevice();
        mouse.setPriceInCent(8790);
        mouse.setName("MX Master 3S");
        mouse.setEnergyConsumptioninWatt(1);

        ElectronicDevice keyboard = new ElectronicDevice();
        keyboard.setPriceInCent(9590);
        keyboard.setName("MX Keys S");
        keyboard.setEnergyConsumptionInWatt(500);

        Screen smartTv = new Screen();
        smartTv.setPriceInCent(99900);
        smartTv.setName("OLED Smart TV");
        smartTv.setEnergyConsumptionInWatt(90);
        smartTv.setResolutionX(3840);
        smartTv.setResolutionY(2160);
    }
    public static void printElectronicDevice(ElectronicDevice a) {
        System.out.println(a);
    }
}