public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String toString() {
        return id + " " + name + " " + cgpa;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        Student comparedStudent = (Student) compared;

        return this.id == comparedStudent.id &&
                this.name.equals(comparedStudent.name) &&
                this.cgpa == comparedStudent.cgpa;
    }

    public int hashCode() {
        return id + 31 * name.hashCode() + (int) cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int result = 0;
        if (this.cgpa < o.cgpa) {
            result = 1;
        } else if (this.cgpa > o.cgpa) {
            result = -1;
        } else {
            if (!this.name.equals(o.name)) {
                return this.name.compareTo(o.name);
            } else {
                return Integer.compare(this.id, o.id);
            }
        }
        return result;
    }

    /*public int compareTo(Student compared) {
        //int cgpaCmp = cgpa.compareTo(compared);
        if (this.cgpa == compared.cgpa) {
            return 0;
        }
        return 0;
    }*/


}
