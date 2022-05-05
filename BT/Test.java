import java.util.*;

public class Test {
    String s = "Dang The Long B19DCAT113";
    String[] tmp = s.split("\\s+");
    String res="";for(
    int i = 0;i<tmp.length;i++)
    {
        if (tmp[i].length() > 0) {
            res += tmp[i] + "\n";
        }
    }System.out.println(res);
}
