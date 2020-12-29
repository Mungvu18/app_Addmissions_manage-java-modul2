public class BBlock extends Admissions {
    private double mathScores;
    private double chemicalScores;
    private double biologicalScores;

    public BBlock(String studentId, String name, String address, String priorityArea,
                  double mathScores, double chemicalScores, double biologicalScores) {
        super(studentId, name, address, priorityArea);
        this.biologicalScores = biologicalScores;
        this.mathScores = mathScores;
        this.biologicalScores = biologicalScores;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mathScores=" + mathScores +
                ", chemicalScores=" + chemicalScores +
                ", biologicalScores=" + biologicalScores +
                '}';
    }
}
