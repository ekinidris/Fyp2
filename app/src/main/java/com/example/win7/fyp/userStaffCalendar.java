package com.example.win7.fyp;

/**
 * Created by Win7 on 10/2/2015.
 */
public class userStaffCalendar {

    String calSession,kuliahStart,kuliahEnd,entranceStart,entranceEnd,cutiPertStart,cutiPertEnd, kuliah2Start,kuliah2End,sufoStart,sufoEnd,exitStart,exitEnd,studyweekStart,studyweekEnd,examStart,examEnd,resultDate,examKhasStart, examKhasEnd,cutisemStart,cutisemEnd;


    public userStaffCalendar(String calSession,String kuliahStart,String kuliahEnd,String entranceStart,String entranceEnd,String cutiPertStart,String cutiPertEnd, String kuliah2Start,String kuliah2End,String sufoStart,String sufoEnd,String exitStart,String exitEnd,String studyweekStart,String studyweekEnd,String examStart,String examEnd,String resultDate,String examKhasStart, String examKhasEnd,String cutisemStart,String cutisemEnd
    ){

        this.calSession = calSession;
        this.kuliahStart = kuliahStart;
        this.kuliahEnd =kuliahEnd;
        this.entranceStart = entranceStart;
        this.entranceEnd=entranceEnd;
        this.cutiPertStart = cutiPertStart;
        this.cutiPertEnd =cutiPertEnd;
        this.kuliah2Start =kuliah2Start;
        this. kuliah2End = kuliah2End;
        this.sufoStart = sufoStart;
        this.sufoEnd =sufoEnd;
        this.exitStart = exitStart;
        this.exitEnd =  exitEnd;
        this.studyweekStart = studyweekStart;
        this.studyweekEnd = studyweekEnd;
        this.examStart = examStart;
        this.examEnd =examEnd;
        this. resultDate = resultDate;
        this.examKhasStart =  examKhasStart;
        this.examKhasEnd =examKhasEnd;
        this.cutisemStart =  cutisemStart;
        this.cutisemEnd  = cutisemEnd;
    }

    public userStaffCalendar(String calSession){

        this.calSession = calSession;
        this.kuliahStart = "";
        this.kuliahEnd ="";
        this.entranceStart = "";
        this.entranceEnd="";
        this.cutiPertStart = "";
        this.cutiPertEnd ="";
        this.kuliah2Start ="";
        this. kuliah2End = "";
        this.sufoStart = "";
        this.sufoEnd ="";
        this.exitStart = "";
        this.exitEnd =  "";
        this.studyweekStart = "";
        this.studyweekEnd = "";
        this.examStart = "";
        this.examEnd ="";
        this. resultDate = "";
        this.examKhasStart = "";
        this.examKhasEnd ="";
        this.cutisemStart =  "";
        this.cutisemEnd  = "";

    }

}
