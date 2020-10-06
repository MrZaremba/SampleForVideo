

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Person {
    private final StringProperty firstName = new SimpleStringProperty() ;
    private final StringProperty lastName = new SimpleStringProperty() ;
    private final StringProperty email = new SimpleStringProperty() ;


    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);

    }


    public final StringProperty firstNameProperty() {//This returns string property
        return this.firstName;
    }

    public final java.lang.String getFirstName() {//Gets the string
        return this.firstNameProperty().get();
    }

    public final void setFirstName(final java.lang.String firstName) {// Sets first name
        this.firstNameProperty().set(firstName);
    }

    public final StringProperty lastNameProperty() {// Returns property of string last name
        return this.lastName;
    }

    public final java.lang.String getLastName() {
        return this.lastNameProperty().get();
    }

    public final void setLastName(final java.lang.String lastName) {
        this.lastNameProperty().set(lastName);
    }

    public final StringProperty emailProperty() {
        return this.email;
    }

    public final java.lang.String getEmail() {
        return this.emailProperty().get();
    }

    public final void setEmail(final java.lang.String email) {
        this.emailProperty().set(email);
    }



    @Override
    public String toString() {
        return getFirstName() + " "+ getLastName() +  " " +getEmail() ;
    }


    public static void writeToTextFile(String filename, ObservableList<Person> people)  //writes to file based on filename and writes an list of Person Class
            throws IOException {
        File file = new File(filename);
        FileWriter writer = new FileWriter(file);
        for (Person person : people) {
            writer.write(person.getFirstName() + "," + person.getLastName() +","+ person.getEmail() + ","+ "\n");
        }
        writer.close();
    }


    public static Person readFriends(String filename)  //reads file based on filename
            throws IOException {
        Person person = null;
        BufferedReader reader = Files.newBufferedReader(Paths.get(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] names = line.split(",", 3);

            person = new Person(names[0], names[1], names[2]);
        }

        return person;
    }
}



