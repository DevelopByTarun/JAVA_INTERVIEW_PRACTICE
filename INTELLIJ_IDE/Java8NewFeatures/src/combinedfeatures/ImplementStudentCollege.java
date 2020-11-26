package combinedfeatures;

public interface ImplementStudentCollege {

    public void addStudentRecordInCollege(StudentCollege stud) throws Exception;

    public void deleteStudentRecordInCollege(int sid) throws Exception;
    
    public void getStudentRecordInCollegeBySid(int sid) throws Exception;

    public void getAllStudentsRecordInCollege() throws Exception;

    public void getAllStudentsRecordInDescendingOrderInCollege() throws Exception;
    
    public void getTotalNumberOfStudentsInCollege() throws Exception;

    public void getAverageStudentFeesInCollege() throws Exception;

    public void getComparisionAndSortOfAllStudentsRecordsInCollegeByName() throws Exception;

    public void getComparisionAndSortOfAllStudentsRecordsInCollegeByAge() throws Exception;

}
