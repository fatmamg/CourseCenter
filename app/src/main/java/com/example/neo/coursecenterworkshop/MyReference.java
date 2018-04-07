package com.example.neo.coursecenterworkshop;

/**
 * Created by NEO on 4/6/2018.
 */

public class MyReference {
    String roomName;
    String lectureName ;
    String subjectName ;
    int dayDate ;
    double dayHour ;
    double timeFrom ;
    double timeTo ;

    public MyReference(String roomName, String lectureName, String subjectName, int dayDate, double dayHour, double timeFrom, double timeTo) {
        this.roomName = roomName;
        this.lectureName = lectureName;
        this.subjectName = subjectName;
        this.dayDate = dayDate;
        this.dayHour = dayHour;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public MyReference() {
    }

    public String getRoomName() {
        return roomName;
    }

    public String getLectureName() {
        return lectureName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getDayDate() {
        return dayDate;
    }

    public double getDayHour() {
        return dayHour;
    }

    public double getTimeFrom() {
        return timeFrom;
    }

    public double getTimeTo() {
        return timeTo;
    }
}
