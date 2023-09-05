package cs4q1_09.pkg05.pkg23;

/**
 *
 * @author TRUTH
 */
public class NormalPerson {
    private String name;
    private int age;
    private double money;
    private NormalPerson friend;
    private static NormalPerson recentWorker;
    public NormalPerson(String name){
        this.name = name;
        this.age = 0;
        this.money = 0;
    }
    public NormalPerson(String name, int age) {
        this.name = name;
        this.age = age;
        this.money = 0;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void birthday() {
        this.age++;
    }
    public void setFriend(NormalPerson newFriend){
        this.friend = newFriend;
    }
    public void earnMoney(double increase) {
        this.setMoney(this.getMoney() + increase);
        recentWorker = increase;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public NormalPerson getFriend() {
        return friend;
    }
    public static NormalPerson getRecentWorker() {
        return recentWorker;
    }
}
