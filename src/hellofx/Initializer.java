package hellofx;

import java.util.ArrayList;

public class Initializer {
    ArrayList<Museum> museumArr = new ArrayList<>();
    ArrayList<Parks> parkArr = new ArrayList<>();
    ArrayList<Lakes> lakeArr = new ArrayList<>();
    public Initializer(){
        //Initialize some Museums
        Museum museum1 = new Museum("Ly_Thai_To", "This is the abstract", 2010);
        Museum museum2 = new Museum("Chuong_Trinh", "haha", 1908);
        Museum museum3 = new Museum("Nhi_Ngố", "nymoi", 2022);
        museumArr.add(museum1);
        museumArr.add(museum2);
        museumArr.add(museum3);

        //Initialize some Parks
        Parks park1 = new Parks("Sun_World", "This is Sun_World", 1998);
        Parks park2 = new Parks("Cuc_Phuong_National_Park", "This is Cuc Phuong", 1994);
        Parks park3 = new Parks("Thien_Duong_Bao_Son", "This is Thien Duong Bao Son", 2000);
        parkArr.add(park1);
        parkArr.add(park2);
        parkArr.add(park3);

        //Initialize some Lakes
        Lakes lake1 = new Lakes("Hoan_Kiem", "This is ho Hoan Kiem", 1000);
        Lakes lake2 = new Lakes("Ba_Be", "This is Ba Be Lake", 1800);
        Lakes lake3 = new Lakes("Ho_Tey", "This is ho Tey", 1876);
        lakeArr.add(lake1);
        lakeArr.add(lake2);
        lakeArr.add(lake3);

    }
}
