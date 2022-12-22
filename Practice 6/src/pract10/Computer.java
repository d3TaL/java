package pract10;

public class Computer {
    private String name = "PC";

    private Vendor vendor;
    private Memory memory = new Memory("Memory");
    private Processor CPU = new Processor("CPU");
    private Monitor monitor = new Monitor("Monitor");

    Computer(String name, String monitor, Vendor vendor, String memory, String Processor){
        this.name = name;
        this.vendor = vendor;
        this.memory.setName(memory);
        this.CPU.setName(Processor);
        this.monitor.setName(memory);
    }
    Computer(){
        this.vendor = Vendor.Гарнизон;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMemory()
    {
        return memory.getName();
    }

    public String getMonitor()
    {
        return monitor.getName();
    }

    public String getProcessor()
    {
        return CPU.getName();
    }

    public void setMemory(Memory memory)
    {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor)
    {
        this.CPU = processor;
    }

    public void setVendor(Vendor vendor)
    {
        this.vendor = vendor;
    }

    public String getVendor()
    {
        return vendor.toString();
    }
}
