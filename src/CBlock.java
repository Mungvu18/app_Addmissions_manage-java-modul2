public class CBlock extends Admissions{
    private double literaryScores;
    private double historyScores;
    private double geographyScores;
    public CBlock(String studentId, String name, String address, String priorityArea,
                  double literaryScores, double historyScores, double geographyScores) {
        super(studentId, name, address, priorityArea);
        this.geographyScores = geographyScores;
        this.historyScores = historyScores;
        this.literaryScores = literaryScores;
    }

    @Override
    public String toString() {
        return super.toString() +
                "literaryScores=" + literaryScores +
                ", historyScores=" + historyScores +
                ", geographyScores=" + geographyScores +
                '}';
    }
}
