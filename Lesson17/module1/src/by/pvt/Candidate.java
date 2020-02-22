package by.pvt;

public class Candidate {
    private String name;
    private String skill;
    private boolean isPassedExam;

    public Candidate() {
    }

    public Candidate(String name, String skill, Boolean isPassedExam) {
        this.name = name;
        this.skill = skill;
        this.isPassedExam = isPassedExam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


    public Boolean isPassedExam() {
        return isPassedExam;
    }
    public void setPassedExam(boolean passedExam) {
        isPassedExam = passedExam;
    }
}