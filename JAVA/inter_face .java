class StudInfo {
    String name;
    int rollNumber;
    int mathMark;
    int physicsMark;
    int englishMark;


    void display() {
        System.out.println("Roll Number:" + rollNumber);
        System.out.println("Name:" + name);
        System.out.println("Marks (Maths, Physics, English): " + mathMark + "," + physicsMark + "," + englishMark);
        int total = mathMark + physicsMark + englishMark;
        double perc = (double) total / 3;
        System.out.println("Total:" + total + "\tPercentage:" + perc);
    }
}

class StudentDetails {
    public static void main(String[] args) {
        StudInfo s = new StudInfo();
        s.display();
    }
}
