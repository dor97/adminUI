package App;

import DTO.approvementStatus;

public class requestTable {
    private Integer requestId;
    private String simulationName;
    private Integer amountToRun;
    private approvementStatus requestStatus;
    private String userName;
    private String userTerminateOnly;
    private String tick;
    private String sec;

    private Integer currentlyRunningSimulation;
    private Integer doneRunning;

    public requestTable(Integer requestId, String simulationName, Integer amountToRun, approvementStatus requestStatus, String userName, String userTerminateOnly, String tick, String sec, Integer currentlyRunningSimulation, Integer doneRunning) {
        this.requestId = requestId;
        this.simulationName = simulationName;
        this.amountToRun = amountToRun;
        this.requestStatus = requestStatus;
        this.userName = userName;
        this.userTerminateOnly = userTerminateOnly;
        this.tick = tick;
        this.sec = sec;
        this.currentlyRunningSimulation = currentlyRunningSimulation;
        this.doneRunning = doneRunning;
    }

//    public requestTable(Integer requestId, String simulationName, Integer amountToRun, approvementStatus requestStatus, Integer currentlyRunningSimulation, Integer doneRunning) {
//        this.requestId = requestId;
//        this.simulationName = simulationName;
//        this.amountToRun = amountToRun;
//        this.requestStatus = requestStatus;
//        this.currentlyRunningSimulation = currentlyRunningSimulation;
//        this.doneRunning = doneRunning;
//    }

    public String getUserTerminateOnly(){
        return userTerminateOnly;
    }

    public void setUserTerminateOnly(String userTerminateOnly){
        this.userTerminateOnly = userTerminateOnly;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getSimulationName() {
        return simulationName;
    }

    public void setSimulationName(String simulationName) {
        this.simulationName = simulationName;
    }

    public Integer getAmountToRun() {
        return amountToRun;
    }

    public void setAmountToRun(Integer amountToRun) {
        this.amountToRun = amountToRun;
    }

    public approvementStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(approvementStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Integer getCurrentlyRunningSimulation() {
        return currentlyRunningSimulation;
    }

    public void setCurrentlyRunningSimulation(Integer currentlyRunningSimulation) {
        this.currentlyRunningSimulation = currentlyRunningSimulation;
    }

    public Integer getDoneRunning() {
        return doneRunning;
    }

    public void setDoneRunning(Integer doneRunning) {
        this.doneRunning = doneRunning;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTick() {
        return tick;
    }

    public void setTick(String tick) {
        this.tick = tick;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }
}
