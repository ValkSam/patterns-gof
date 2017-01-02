package bar.foo.encapsulation;

public class Course {

    private String Name;
    private Integer CourseNumber;
    private Float Fee;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getCourseNumber() {
        return CourseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        CourseNumber = courseNumber;
    }

    public Float getFee() {
        return Fee;
    }

    public void setFee(Float fee) {
        Fee = fee;
    }
}
