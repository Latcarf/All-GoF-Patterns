package Patterns.CreationalPatterns.Prototype;

/**
 * Prototype is a creational design pattern that allows objects to be copied without having to go into the details of their implementation.
 */

public class Main {
    public static void main(String[] args) {
        Project newProject = new Project(1, "newProject", "Java");
        System.out.println(newProject);

        ProjectFactory projectFactory = new ProjectFactory(newProject);
        Project newProjectClone = projectFactory.cloneProject();

        System.out.println(newProjectClone);

    }
}
