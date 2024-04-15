public class Main {
    public static void main(String[] args) {
        InformationSystem system = new InformationSystem();
        
        Specialty compSci = new Specialty("Computer Science");
        system.enrollStudent(12345, compSci, 1, "John Doe");

    }
}
