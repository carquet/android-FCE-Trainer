package com.example.android.fcetrainer;

public class Paper {
    //state
    private String nCategory;
    private String nPart; //example part 1
    private String nPartName; //example: Speaking
    private String nTaskType;
    private String nFocus; // example: the ain focus is on vocabulary
    private String nFormat; //example a modified cloze test containing eight gaps
    private String nTips;
    private String nMarkingStyle;
    private String nTiming;

    //constructor
    public Paper(String category, String part, String partName, String tasktype, String focus, String format, String tips, String markingStyle, String timing){
        nCategory = category;
        nPart = part;
        nPartName = partName;
        nTaskType = tasktype;
        nFocus = focus;
        nFormat = format;
        nTips = tips;
        nMarkingStyle = markingStyle;
        nTiming = timing;
    }

    //getter
    public String getnCategory(){
        return nCategory;
    }

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

    public String getnTiming() {
        return nTiming;
    }
}
