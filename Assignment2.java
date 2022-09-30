
public class Assignment2 {

  public static void main(String[] args) {

    //#1 
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93,};
    System.out.println(ages[ages.length -1] - ages[0]);
   
    ages[ages.length -1 ] = 100;
    
    System.out.println(ages[ages.length -1] - ages[0]);
    double avg = 0;
    for (int x : ages) {
      avg += x;   
    }
    System.out.println(avg/ages.length);
    
    //#2
    String[] names = {"Sam", "Bob", "Tommy", "Tim", "Sally", "Buck"}; 
     double average = 0;
     for(int counter = 0; counter < names.length; counter++){
    average += names[counter].length();  }
    System.out.println(average / names.length);
    
    String sumOfNames = "";
    for(String str:names) {
    sumOfNames += str + " ";
    }
    System.out.println(sumOfNames);
    
    //#3
    System.out.println(names[0]);
    //#4
    System.out.println(names[6-1]);
    //#5 
    int[] nameLengths = new int[names.length];
    for(int i = 0; i <names.length; i++){
        nameLengths[i] = names[i].length();
      }
      for (int i : nameLengths) {
       System.out.println(i);
      }
      
    //#6
      int sumOfElements = 0;
      for (int i = 0; i < nameLengths.length; i++) {
        sumOfElements += nameLengths[i];
      }
      System.out.println(sumOfElements);
      
     //#7
      System.out.println(wordRepeat("Hello", 3));
     
     //#8
      String firstName = "Kenneth";
      String lastName = "Bernstein";
      String fullName = createFullName(firstName,lastName);
        System.out.println(fullName);
        
      //#9  
        System.out.println(sumOfAgesGreaterThan100(ages));
        
      //#10
        double[] temp = {95.5, 99.9, 79.9, 101.5};
        System.out.println(averageArray(temp));
       
      //#11  
        double[] firstArray = {20, 30, 40, 50};
        double[] secondArray = {5, 10, 15, 20};
        System.out.println(isFirstArrayGreater(firstArray, secondArray));
        
      //#12
        boolean isHotOutside = true;
        double moneyInPocket = 9;
        System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
        
       //#13
        boolean doesSmell = true;
        boolean isCrying = true;
        System.out.println(changeDiaper(doesSmell, isCrying)+ "; " + "Change Diaper!!" );
        // if the baby smells funky and is crying then the diaper should be changed.
        
  } // main
  
  
  //methods for questions #7 - #13  
    //#7
    public static String wordRepeat(String word, int x ) {
        String str = "";
        for(int i=0; i < x; i++) {
        str += word;
      }
        return str; 
      }
    //#8
    public static String createFullName(String f, String l) {
      return f + " " + l;
      }
    //#9
      public static boolean sumOfAgesGreaterThan100(int[]arr ) {
        int sum =0;
        for(int number : arr){
          sum += number; 
        }
        return sum > 100;
      }
    //#10
        public static double averageArray(double[]arr){
          double sum = 0;
          for (double number :arr) {
            sum += number;
          }
          return sum / arr.length;           
      }
    //#11    
      public static boolean isFirstArrayGreater(double[]firstArray, double[] secondArray) {
        double sumFirst = 0;
        double sumSecond = 0;
        for (double number : firstArray) {
          sumFirst += number;          
        }
        for (double number : secondArray) {
          sumSecond += number;
        }
        return sumFirst / firstArray.length > sumSecond / secondArray.length;       
      }
    //#12
      public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      if (isHotOutside == true && moneyInPocket >= 10.50) { 
         return true;
       }
      return false;
      }
    // #13  
    public static boolean changeDiaper(boolean doesSmell, boolean isCrying) {
      if (doesSmell == true && isCrying == true) {
        return true; 
      }
      return false;
    }
    

    
  } // class









  




//  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//if (isHotOutside == true && moneyInPocket >= 10.50) { 
//    return true;
 // }
//  return false;

//  }
 // } // End of class 




















