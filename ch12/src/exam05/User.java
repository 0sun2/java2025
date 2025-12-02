package exam05;

public class User extends Thread{
    private Calculator cal;
    private int memory;

    public User(String name) {
        setName(name);
}

    public void setCalculator(Calculator cal, int memory) {
        this.cal = cal;
        this.memory = memory;
    }

    public void run() {
        cal.setMemory(memory);
    }
}
