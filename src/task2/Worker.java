package task2;


public class Worker{
    private String surname;
    private String position;
    private int year;

    public Worker(String surname, String position) {
        this.surname = surname;
        this.position = position;

    }
    public Worker(int year){
        this.year = year;
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", year=" + year +
                '}';
    }
}
