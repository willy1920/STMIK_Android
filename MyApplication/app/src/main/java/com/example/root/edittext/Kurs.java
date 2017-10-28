package com.example.root.edittext;

/**
 * Created by root on 20/09/17.
 */

public class Kurs {

    public String Rupiah(Integer a){
        String uang = a.toString();
        String[] data = uang.split("");

        uang = "";
        int k = 0;
        for (int i = data.length - 1; i >= 0; i--){
            if (k%3 == 0 && k != 0 && k != data.length -1){
                uang = data[i] + "." + uang;
            }
            else{
                uang = data[i] + uang;
            }
            k++;
        }
        uang = "Rp. " + uang + ",00";
        return uang;
    }
}
