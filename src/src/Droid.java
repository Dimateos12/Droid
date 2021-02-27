public class Droid {
    String name;
    int batteryLevel;

    public Droid(String nameDrone ){
        name = nameDrone;
        batteryLevel = 100;
    }

    public int batteryLevel(){
        return batteryLevel;
    }
    public String toString(){
        return "Hello, my name is " +name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task:"+task);
        batteryLevel -=10;
    }

    public void displayBatteryLevel(){

    }

    public void energyReport(){
        System.out.println("Battery level is " + batteryLevel);
    }
    public static void energyTransfer(Droid a, Droid b ){
    int tempA = a.batteryLevel;
    int tempB = b.batteryLevel;
    a.batteryLevel = tempB;
    b.batteryLevel =tempA;
    }


    public static void main(String[] args){

        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid.batteryLevel);
        myDroid.performTask("dancing");
        System.out.println(myDroid.batteryLevel);
        myDroid.performTask("cooking");
        myDroid.performTask("eating");
        System.out.println(myDroid.batteryLevel);

        Droid d1 = new Droid("Second Droid");
        d1.energyReport();
        d1.performTask("dancing");
        d1.performTask("Drinking");
        d1.energyReport();
        energyTransfer(myDroid,d1);


    }   
}
