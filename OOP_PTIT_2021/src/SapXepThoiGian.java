import java.util.*;

public class SapXepThoiGian {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<ThoiGian> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            int[] a = new int[3];
            for(int x=0;x<3;x++){
                a[x] = sc.nextInt();
            }
            li.add(new ThoiGian(a[0],a[1],a[2]));
        }
        li.sort(Collections.reverseOrder());
        for(ThoiGian x: li){
            System.out.println(x);
        }
    }
}

class ThoiGian  implements Comparable<ThoiGian> {
    private int hour;
    private int minute;
    private int second;
    
    public ThoiGian(){
        
    }
    public ThoiGian(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", hour, minute, second);
    }

    @Override
    public int compareTo(ThoiGian tg) {
        if(this.hour > tg.hour){
            return -1;
        }else if(this.hour<tg.hour){
            return 1;
        }else{
            if(this.minute > tg.minute){
                return -1;
            }else if(this.minute < tg.minute){
                return 1;
            }else{
                if(this.second > tg.second){
                    return -1;
                }else if(this.second < tg.second){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
    
}
