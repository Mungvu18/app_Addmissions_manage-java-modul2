public class Admissions {
    private String studentId;
    private String name;
    private String address;
    private String priorityArea;

    public Admissions(String studentId, String name, String address, String priorityArea) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }
    public String getStudentId(){
        return  this.studentId;
    }

    @Override
    public String toString() {
        return "Admissions{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea='" + priorityArea + '\'';
    }
}
