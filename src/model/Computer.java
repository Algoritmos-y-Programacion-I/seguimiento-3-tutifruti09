package model;

import java.util.ArrayList;
import java.time.LocalDate;

public class Computer {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los
     * requerimientos.
     */
    ArrayList<Incident> incidents;
    private String serialNumber;
    private boolean nextWindow;
    public Computer(String serialNumber, boolean nextWindow) { 
        this.serialNumber = serialNumber;
        this.nextWindow = nextWindow;
        incidents = new ArrayList<Incident>();


    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public boolean NextWindow() {
        return nextWindow;
    }
    public ArrayList<Incident> getIncidents() {
        return incidents;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setNextWindow(boolean nextWindow) {
        this.nextWindow = nextWindow;
    }
    public void setIncidents(ArrayList<Incident> incidents) {
        this.incidents = incidents;
    }

    /**
     * Agregar un neuvo inicidente al computador
     * @param dateReport fecha del reporte 
     * @param description descripcion del incidente
     */

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria.
     */
    public void addIncident(LocalDate dateReport, String description) {
        Incident newIncident = new Incident(dateReport, description);
        incidents.add(newIncident);

    }

}
