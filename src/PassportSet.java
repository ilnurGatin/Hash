import java.util.HashSet;
import java.util.Set;

public class PassportSet {

    private Set<Passport> passportSet = new HashSet<>();

    public void addPassport(Passport passport) {
        passportSet.add(passport);
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
