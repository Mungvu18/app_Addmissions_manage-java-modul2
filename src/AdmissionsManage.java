import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AdmissionsManage {
    public static final String NOT_EXITS = "Not Exits";
    Map<String,Admissions> admissionsMapLists = new TreeMap<>();
    Set<String> keyLists = admissionsMapLists.keySet();
    public void addNewAdmissions(String studentId, Admissions admissions){
        admissionsMapLists.put(studentId,admissions);
    }
    public void showAll(){
        for (String key: keyLists) {
            Admissions admissions = admissionsMapLists.get(key);
            if (admissions instanceof ABlock){
                ABlock aBlock = (ABlock) admissions;
                System.out.println(aBlock);
            } else if (admissions instanceof BBlock){
                BBlock bBlock = (BBlock) admissions;
                System.out.println(bBlock);
            } else if (admissions instanceof CBlock){
                CBlock cBlock = (CBlock) admissions;
                System.out.println(cBlock);
            }
        }
    }
    public void showByStudentId(String studentId){
        boolean testStudentID = false;
        for (String key : keyLists) {
            Admissions admissions = admissionsMapLists.get(key);
            testStudentID = admissions.getStudentId().equalsIgnoreCase(studentId);
            if (testStudentID){
                System.out.println(admissions);
                return;
            }
        }
        if (!testStudentID){
            System.out.println(NOT_EXITS);
        }
    }
}
