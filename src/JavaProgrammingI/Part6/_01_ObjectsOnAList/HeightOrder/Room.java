package JavaProgrammingI.Part6._01_ObjectsOnAList.HeightOrder;

import JavaProgrammingI.Part4._01_IntorductionToOOP.Account.Person;

import java.util.ArrayList;

public class Room {

    private ArrayList<Persone> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    public void add(Persone person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Persone> getPersons() {
        return this.persons;
    }

    public Persone shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Persone shortestPerson = this.persons.get(0);
        for (Persone stp: this.persons) {
            if (shortestPerson.getHeight() > stp.getHeight()) {
                shortestPerson = stp;
            }
        }

        /*for (int i = 1; i < this.persons.size(); i++) {
            if (shortestPerson.getHeight() > this.persons.get(i).getHeight()) {
                shortestPerson = this.persons.get(i);
            }
        }*/
        return shortestPerson;
    }

    public Persone take() {
        if (persons.isEmpty()) {
            return null;
        }
        Persone shortest = shortest();
        int index = 0;
        for (int i = 0; i < this.persons.size(); i++) {
            if (shortest.getHeight() == this.persons.get(i).getHeight()) {
                index = i;
            }
        }
        return persons.remove(index);
    }

}
