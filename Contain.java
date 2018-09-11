import java.util.*;

public class Contain {
   public static void main(String[] args) {
String[] s = {"common1","common2"};
String[] S = {"common1","common2","notcommon3"};
List<String> objArray = Arrays.asList(s);
   //   ArrayList objArray = new ArrayList();
      List<String> objArray2 = Arrays.asList(S);
     // objArray2.add(0,"common1");
      //objArray2.add(1,"common2");
      //objArray2.add(2,"notcommon");
      //objArray2.add(3,"notcommon1");
     // objArray.add(0,"common1");
      //objArray.add(1,"common2");
System.out.println("Nikhil");
      System.out.println("Array elements of array1"+objArray);
      System.out.println("Array elements of array2"+objArray2);
      System.out.println("Array 1 contains String common2?? "
      +objArray2.contains("notcommon3"));
      System.out.println("Array 2 contains Array1?? "
      +objArray.containsAll(objArray2) );
   }
}