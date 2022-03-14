package JavaProgrammingII.Part12.TypeParameters;

/*
Implement a class called Pipe, which has a single generic parameter type. The pipe works, such that we can add values
into it and values can be taken out. Adding to the pipe happens from one end, and taking out from the other end.
In other words, we always remove the value which has been inside the pipe the longest and add to it the newest value.
The class should provide a parameterless constructor as well as the following three methods:

public void putIntoPipe(T value) puts an object with a type in accordance with the type parameter given to the the
class into the pipe.

public T takeFromPipe() takes out the value, which has been in the pipe the longest. In case there is nothing in the
pipe, return null. Calling the method returns the value, which has been in the pipe the longest, and removes it from
the pipe.

public boolean isInPipe() returns the value true if the pipe has values. In case the pipe is empty, it returns the value
false.
 */

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipes.add(0, value);
    }

    public T takeFromPipe() {
        if (this.pipes.isEmpty()) {
            return null;
        }
        T value = this.pipes.get(this.pipes.size() - 1);
        this.pipes.remove(this.pipes.size() - 1);
        return value;
    }

    public boolean isInPipe() {
        return !this.pipes.isEmpty();
    }

    public static void main(String[] args) {
        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }

        System.out.println();

        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }
}
