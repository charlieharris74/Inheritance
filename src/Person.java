import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    /**
     * Creates a Person with all required information.
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param ID the person's ID
     * @param title the person's title
     * @param YOB the person's year of birth
     */
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    /**
     * Gets the person's first name.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the person's first name.
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the person's last name.
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the person's last name.
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the person's ID.
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * Gets the person's title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the person's title.
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the person's year of birth.
     * @return the year of birth
     */
    public int getYOB() {
        return YOB;
    }

    /**
     * Sets the person's year of birth.
     * @param YOB the new year of birth
     */
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    /**
     * Gets the person's full name.
     * @return first name followed by last name
     */
    public String fullName() {
        return firstName + " " + lastName;
    }

    /**
     * Gets the person's formal name.
     * @return title followed by the full name
     */
    public String formalName() {
        return title + " " + fullName();
    }

    /**
     * Calculates the person's age using the current year.
     * @return the person's current age
     */
    public String getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return String.valueOf(currentYear - YOB);
    }

    /**
     * Calculates the person's age in a specified year.
     * @param year the year used to calculate the age
     * @return the person's age in the specified year
     */
    public String getAge(int year) {
        return String.valueOf(year - YOB);
    }

    /**
     * Converts the Person data to CSV format.
     * @return the Person data as a CSV record
     */
    public String toCSV() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    /**
     * Converts the Person data to JSON format.
     * @return the Person data as JSON
     */
    public String toJSON() {
        return "{\"ID\":\"" + ID + "\",\"firstName\":\"" + firstName
                + "\",\"lastName\":\"" + lastName + "\",\"title\":\"" + title
                + "\",\"YOB\":" + YOB + "}";
    }

    /**
     * Converts the Person data to XML format.
     * @return the Person data as XML
     */
    public String toXML() {
        return "<Person><ID>" + ID + "</ID><firstName>" + firstName
                + "</firstName><lastName>" + lastName + "</lastName><title>" + title
                + "</title><YOB>" + YOB + "</YOB></Person>";
    }

    /**
     * Converts the Person to a readable String.
     * @return the Person information
     */
    @Override
    public String toString() {
        return fullName() + " " + ID + " " + title + " " + YOB;
    }

    /**
     * Compares this Person with another object.
     * @param obj the object to compare
     * @return true if all Person fields are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person other = (Person) obj;

        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && ID.equals(other.ID)
                && title.equals(other.title)
                && YOB == other.YOB;
    }
}