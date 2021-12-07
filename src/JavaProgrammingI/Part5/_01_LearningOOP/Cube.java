package JavaProgrammingI.Part5._01_LearningOOP;

public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return (int) Math.pow(this.edgeLength, 3);
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }

    public static void main(String[] args) {
        Cube cube = new Cube(3);
        System.out.println(cube);
    }
}
