import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ClassUtil{
  public void printClassMessage(Object obj){
    Class cls=null;
    cls=obj.getClass();
    System.out.println("fields~~~~");
    for (Field field :cls.getFields()){
      System.out.println(field. getName());
    }
    System.out.println("methodsd~~~~");
    for (Method method :cls.getMethods()){
      System.out.println(method. getName());
    }
  }
}