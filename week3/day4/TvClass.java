interface TvRemote{
   void turnOn();
   void turnOff();
   void changeChannel();
}

interface SmartTvRemote extends TvRemote{
  public void voiceNote();
}

class Tv implements SmartTvRemote{
  public void turnOn(){
    System.out.println("Turning on TV...");
  }
  public void turnOff(){
    System.out.println("Turning off TV...");
  }
  public void changeChannel(){
    System.out.println("Changing channel...");
  }
  public void voiceNote(){
    System.out.println("Playing voice note...");
  }
  public void watch(){
    System.out.println("Watching TV...");
  }
}

class TvClass{
  public static void main(String[] args){
    Tv s=new Tv();
    s.turnOn();
    s.changeChannel();
    s.voiceNote();
    s.turnOff();
    s.watch();
  }
}