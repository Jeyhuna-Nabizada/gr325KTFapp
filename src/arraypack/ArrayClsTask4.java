package arraypack;
public class ArrayClsTask4 {
    public static void main(String[] args){

            int[]ededler = new int[10];
            ededler[0]=5;
            ededler[1]=8;
            ededler[2]=19;
            ededler[3]=15;
            ededler[4]=19;
            ededler[5]=23;
            ededler[6]=27;
            ededler[7]=35;
            ededler[8]=45;
            ededler[9]=55;
            int max=ededler[9];

            for(int i = 0; i<= ededler.length-i;i++){
                if( ededler[i]>max) {
                    max =ededler[i];

                }


            }
            System.out.println(max);
        }
    }


