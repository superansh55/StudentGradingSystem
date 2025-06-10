public class Student {
   private String name;
    private String roll;
    private int[] marks = new int[3];
    private int total;
    private double percentage;
    private char grade;


    public Student(String name, String roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        calculateTotal();
        calculatePercentage();
        assignGrade();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getRoll(){
        return roll;
    }

    public void setRoll(String roll){
        this.roll=roll;
    }

    public int[] getMarks(){
        return marks;
    }

    public void setMarks(int[] marks){
        this.marks=marks;
    }

    public int getTotal(){
        return total;
    }
    public double getPercentage(){
        return percentage;
    }
    public char getGrade(){
        return grade;
    }

    private void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    private void calculatePercentage() {
        percentage = total / 3.0;
    }

    private void assignGrade() {
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    public void displayInfo() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------------");
    }
}
