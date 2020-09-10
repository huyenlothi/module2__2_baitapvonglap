public class hienthisntnhohon100 {
    public static void main(String[] args) {
        String text = "";
        for (int i=2; i<100; i++) {
            int j=2;
            boolean check = true;
            while (j< Math.sqrt(i)){
                if( i%j==0){
                    check = false;
                    break;
                }
                j++;
            }
            if(check) {
                text += (i + ",");
            }
        }
        System.out.println("cac so nguyen to nho hon 100 la: " + text);
    }
}
