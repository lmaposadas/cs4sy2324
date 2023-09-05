package cs4q1_09.pkg05.pkg23;

/**
 *
 * @author TRUTH
 */
public class Cs4q1_090523 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NormalPerson mark = new NormalPerson("Mark");
        NormalPerson nathan = new NormalPerson("Nathan, 28");
        mark.setFriend(nathan);
        System.out.println(NormalPerson.getRecentWorker().getName());
        nathan.earnMoney(100);
        System.out.println(NormalPerson.getRecentWorker().getName());
    }
    
}
