package hellofx;

import java.util.ArrayList;
import java.io.File;
import vntourism.Lakes;
import vntourism.Museum;
import vntourism.NationalParks;


public class Initializer {
    public ArrayList<Lakes> lakeArr = new ArrayList<>();
    public ArrayList<NationalParks> nationalParkArr = new ArrayList<>();
    public Initializer(){
        File dir1 = new File("F:/OOP/JavaFx/leanJavaFx/src/QueriedFiles/lakes");
        File[] directoryListing1 = dir1.listFiles();
        if (directoryListing1 != null) {
        for (File child : directoryListing1) {
            Lakes lake = new Lakes(child.getAbsolutePath());
            lakeArr.add(lake);
            }   
        }

        File dir2 = new File("F:/OOP/JavaFx/leanJavaFx/src/QueriedFiles/nationalParks");
        File[] directoryListing2 = dir2.listFiles();
        if (directoryListing2 != null) {
        for (File child : directoryListing2) {
            NationalParks nationalPark = new NationalParks(child.getAbsolutePath());
            nationalParkArr.add(nationalPark);
            }
        }
       
        // //Initialize some Museums
        // Museum museum1 = new Museum("Ly_Thai_To", "This is the abstract", 2010);
        // Museum museum2 = new Museum("Chuong_Trinh", "haha", 1908);
        // Museum museum3 = new Museum("Nhi_Ngố", "nymoi", 2022);
        // museumArr.add(museum1);
        // museumArr.add(museum2);
        // museumArr.add(museum3);

        // //Initialize some Parks
        // Parks park1 = new Parks("Sun_World", "This is Sun_World", 1998);
        // Parks park2 = new Parks("Cuc_Phuong_National_Park", "This is Cuc Phuong", 1994);
        // Parks park3 = new Parks("Thien_Duong_Bao_Son", "This is Thien Duong Bao Son", 2000);
        // parkArr.add(park1);
        // parkArr.add(park2);
        // parkArr.add(park3);

        // //Initialize some Lakes
        // Lakes lake1 = new Lakes("Hoan_Kiem", "This is ho Hoan Kiem", 1000);
        // Lakes lake2 = new Lakes("Ba_Be", "This is Ba Be Lake", 1800);
        // Lakes lake3 = new Lakes("Ho_Tey", "This is ho Tey", 1876);
        // lakeArr.add(lake1);
        // lakeArr.add(lake2);
        // lakeArr.add(lake3);

    }
}
