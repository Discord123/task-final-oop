package by.tc.task01.entity.applianceProduct;

public class Laptop extends ApplianceProduct {
    // you may add your own code here
    private String name = "Laptop";
    private double batteryCapacity;
    private String os;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " : ");
        sb.append("BATTERY_CAPACITY=" + batteryCapacity + ", ");
        sb.append("OS=" + os + ", ");
        sb.append("MEMORY_ROM=" + memoryROM + ", ");
        sb.append("SYSTEM_MEMORY=" + systemMemory + ", ");
        sb.append("CPU=" + cpu + ", ");
        sb.append("DISPLAY_INCHS=" + displayInchs + ";");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (Double.compare(laptop.memoryROM, memoryROM) != 0) return false;
        if (Double.compare(laptop.systemMemory, systemMemory) != 0) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (Double.compare(laptop.displayInchs, displayInchs) != 0) return false;
        if (!name.equals(laptop.name)) return false;
        return os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(batteryCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + os.hashCode();
        temp = Double.doubleToLongBits(memoryROM);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(systemMemory);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInchs);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }
}
