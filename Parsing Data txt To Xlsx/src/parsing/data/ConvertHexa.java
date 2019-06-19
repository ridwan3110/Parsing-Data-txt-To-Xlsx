/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsing.data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kiwong
 */
public class ConvertHexa {
    public static void main(String[] args) {
       /*String a ="004e20";
       int b = Integer.parseInt(a, 16);*/
       
        SimpleDateFormat dateAsText = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String a = dateAsText.format(new Date(744783365 * 100L));
        System.out.println(a);
       
       
    }
}
