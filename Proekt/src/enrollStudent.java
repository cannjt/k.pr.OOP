class InformationSystem {

    public void enrollStudent(int fn, Specialty program, int group, String name) {
        for (Student student : students) {
            if (student.getFacultyNumber() == fn) {
                System.out.println("Error: Student with faculty number " + fn + " already exists.");
                return;
            }
        }

        Student student = new Student(name, fn, program, 1, "Enrolled");
        students.add(student);

        System.out.println("Student enrolled successfully:");
        System.out.println(student.getName() + " | FN: " + student.getFacultyNumber() + " | Program: " + program.getName() + " | Group: " + group);
    }
}
