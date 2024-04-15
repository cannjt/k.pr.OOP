class InformationSystem {

    public void advanceStudent(int fn) {

        for (Student student : students) {
            if (student.getFacultyNumber() == fn) {
                student.setCurrentCourse(student.getCurrentCourse() + 1);
                System.out.println("Student " + student.getName() + " advanced to course " + student.getCurrentCourse());
                return;
            }
        }
        System.out.println("Error: Student with faculty number " + fn + " not found.");
    }
}
