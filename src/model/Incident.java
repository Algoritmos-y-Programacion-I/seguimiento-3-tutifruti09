package model;

import java.time.LocalDate;

public class Incident {

    private LocalDate dateReport;
    private String descrpition;
    private boolean solution;
    private int solutionHours;

    public Incident (LocalDate dateReport, String description) {
        this.dateReport = dateReport;
        this.descrpition = description;
       
    }

    public LocalDate getDateReport(){
        return dateReport;
    }

    public String getDescription(){
        return descrpition;
    }

    public boolean getSolution(){
        return solution;
    }

    public int getSolutionHours(){
        return solutionHours;
    }

    public void setDateReport(LocalDate dateReport){
        this.dateReport = dateReport;
    }

    public void setDescription(String description){
        this.descrpition = description;
    }

    public void setSolution(boolean solution){
        this.solution = solution;
    }

    public void getSolutionHours(int solutionHours){
        this.solutionHours = solutionHours;
    }







    
}
