package lecture09;

import java.time.LocalDate;

/*
Create class Person which has the following attributes:
        name, sex, religion, language spoken, job, nationality, EGN, date of birth, age, country of residence.
        The date of birth attribute and age are composed during the creation of an object based on the EGN.
        EGN consists of 10 digits. If provided value for EGN is not correct throw exception.
        If wrong sex is provided program must continue its normal execution with printing relevant message.
        Only job and country of residence could change their values. All other attributes can`t be changed once they are set.

        The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant parameters if any.
        sayHello() should print Hello based on concrete person spoken language, default is in English.
        celebrateEaster should print if the concrete person celebrates Easter based on their religion.
        isAdult should take in consideration the country of residence.
        canTakeLoan is based on the job.
        Languages – Bulgarian / Italian / English; Countries – Bulgaria (18) / Italy (18) / USA (21); Sex – Male / Female
        Religions – Orthodox / Catholic / Islam

*/
abstract public class Person {
    protected final String name;
    protected final String sex;
    protected final String language;
    protected final String nationality;
    protected final String EGN;
    protected final String birthDay;
    protected final String religion;
    protected final int age;
    protected String job;
    protected String country;


    public Person(String name, String sex, String language, String nationality, String EGN, String religion, String job, String country) {
        checkValidEGN(EGN);
        this.name = name;
        this.sex = getValidSex(sex);
        this.language = language;
        this.nationality = nationality;
        this.EGN = EGN;
        this.religion = religion;
        this.job = job;
        this.country = country;
        this.age = calculateAge(EGN);
        this.birthDay = calculateBirthday(EGN);
    }

    public String getValidSex(String sex) {
        if (sex != "Female" && sex != "Male") {
            System.out.println("Unknown sex is passed.");
            return "Female";
        }
        return sex;
    }

    public void checkValidEGN(String EGN) {
        int lenghtEGN = EGN.length();
        if (lenghtEGN != 10) {
            throw new RuntimeException("The EGN must be exactly 10 symbols");
        }
        for (char c : EGN.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new RuntimeException("The EGN must consist only digits");
            }
        }
    }


    abstract public void sayHello();

    public void celebrateEaster() {
        if (this.religion == "Orthodox" || this.religion == "Catholic") {
            System.out.println("I celebrate Easter.");
        } else {
            System.out.println("I don't celebrate Easter.");
        }
    }

    abstract public Boolean isAdult();

    public Boolean canTakeLoan() {
        return (this.job != null && isAdult());
    }

    public String getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    private int calculateAge(String EGN) {
        int currentYear = LocalDate.now().getYear();

        String yearDigitsString = EGN.substring(0, 2);
        int yearDigits = Integer.parseInt(yearDigitsString);
        char monthDigit = EGN.toCharArray()[2];
        int yearsToAdd = 1900;

        if (monthDigit == '4' || monthDigit == '5') {
            yearsToAdd = 2000;
        }
        int birthYear = yearsToAdd + yearDigits;
        int age = currentYear - birthYear;

        return age;
    }

    // dd-mm
    private String calculateBirthday(String EGN) {
        String monthDigits = EGN.substring(2, 4);
        String dayDigits = EGN.substring(4, 6);

        int monthDigitsInt = Integer.parseInt(monthDigits);
        if (monthDigitsInt > 12) {
            monthDigitsInt -= 40;
        }

        String birthDay = dayDigits + "-" + monthDigitsInt;
        return birthDay;
    }

    @Override
    public String toString() {
        return "name='" + name + "'\n" +
                "sex='" + sex + "'\n" +
                "language='" + language + "'\n" +
                "nationality='" + nationality + "'\n" +
                "EGN='" + EGN + "'\n" +
                "birthDay='" + birthDay + "'\n" +
                "religion='" + religion + "'\n" +
                "age=" + age + "\n" +
                "job='" + job + "'\n" +
                "country='" + country + "'\n";
    }

}
