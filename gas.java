public class gas {
    public static void main(String[] args) {
        int gas = 10;
        int distance = 100;
        int mpg = 20;
        for(int i=0;i<gas;i++){
            if(distance/mpg <= i){
                System.out.println("You can make it");
                break;
            }
            else{
                System.out.println("You can't make it");
                break;
            }
        }
    }
}
