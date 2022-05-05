
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LONGDT
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        String s1 = "24/11/2021";
        String s2 = "24/11/2021";
        Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);
        Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse(s2);
        
        int ngay = (int)((d2.getTime() - d1.getTime())/(1000*60*60*24));
        System.out.println(ngay);
    }
}
