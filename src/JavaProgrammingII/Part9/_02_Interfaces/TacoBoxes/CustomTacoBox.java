package JavaProgrammingII.Part9._02_Interfaces.TacoBoxes;

public class CustomTacoBox implements TacoBox {

    private int initialNumberOfTacos;

    public CustomTacoBox(int initialNumberOfTacos) {
        this.initialNumberOfTacos = initialNumberOfTacos;
    }

    @Override
    public int tacosRemaining() {
        return this.initialNumberOfTacos;
    }

    @Override
    public void eat() {
        if (this.initialNumberOfTacos > 0) {
            this.initialNumberOfTacos--;
        }
    }
}
