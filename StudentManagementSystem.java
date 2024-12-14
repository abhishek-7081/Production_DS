import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
import java.util.ArrayList;

class Student {
    String id;
    String name;
    String grade;

    public Student(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    private JFrame frame;
    private JTextField idField, nameField, gradeField;
    private JTextArea displayArea;
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();

        frame = new JFrame("Student Management System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField(10);
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);
        JLabel gradeLabel = new JLabel("Grade:");
        gradeField = new JTextField(10);

        JButton insertButton = new JButton("Insert");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");
        JButton displayButton = new JButton("Display");

        displayArea = new JTextArea(15, 40);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Action Listeners
        insertButton.addActionListener(e -> insertStudent());
        deleteButton.addActionListener(e -> deleteStudent());
        updateButton.addActionListener(e -> updateStudent());
        displayButton.addActionListener(e -> displayStudents());

        // Adding components to the frame
        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(gradeLabel);
        frame.add(gradeField);
        frame.add(insertButton);
        frame.add(deleteButton);
        frame.add(updateButton);
        frame.add(displayButton);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    private void insertStudent() {
        String id = idField.getText();
        String name = nameField.getText();
        String grade = gradeField.getText();

        if (!id.isEmpty() && !name.isEmpty() && !grade.isEmpty()) {
            students.add(new Student(id, name, grade));
            displayArea.setText("Student added successfully!\n");
            clearFields();
        } else {
            displayArea.setText("Please fill all fields!\n");
        }
    }

    private void deleteStudent() {
        String id = idField.getText();
        boolean found = false;

        for (Student student : students) {
            if (student.id.equals(id)) {
                students.remove(student);
                displayArea.setText("Student removed successfully!\n");
                found = true;
                break;
            }
        }
        if (!found) {
            displayArea.setText("Student with ID " + id + " not found.\n");
        }
        clearFields();
    }

    private void updateStudent() {
        String id = idField.getText();
        String name = nameField.getText();
        String grade = gradeField.getText();
        boolean found = false;

        for (Student student : students) {
            if (student.id.equals(id)) {
                student.name = name.isEmpty() ? student.name : name;
                student.grade = grade.isEmpty() ? student.grade : grade;
                displayArea.setText("Student updated successfully!\n");
                found = true;
                break;
            }
        }
        if (!found) {
            displayArea.setText("Student with ID " + id + " not found.\n");
        }
        clearFields();
    }

    private void displayStudents() {
        StringBuilder data = new StringBuilder("Student Details:\n");
        for (Student student : students) {
            data.append(student).append("\n");
        }
        displayArea.setText(data.toString());
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        gradeField.setText("");
    }

    public static void main(String[] args) {
        new StudentManagementSystem();
    }
}
