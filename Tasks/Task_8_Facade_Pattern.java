class PowerSupply {
    public void turnOn() {
        System.out.println("Power Supply is ON");
    }

    public void turnOff() {
        System.out.println("Power Supply is OFF");
    }
}

class CPU {
    public void processData() {
        System.out.println("CPU is processing data");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory is loading data");
    }
}

class ComputerFacade {
    private PowerSupply powerSupply;
    private CPU cpu;
    private Memory memory;

    public ComputerFacade() {
        powerSupply = new PowerSupply();
        cpu = new CPU();
        memory = new Memory();
    }

    public void turnOnComputer() {
        powerSupply.turnOn();
        cpu.processData();
        memory.load();
        System.out.println("Computer is ON and ready to use.");
    }

    public void turnOffComputer() {
        powerSupply.turnOff();
        System.out.println("Computer is OFF");
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        computer.turnOnComputer();
        computer.turnOffComputer();
    }
}
