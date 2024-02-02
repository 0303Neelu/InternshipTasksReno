class Telephone{
  public void ring(){
    System.out.println("Ringing...");
  }
  public void lift(){
    System.out.println("Lifting...");
  }
  public void disconnect(){
    System.out.println("Disconnecting...");
  }
}

class SmartTelephone extends Telephone{
  public void videoCall(){
    System.out.println("Video calling...");
  }
  public void musicCall(){
    System.out.println("Music calling...");
  }
  public void gpsCall(){
    System.out.println("GPS calling...");
  }
}

class Polymorph2{
  public static void main(String[] args){
    Telephone t1=new SmartTelephone();
    t1.ring();
    t1.lift();
    t1.disconnect();
    //t1.videoCall();
    //t1.musicCall();
    //t1.gpsCall();
    //we can't use the above three methods because they are not in Telephone class
      }
}