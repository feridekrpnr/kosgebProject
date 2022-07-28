package entities.concretes;

import java.time.LocalDate;

public class Credit {
    private int creditId;
    private String creditName;
    private LocalDate startedDate;
    private LocalDate dueDate;

    public Credit() {
    }

    public Credit(int creditId, String creditName, LocalDate startedDate, LocalDate dueDate) {
        this.creditId = creditId;
        this.creditName = creditName;
        this.startedDate = startedDate;
        this.dueDate = dueDate;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public LocalDate getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
