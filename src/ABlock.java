public class ABlock extends Admissions{
    private double mathScores;
    private double chemicalScores;
    private double physicalScores;
    public ABlock(String studentId, String name, String address, String priorityArea,
                  double mathScores, double chemicalScores, double physicalScores) {
        super(studentId, name, address, priorityArea);
        this.chemicalScores = chemicalScores;
        this.mathScores = mathScores;
        this.physicalScores = physicalScores;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mathScores='" + mathScores + '\'' +
                ", chemicalScores='" + chemicalScores + '\'' +
                ", physicalScores='" + physicalScores + '\'' +
                '}';
    }
}
