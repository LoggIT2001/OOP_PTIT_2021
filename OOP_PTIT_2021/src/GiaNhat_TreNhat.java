import java.util.*;

public class GiaNhat_TreNhat {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<GNTN> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s = sc.nextLine();
            li.add(new GNTN(s));
        }
        li.sort(Collections.reverseOrder());
        int x = li.size()-1;
        System.out.println(li.get(0));
        System.out.println(li.get(x));
    }
}

class GNTN implements Comparable<GNTN> {
    private String input;
    
    public GNTN(){
        
    }
    public GNTN(String input){
        this.input = input;
    }
    public String name(){
        String[] s = this.input.split("\\s+");
        String res="";
        res=s[0];
        return res;
    }
    public String NS(){
        String[] s = this.input.split("\\s+");
        String res="";
        res=s[1];
        return res;
    }
    @Override
    public String toString(){
        return String.format("%s", name());
    }

    @Override
    public int compareTo(GNTN x) {
        String[] s1 = this.NS().split("/");
        String[] s2 = x.NS().split("/");
        if(s1[2].compareTo(s2[2])>0){
            return 1;
        }else if(s1[2].compareTo(s2[2])<0){
            return -1;
        }else{
            if(s1[1].compareTo(s2[1])>0){
                return 1;
            }else if(s1[1].compareTo(s2[1])<0){
                return -1;
            }else{
                if(s1[0].compareTo(s2[0])>0){
                    return 1;
                }else if(s1[0].compareTo(s2[0])<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
    
}