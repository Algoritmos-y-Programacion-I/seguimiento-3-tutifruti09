package model;
import java.time.LocalDate;

import model.Computer;


public class SchoolController {

    private String name;
    private int hourSpentSupport;
    private final int FLOORS = 10;
    private final int COL = 10;
    private final int HOURMAXSUPPORT = 100;
    private Computer [][]computerMatrix;


    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los
     * requerimientos.
     */  

    public SchoolController(String name) {
        this.name = name;
        this.hourSpentSupport = 0;
        computerMatrix = new Computer[FLOORS][COL];

    }

    public String getName(){
        return name;
    }

    public int getHoursSpentSupport(){
        return hourSpentSupport;
    }

    public final int getFLOORS(){
        return FLOORS;
    }

    public final int getCOL(){
        return COL;
    }

    public final int getHOURMAXSUPPORT(){
        return HOURMAXSUPPORT;
    }

    public Computer[][] getComputerMatrix(){
        return computerMatrix;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHoursSpentSupport(int hourSpentSupport){
        this.hourSpentSupport = hourSpentSupport;
    }

    public void setComputerMatrix(Computer[][] computerMatrix){
        this.computerMatrix = computerMatrix;
    }


    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Añada los metodos que considere hagan falta para satisfacer los
     * requerimientos.
     * Para cada metodo:
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria (instrucciones) para satisfacer los
     * requerimientos.
     */
    public String agregarComputador(String serialNumber, int floor) {
        if (floor < 0 || floor >= FLOORS){
            return "Piso Invalido";

        } 
        for (int i =0; i < FLOORS; i++){
            for (int j=0; j < COL; j++){
                if (computerMatrix[i][j] != null && computerMatrix[i][j].getSerialNumber().equals(serialNumber)){
                    return "El computador ya existe";

                }

                }


            }

            for (int j = 0; j<COL; j++){
                if (computerMatrix[floor][j] ==null){
                    computerMatrix[floor][j] = new Computer (serialNumber,true);
                    return "Computador agregado exitosamente";

                }
            }
            return "No hay espacio en el piso para agregar el computador";

        }


    

    public void agregarIncidenteEnComputador(String serialNumber, int floor, int col, String description, LocalDate dateReport) {
        for (int i=0; i< FLOORS; i++){

        }

    }

    public void getComputerList() {

    }

}

