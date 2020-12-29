import java.util.Scanner;

public class MainTest {
    public static final String ENTER_STUDENT_ID = "Enter studentId";
    public static final String ENTER_NAME = "Enter name";
    public static final String ENTER_ADDRESS = "Enter address";
    public static final String ENTER_PRIORITY_AREA = "Enter priorityArea";
    public static final String ENTER_BLOCK_OF_STUDENT_INTO_ABOCK_BBLOCK_CBLOCK = "Enter Block of student into [ABock,BBlock,CBlock]";
    public static final String A_BLOCK = "ABlock";
    public static final String B_BLOCK = "BBlock";
    public static final String C_BLOCK = "CBlock";
    public static final String MENU = "Menu: ";
    public static final String ADD_NEW_ADMISSIONS = "1: Add new Admissions";
    public static final String SHOW_ALL = "2: Show all";
    public static final String SHOW_BY_STUDENT_ID = "3: Show by Student Id";
    public static final String EXIT_PROGRAM = "0: Exit program";
    public static final String ENTER_CHOICE = "Enter choice";
    public static final String ENTER_AMOUNT_YOU_WANT_TO_ADD = "Enter amount you want to add";
    public static final String MATH_SCORE = " mathScore ";
    public static final String CHEMICAL_SCORES = " chemicalScores ";
    public static final String PHYSICAL_SCORE = " physicalScore ";
    public static final String BIOLOGICAL_SCORE = " biologicalScore ";
    public static final String LITERARY_SCORES = " literaryScores ";
    public static final String HISTORY_SCORES = " historyScores ";
    public static final String GEOGRAPHY_SCORES = " geographyScores ";
    public static final String ENTER = "Enter";
    public static final String INTO_0_10 = "into [0,10]";
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int ZERO = 0;
    public static final int TEN = 10;
    static String scoresOfKindOfSubjects ="";
    static double mathScores = -1;
    static double chemicalScores = -1;
    static double physicalScores = -1;
    static double biologicalScores = -1;
    static double literaryScores = -1;
    static double historyScores = -1;
    static double geographyScores = -1;
    static AdmissionsManage admissionsManage = new AdmissionsManage();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                   addNewAdmissions();
                    break;
                case TWO:
                    admissionsManage.showAll();
                    break;
                case THREE:
                    findAndShowByStudentId();
                    break;
                case ZERO:
                    System.exit(ZERO);
                    break;
            }
        } while (choice != ZERO);
    }

    private static void addNewAdmissions() {
        int amount;
        do {
            System.out.println(ENTER_AMOUNT_YOU_WANT_TO_ADD);
            amount = Integer.parseInt(sc.nextLine());
        } while (amount<0);
        for (int i = 0; i < amount; i++) {
            addAdmissions();
        }
    }

    private static void findAndShowByStudentId() {
        System.out.println(ENTER_STUDENT_ID);
        String studentId = sc.nextLine();
        admissionsManage.showByStudentId(studentId);
    }

    private static void menuShow() {
        System.out.println(MENU);
        System.out.println(ADD_NEW_ADMISSIONS);
        System.out.println(SHOW_ALL);
        System.out.println(SHOW_BY_STUDENT_ID);
        System.out.println(EXIT_PROGRAM);
        System.out.println(ENTER_CHOICE);
    }
    private static void addAdmissions() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_STUDENT_ID);
        String studentId = sc1.nextLine();
        System.out.println(ENTER_NAME);
        String name = sc.nextLine();
        System.out.println(ENTER_ADDRESS);
        String address = sc1.nextLine();
        System.out.println(ENTER_PRIORITY_AREA);
        String priorityArea = sc.nextLine();
        boolean testABlock;
        boolean testBBlock;
        boolean testCBlock;
        do {
            System.out.println(ENTER_BLOCK_OF_STUDENT_INTO_ABOCK_BBLOCK_CBLOCK);
            String block = sc1.nextLine();
            testCBlock = block.equalsIgnoreCase(C_BLOCK);
            testBBlock = block.equalsIgnoreCase(B_BLOCK);
            testABlock = block.equalsIgnoreCase(A_BLOCK);
            if (testABlock) {
                scoresOfKindOfSubjects = MATH_SCORE;
                testScores(mathScores);
                scoresOfKindOfSubjects = CHEMICAL_SCORES;
                testScores(chemicalScores);
                scoresOfKindOfSubjects = PHYSICAL_SCORE;
                testScores(physicalScores);
                Admissions aBlock = new ABlock(studentId, name, address, priorityArea, mathScores, chemicalScores, physicalScores);
                admissionsManage.addNewAdmissions(studentId, aBlock);
            } else if (testBBlock) {
                scoresOfKindOfSubjects = MATH_SCORE;
                testScores(mathScores);
                scoresOfKindOfSubjects = CHEMICAL_SCORES;
                testScores(chemicalScores);
                scoresOfKindOfSubjects = BIOLOGICAL_SCORE;
                testScores(biologicalScores);
                Admissions bBlock = new BBlock(studentId, name, address, priorityArea, mathScores, chemicalScores, biologicalScores);
                admissionsManage.addNewAdmissions(studentId, bBlock);
            } else if (testCBlock) {
                scoresOfKindOfSubjects = LITERARY_SCORES;
                testScores(literaryScores);
                scoresOfKindOfSubjects = HISTORY_SCORES;
                testScores(historyScores);
                scoresOfKindOfSubjects = GEOGRAPHY_SCORES;
                testScores(geographyScores);
                CBlock cBlock = new CBlock(studentId, name, address, priorityArea, literaryScores, historyScores, geographyScores);
                admissionsManage.addNewAdmissions(studentId, cBlock);
            }
        } while (!testABlock && !testBBlock && !testCBlock);
    }
    public static void testScores( double scores){
        do {
                System.out.println(ENTER + scoresOfKindOfSubjects + INTO_0_10);
                scores = Double.parseDouble(sc.nextLine());
        }while (scores < ZERO || scores > TEN);
    }
}
