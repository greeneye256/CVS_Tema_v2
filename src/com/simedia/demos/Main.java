package com.simedia.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static String cvs = "1,Ana,V,1994,ana@mail.com,Java";
    public static String contract = "Id,Nume,Initiala Tatalui,Anul Nasterii,Email,Limbaj Programare";



    public static void main(String[] args) {
	    printValueOfIndex(2);
	    printValueOfParameter("Anul Nasterii");
    }

    public static List<String> makeListFromCvs(String cvs) {

        List<String> listFromCvs = new ArrayList<String>(Arrays.asList(cvs.split(",")));
        return listFromCvs;

    }

    public static void printValueOfIndex(int index){
        List<String> arrayOfParameters = makeListFromCvs(cvs);
        List<String> arrayFromContract = makeListFromCvs(contract);

        System.out.println(arrayFromContract.get(index+1) + " = " + arrayOfParameters.get(index+1));

    }
    public static void printValueOfParameter (String parameter){
        List<String> arrayOfParameters = makeListFromCvs(cvs);
        List<String> arrayFromContract = makeListFromCvs(contract);

        for (int i = 0; i < arrayFromContract.size(); i++) {
            if (arrayFromContract.get(i).equals(parameter)){
                System.out.println(arrayOfParameters.get(i));
                break;
            }
        }
    }

}
