package March18_2020;

public class InterviewClass {
    private String candidateName;
    private int candidateScore;
    private String finalDecision;
    private int javaPoint;
    private int sqlPoint;
    private int softSkills;

    InterviewClass() {
        String candidateName = "John";
        int candidateScore = 80;
        String finalDecision = "Accept";
        int javaPoint = 0;
        int sqlPoint = 0;
        int softSkills = 50;
    }
    public InterviewClass(String candidateName, int candidateScore, String finalDecision, int javaPoint, int sqlPoint, int softSkills) {
        this.candidateName = candidateName;
        this.candidateScore = candidateScore;
        this.finalDecision = finalDecision;
        this.javaPoint = javaPoint;
        this.sqlPoint = sqlPoint;
        this.softSkills = softSkills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getCandidateScore() {
        return candidateScore;
    }

    public String getFinalDecision() {
        return finalDecision;
    }

    public int getJavaPoint() {
        return javaPoint;
    }

    public int getSqlPoint() {
        return sqlPoint;
    }

    public int getSoftSkills() {
        return softSkills;
    }
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public void setCandidateScore(int candidateScore) {
        this.candidateScore = candidateScore;
    }

    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    public void setJavaPoint(int javaPoint) {
        this.javaPoint = javaPoint;
    }

    public void setSqlPoint(int sqlPoint) {
        this.sqlPoint = sqlPoint;
    }

    public void setSoftSkills(int softSkills) {
        this.softSkills = softSkills;
    }
    @Override
    public String toString() {
        return "InterviewClass{" +
                "candidateName='" + candidateName + '\'' +
                ", candidateScore=" + candidateScore +
                ", finalDecision='" + finalDecision + '\'' +
                ", javaPoint=" + javaPoint +
                ", sqlPoint=" + sqlPoint +
                ", softSkills=" + softSkills +
                '}';
    }

    public int Calculation() {
        int result = javaPoint + sqlPoint + softSkills;
        return result;
    }
    public void Decision() {
        if (Calculation() <= 100 || Calculation() >= 80) {
            System.out.println("We can offer you position");
        } else {
            System.out.println(("Try again another time"));
        }
    }
}