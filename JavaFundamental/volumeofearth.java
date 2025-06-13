

class main{
   public static void main(String[] args){
 
    int r=6378;
   
    int volume=(4/3)*(22/7)*(r*r*r);
    double volumemile=volume * 0.621371;
    
      System.out.print(" volume of Earth in km "+volume +"and cubic miles is "+volumemile);
     
  
 }
}