import food.Fruit;
import static java.lang.System.out;
class Apple extends Fruit{

    @Override
    public void healty() {
     out.println("this is healty fruits") ; 

    }
    
}
class Ultra{
  public static void main(String []args){
      Apple a=new Apple();
      a.healty();
  }

}
