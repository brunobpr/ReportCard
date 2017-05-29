/**
 * Created by Bruno on 5/29/2017.
 */

public class ReportCard {
    //Student identity number and date
    private int mStudentIdentity;
    private int mCurrentYear;
    //Student grades is measured from A to F
    private String mPortugueseGrade;
    private String mMathsGrade;
    private String mEnglishGrade;
    private String mGeographyGrade;
    private String mHistoryGrade;

    public ReportCard(int studentIdentity, int currentYear, String portugueseGrade, String mathsGrade, String englishGrade, String geographyGrade, String historyGrade) {
        mStudentIdentity = studentIdentity;
        mCurrentYear = currentYear;
        mPortugueseGrade = portugueseGrade;
        mMathsGrade  = mathsGrade;
        mEnglishGrade = englishGrade;
        mGeographyGrade = geographyGrade;
        mHistoryGrade = historyGrade;
    }

    //Getting student and date
    public int getStudentIdentity(){return mStudentIdentity;}
    public int getCurrentYear(){return mCurrentYear;}
    //Getting grades of the student
    public String getPortugueseGrade(){return mPortugueseGrade;}
    public String getMathsGrade() {return mMathsGrade;}
    public String getEnglishGrade() {return mEnglishGrade;}
    public String getGeographyGrade() {return mGeographyGrade;}
    public String getHistoryGrade(){return mHistoryGrade;}

    @Override
    public String toString(){
        return "Student ID:" + mStudentIdentity +
                "\nGrades from: " + mCurrentYear +
                "\nPortuguese: " + mPortugueseGrade +
                "\nMathematics: " + mMathsGrade +
                "\nEnglish: " + mEnglishGrade +
                "\nGeography: " + mGeographyGrade+
                "\nHistory: " + mHistoryGrade;
    }
}
