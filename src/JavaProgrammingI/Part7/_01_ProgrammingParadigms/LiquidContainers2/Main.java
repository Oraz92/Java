package JavaProgrammingI.Part7._01_ProgrammingParadigms.LiquidContainers2;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.add(150);
        System.out.println(container);
        container.remove(120);
        System.out.println(container.contains());
        container.start();
    }
}
