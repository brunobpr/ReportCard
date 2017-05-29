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
        mMathsGrade = mathsGrade;
        mEnglishGrade = englishGrade;
        mGeographyGrade = geographyGrade;
        mHistoryGrade = historyGrade;
    }

    //Getting student and date
    public int getStudentIdentity() {
        return mStudentIdentity;
    }

    public void setStudentIdentity(int studentIdentity) {
        mStudentIdentity = studentIdentity;
    }

    //Setting student and date

    public int getCurrentYear() {
        return mCurrentYear;
    }

    public void setCurrentYear(int currentYear) {
        mCurrentYear = currentYear;
    }

    //Getting grades of the student
    public String getPortugueseGrade() {
        return mPortugueseGrade;
    }

    //Setting grade of the student
    public void setPortugueseGrade(String portugueseGrade) {
        mPortugueseGrade = portugueseGrade;
    }

    public String getMathsGrade() {
        return mMathsGrade;
    }

    public void setMathsGrade(String mathsGrade) {
        mMathsGrade = mathsGrade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        mEnglishGrade = englishGrade;
    }

    public String getGeographyGrade() {
        return mGeographyGrade;
    }

    public void setGeographyGrade(String geographyGrade) {
        mGeographyGrade = geographyGrade;
    }

    public String getHistoryGrade() {
        return mHistoryGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        mHistoryGrade = historyGrade;
    }

    @Override
    public String toString() {
        return "Student ID:" + mStudentIdentity +
                "\nGrades from: " + mCurrentYear +
                "\nPortuguese: " + mPortugueseGrade +
                "\nMathematics: " + mMathsGrade +
                "\nEnglish: " + mEnglishGrade +
                "\nGeography: " + mGeographyGrade +
                "\nHistory: " + mHistoryGrade;
    }
}
