package com.example.android.fcetrainer;

public class Paper {
    //state
    private String nPart; //example part 1
    private String nPartName; //example: Speaking
    private String nTaskType;
    private String nFocus; // example: the ain focus is on vocabulary
    private String nFormat; //example a modified cloze test containing eight gaps
    private String nTips;
    private String nMarkingStyle;

    //constructor
    public Paper(String part, String partName, String tasktype, String focus, String format, String tips, String markingStyle){
        nPart = part;
        nPartName = partName;
        nTaskType = tasktype;
        nFocus = focus;
        nFormat = format;
        nTips = tips;
        nMarkingStyle = markingStyle;
    }

    //getter

    public String getnPart() {
        return nPart;
    }

    public String getnPartName() {
        return nPartName;
    }

    public String getnTaskType() {
        return nTaskType;
    }

    public String getnFocus() {
        return nFocus;
    }

    public String getnFormat() {
        return nFormat;
    }

    public String getnTips() {
        return nTips;
    }

    public String getnMarkingStyle() {
        return nMarkingStyle;
    }

}
