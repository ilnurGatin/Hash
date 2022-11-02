import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final int number;
    private final String name;
    private final String lastName;
    private final String middleName;

    private final LocalDate date;

    public Passport(int number, String lastName, String name, String middleName, LocalDate date) {
        if (number == 0 || lastName == null || lastName.isBlank() || name == null || name.isBlank() || date == null) {
            throw new IllegalArgumentException("Введены невверные значения");
        } else {
            this.number = number;
            this.name = name;
            this.lastName = lastName;
            this.date = date;
        }
        this.middleName = middleName;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
