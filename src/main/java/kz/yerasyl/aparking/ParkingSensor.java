package kz.yerasyl.aparking;

import java.time.LocalDateTime;

public class ParkingSensor {
    private String sensorId;
    private boolean isOccupied;
    private LocalDateTime timestamp;
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public String getSensorId(){
        return sensorId;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    public boolean getIsOccupied(){
        return isOccupied;
    }

    public ParkingSensor(String sensorId, boolean isOccupied){
        this.sensorId = sensorId;
        this.isOccupied = isOccupied;
    }

    @Override
    public String toString() {
        return "Sensor id is "+sensorId;
    }
}
