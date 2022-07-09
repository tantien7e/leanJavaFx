package hellofx;

import java.util.ArrayList;

public class Initializer {
    ArrayList<Museum> museumArr = new ArrayList<>();
    public Initializer(){
        Museum museum1 = new Museum("Ly_Thai_To", "This is the abstract", 2010);
        Museum museum2 = new Museum("Chuong_Trinh", "haha", 1908);
        museumArr.add(museum1);
        museumArr.add(museum2);
    }
}
