public class Office {
  public static void main(String args[]){
    Runable ins=null;
    Class cls=null;
    try{
      cls=Class.forName(args[0]);
      ins=(Runable)cls.newInstance();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    ins.run();
    System.out.println(cls.getInterfaces()[0].getName());
  }
}