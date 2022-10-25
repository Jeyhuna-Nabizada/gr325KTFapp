package loopspack;

public class LoopsCls3 {
    public static void main(String[] args) {
        //break,return,continue
        String netice="";
        for (int i=0;i<=10;i++){

            if(i==5){
               // continue;
               // break;
                return;
            }
            netice+=i;
        }
        System.out.println(netice);
    }

}
