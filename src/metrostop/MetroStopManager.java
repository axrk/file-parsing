package metrostop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MetroStopManager {
    public static List<MetroStop> listMetro;

    // Constructeur
    public MetroStopManager() {
        listMetro = new ArrayList<>();
    }

    // Méthodes
    public static void printMetroStopList(List<MetroStop> list){
        for (MetroStop metro : list){
            System.out.println(metro);
        }
    }

    // Tris
    public static void sortById(List<MetroStop> list){
        Collections.sort(list, new MetroStop.CompareId());
    }

    public static void sortByDistrict(List<MetroStop> list){
        Collections.sort(list, new MetroStop.CompareDistrict());
    }
}
