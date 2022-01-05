class Father
  {
    Father()
     {
       System.out.println("Father");
     }
      Father(String n)
       { 
         System.out.println("Iam  "+n);
       }
    void display()
     {
      System.out.println("Iam display");
       
     }
    void display(String r)
     {
      System.out.println("Iam  "+r);
     }
     static void test()
     {
      System.out.println("Iam static");
     }
}
class Constructer1
  {
    public static void main(String args[]) 
     {
      //Father f = new Father();
      Father x = new Father("Chandrasekar N");
      x.display();
      x.display("Preetham C");
      x.test();
      Father.test();
      
     }
  }        
      