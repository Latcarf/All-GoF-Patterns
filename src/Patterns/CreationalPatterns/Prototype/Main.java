package Patterns.CreationalPatterns.Prototype;

/**
 * Prototype - это порождающий паттерн проектирования, который позволяет копировать объекты,
 * не вдаваясь в подробности их реализации.
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
