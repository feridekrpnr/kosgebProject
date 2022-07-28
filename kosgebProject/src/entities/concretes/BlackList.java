package entities.concretes;

public class BlackList {
    private int blackId;
    private Applicant applicant;

    public BlackList() {
    }

    public BlackList(int blackId, Applicant applicant) {
        this.blackId = blackId;
        this.applicant = applicant;
    }

    public int getBlackId() {
        return blackId;
    }

    public void setBlackId(int blackId) {
        this.blackId = blackId;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
