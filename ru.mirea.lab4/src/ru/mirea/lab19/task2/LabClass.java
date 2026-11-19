package ru.mirea.lab19.task2;

public class LabClass {
    private Comparable[] students;

    public LabClass(Comparable[] students) {
        this.students = students;
    }

    public void sort() {
        for (int i = 1; i < students.length; i++) {
            Comparable current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(current) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }

    public Student find(String name) throws StudentNotFoundException {
        if (name.trim().isEmpty()) {
            throw new EmptyStringException();
        }
        for (Comparable c : students) {
            Student s = (Student) c;
            if (s.getName().equalsIgnoreCase(name.trim())) {
                return s;
            }
        }
        throw new StudentNotFoundException(name);
    }

    public void print() {
        for (Comparable c : students) {
            System.out.println(c);
        }
    }
}
