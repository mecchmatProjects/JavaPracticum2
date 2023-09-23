

class Task1_5{

    public static void main(String[] args){
          
          if(args.length<=0){
              System.out.println("No commandline arguments");
              return;
          }    
    
          double sum = 0;
          for(String a:args){
              double x = Double.parseDouble(a); //String.
              sum += x;
          }
          
          System.out.printf("Sum= %f\n", sum);
    }
    

}
