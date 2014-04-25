class MountainBike extends Bicycle {
    public int seatHeight;


    //the MountainBike subclass has one constructor
    public MountainBike(int startHeight,int satrtCadence, int startSpeed , int startGear){
        super(satrtCadence,startSpeed,startGear);
        seatHeight = startHeight;
    }

    //this has one method
    public void setHight(int newValue){
        seatHeight = newValue;
    }
     
    public static void main(String[] args){
        MountainBike bike3 = new MountainBike(4,1,2,3);
        System.out.println("cadence:"+bike3.cadence+" speed:"+bike3.speed+" gear:"+bike3.gear+" seatheight:"+bike3.seatHeight+"\n");


    }


}
