package entities.concretes;

public class Application {
    private int applicationId;
    private Applicant applicant;
    private Credit credit;

    public Application() {
    }

    public Application(int applicationId, Applicant applicant, Credit credit) {
        this.applicationId = applicationId;
        this.applicant = applicant;
        this.credit = credit;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }
}
