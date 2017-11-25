package com.metarnet.driver.bean;

/**
 * Created by Administrator on 2017/7/20/0020.
 */
public class Participant {

    private String ParticipantType;
    private String ParticipantID;
    private String ParticipantName;
    private String ParticipantStatus;

    public Participant() {
    }

    public String getParticipantType() {
        return this.ParticipantType;
    }

    public void setParticipantType(String participantType) {
        this.ParticipantType = participantType;
    }

    public String getParticipantID() {
        return this.ParticipantID;
    }

    public void setParticipantID(String participantID) {
        this.ParticipantID = participantID;
    }

    public String getParticipantName() {
        return this.ParticipantName;
    }

    public void setParticipantName(String participantName) {
        this.ParticipantName = participantName;
    }

    public String getParticipantStatus() {
        return this.ParticipantStatus;
    }

    public void setParticipantStatus(String participantStatus) {
        this.ParticipantStatus = participantStatus;
    }
}
