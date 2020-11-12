package com.umg.enjoyhelloworld;

import java.util.ArrayList;

public class Data {



    public static void setData()
    {
        easyModeData.clear();
        mediumModeData.clear();
        hardModeData.clear();

        setEasyModeData();
        setMediumModeData();
        setHardModeData();
    }

    //Easy mode
    public static ArrayList<Decision> easyModeData = new ArrayList<Decision>();

    private static void setEasyModeData()
    {
        String description;
        String option1;
        String option2;
        String option3;
        String result1;
        String result2;
        String result3;

        //Decision(String description, String option1, String option2, String option3, String result1, String result2, String result3)
        description="Natrafiliście na drzwi, które są zamknięte";
        option1="otwórz je";
        option2="wyważ je";
        option3="odejdź";
        result1="przeszliście do nowego pokoju";
        result2="przeszliście do nowego pokoju";
        result3="idziecie dalej";
        easyModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

        description="Podłoga zaczyna opadać";
        option1="złap się drzwi";
        option2="złap się lampy";
        option3="złap się parapetu";
        result1="podłoga wróciła";
        result2="podłoga wróciła";
        result3="podłoga wróciła";
        easyModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

        description="Wybucha pożar";
        option1="użyj gaśnicy";
        option2="użyj wody";
        option3="użyj koca gaśniczego";
        result1="pożar ugaszony";
        result2="pożar ugaszony";
        result3="pożar ugaszony";

        easyModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

    }


    //Medium mode
    public static ArrayList<Decision> mediumModeData = new ArrayList<Decision>();

    private static void setMediumModeData()
    {
        //Decision(String description, String option1, String option2, String option3, String result1, String result2, String result3)

        String description;
        String option1;
        String option2;
        String option3;
        String result1;
        String result2;
        String result3;

        //Decision(String description, String option1, String option2, String option3, String result1, String result2, String result3)
        description="Natrafiliście na drzwi, które są zamknięte";
        option1="otwórz je";
        option2="wyważ je";
        option3="odejdź";
        result1="przeszliście do nowego pokoju";
        result2="przeszliście do nowego pokoju";
        result3="za drzwiami był skarb";
        mediumModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

        description="Podłoga zaczyna opadać";
        option1="złap się drzwi";
        option2="złap się parapetu";
        option3="złap się lampy";
        result1="podłoga wróciła";
        result2="podłoga wróciła";
        result3="lampa odpadła";
        mediumModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

        description="Wybucha pożar";
        option1="użyj gaśnicy";
        option2="użyj wody";
        option3="użyj benzyny";
        result1="pożar ugaszony";
        result2="pożar ugaszony";
        result3="pożar nieugaszony";

        mediumModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

    }


    //Hard mode
    public static ArrayList<Decision> hardModeData = new ArrayList<Decision>();


    private static void setHardModeData()
    {
        //Decision(String description, String option1, String option2, String option3, String result1, String result2, String result3)

        String description;
        String option1;
        String option2;
        String option3;
        String result1;
        String result2;
        String result3;

        //Decision(String description, String option1, String option2, String option3, String result1, String result2, String result3)
        description="Natrafiliście na drzwi, które są zamknięte";
        option1="otwórz je";
        option2="wyważ je";
        option3="odejdź";
        result1="przeszliście do nowego pokoju";
        result2="zniszczyliście drogocenny obraz za drzwiami";
        result3="za drzwiami był skarb";
        hardModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

        description="Podłoga zaczyna opadać";
        option1="złap się parapetu";
        option2="złap się drzwi";
        option3="złap się lampy";
        result1="podłoga wróciła";
        result2="drzwi odpadły";
        result3="lampa odpadła";
        hardModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

        description="Wybucha pożar";
        option1="użyj gaśnicy";
        option2="użyj węgla";
        option3="użyj benzyny";
        result1="pożar ugaszony";
        result2="pożar nieugaszony";
        result3="pożar nieugaszony";

        hardModeData.add(new Decision(description, option1, option2, option3, result1,result2,result3 ));

    }






}
