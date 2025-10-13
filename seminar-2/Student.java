class Student {
  private String name;
  private int studentId;
  private int age;
  private double gpa;

  public Student(String name, int studentId, int age, double gpa) {

    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }

    if (studentId <= 0) {
      throw new IllegalArgumentException("StudentID cannot be null or below 1");
    }

    if (age < 0 || age > 150) {
      throw new IllegalArgumentException("Age cannot be null or below 0");
    }

    if (gpa < 0 || gpa > 4) {
      throw new IllegalArgumentException("GPA cannot be null, below 0 or above 4");
    }

    this.name = name;
    this.studentId = studentId;
    this.age = age;
    this.gpa = gpa;
  }

  public Student(String name, int studentId) {

    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }

    if (studentId <= 0) {
      throw new IllegalArgumentException("StudentID cannot be null or below 1");
    }

    this.name = name;
    this.studentId = studentId;
    this.age = 18;
    this.gpa = 0;
  }

  public void updateGPA(double newGPA) {
    this.gpa = newGPA;
  }

  public void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("studentId: " + this.studentId);
    System.out.println("age: " + this.age);
    System.out.println("GPA: " + this.gpa);    
  }

  public boolean isHonorStudent() {
    return this.gpa >= 3.5;
  }

  public boolean canGraduate() {
    return this.gpa >= 2.0;
  }

  public static void main(String[] args) {
        // Create instances of the Student class
        Student student1 = new Student("Alice", 1001, 20, 3.8);
        Student student2 = new Student("Bob", 1002);
        Student student3 = new Student("Charlie", 1003);

        // Test the methods
        student1.displayInfo();
        System.out.println("Honor Student: " + student1.isHonorStudent());
        System.out.println("Can Graduate: " + student1.canGraduate());

        student2.updateGPA(2);
        student2.displayInfo();
        System.out.println("Honor Student: " + student2.isHonorStudent());
        System.out.println("Can Graduate: " + student2.canGraduate());

        student3.updateGPA(4);
        student3.displayInfo();
        System.out.println("Honor Student: " + student3.isHonorStudent());
        System.out.println("Can Graduate: " + student3.canGraduate());
    }
}