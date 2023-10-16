package chuong3.ss16_vong_lap_vo_han;

public class bai3 {
    public static void main(String[] args) {
        int i=1;
        int sum =0;
        while (true){
            sum+=i;
            if(sum>=500){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
