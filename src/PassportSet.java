import java.util.HashSet;
import java.util.Set;

public class PassportSet {

    private Set<Passport> passportSet = new HashSet<>();

    public void addPassport(Passport passport) {
        if (passportSet.contains(passport)) {
            throw new RuntimeException("Паспорт уже в списке");

        } else {
            passportSet.add(passport);
        }
    }

    public Passport findPassportByNumber(int number) {
        for (Passport passport: passportSet) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}
