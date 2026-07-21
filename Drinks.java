public class Drinks{
  
  public static String peopleWithAgeDrink(int age){
    if(age < 14){
      return "drink toddy";
    }
    if(age < 18 && age >= 14){
      return "drink coke";
    }
    if(age < 21 && age >= 18){
      return "drink beer";
    }
    if(age >= 21){
      return "drink whisky";
    }
    return "-1";
  }
}
