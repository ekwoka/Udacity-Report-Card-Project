package net.thekwoka.remportcard;

public class Reportcard {

    private String studentName;

    private String totalGrade;
    private double engGrade;
    private double korGrade;
    private double busGrade;

    public Reportcard(String name, double eng, double kor, double bus){
        studentName = name;

        engGrade = eng;
        korGrade = kor;
        busGrade = bus;

        calculateTotalGrade();
    }

    public String getName(){
        return studentName;
    }

    public double getENG(){
        return engGrade;
    }

    public double getKOR(){
        return korGrade;
    }

    public double getBUS(){
        return busGrade;
    }

    public String getTotalGrade(){
        return totalGrade;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private void calculateTotalGrade() {
        double score = (engGrade + korGrade + busGrade)/3.0;

        if (score >= 4.0){
            totalGrade = "A";
        } else if (score >= 3.0){
            totalGrade = "B";
        } else if (score >= 2.0){
            totalGrade = "C";
        } else if (score >= 1.0){
            totalGrade = "D";
        } else {
            totalGrade = "F";
        }
    }

    public void setEngGrade(double engGrade) {
        this.engGrade = engGrade;
    }

    public void setKorGrade(double korGrade) {
        this.korGrade = korGrade;
    }

    public void setBusGrade(double busGrade) {
        this.busGrade = busGrade;
    }

    public String toString(){
        String result = "Student Name:\u0020" + studentName +
                ", English Score:\u0020" + engGrade +
                ", Korean Score:\u0020" + korGrade +
                ", Business Score:\u0020" + busGrade +
                ", Final Grade:\u0020" + totalGrade +".";
        return result;
    }





}
