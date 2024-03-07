package Patterns.CreationalPatterns.Prototype;

import java.util.Objects;

public class Project implements Prototype {
    private int id;
    private String name;
    private String courseCode;

    public Project(int id, String name, String courseCode) {
        this.id = id;
        this.name = name;
        this.courseCode = courseCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, name, courseCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
