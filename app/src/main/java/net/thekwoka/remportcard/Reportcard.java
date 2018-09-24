package net.thekwoka.remportcard;

public class Reportcard {

    //Initialize Variables
    private String studentName;

    private String totalGrade;
    private double engGrade;
    private double korGrade;
    private double busGrade;

    //Maker Method thing.
    public Reportcard(String name, double eng, double kor, double bus) {
        studentName = name;

        engGrade = eng;
        korGrade = kor;
        busGrade = bus;

        calculateTotalGrade();
    }

    //Return Student's Name
    public String getName() {
        return studentName;
    }

    //Return Student's English Score
    public double getENG() {
        return engGrade;
    }

    //Return Student's Korean Score
    public double getKOR() {
        return korGrade;
    }

    //Return Student's Business Score
    public double getBUS() {
        return busGrade;
    }

    //Return Student's Final Letter Grade
    public String getTotalGrade() {
        return totalGrade;
    }

    //Change Student's Name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //Calculates final Letter Grade from raw category scores
    private void calculateTotalGrade() {
        double score = (engGrade + korGrade + busGrade) / 3.0;

        if (score >= 4.0) {
            totalGrade = "A";
        } else if (score >= 3.0) {
            totalGrade = "B";
        } else if (score >= 2.0) {
            totalGrade = "C";
        } else if (score >= 1.0) {
            totalGrade = "D";
        } else {
            totalGrade = "F";
        }
    }

    //Change English Score and recaldulate Letter Grade
    public void setEngGrade(double engGrade) {
        this.engGrade = engGrade;
        calculateTotalGrade();
    }

    //Change Korean Score and recalculate Letter Grade
    public void setKorGrade(double korGrade) {
        this.korGrade = korGrade;
        calculateTotalGrade();
    }

    //Change Business score and recalculate Letter Grade
    public void setBusGrade(double busGrade) {
        this.busGrade = busGrade;
        calculateTotalGrade();
    }

    //Provide a single line string of data contained in item. Required for Project.
    public String toString() {
        String result = "Student Name:\u0020" + studentName +
                ", English Score:\u0020" + engGrade +
                ", Korean Score:\u0020" + korGrade +
                ", Business Score:\u0020" + busGrade +
                ", Final Grade:\u0020" + totalGrade + ".";
        return result;
    }


}
