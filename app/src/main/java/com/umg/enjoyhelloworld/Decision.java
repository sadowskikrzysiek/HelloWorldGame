package com.umg.enjoyhelloworld;

public class Decision {

    private String description;
    private String option1;
    private String option2;
    private String option3;
    private String result1;
    private String result2;
    private String result3;

    public Decision(String description, String option1, String option2, String option3, String result1, String result2, String result3) {
        this.description = description;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.result1 = result1;
        this.result2 = result2;
        this.result3 = result3;
    }


    public String getDescription() {
        return description;
    }



    public String getOption1() {
        return option1;
    }



    public String getOption2() {
        return option2;
    }



    public String getOption3() {
        return option3;
    }



    public String getResult1() {
        return result1;
    }



    public String getResult2() {
        return result2;
    }



    public String getResult3() {
        return result3;
    }





}
