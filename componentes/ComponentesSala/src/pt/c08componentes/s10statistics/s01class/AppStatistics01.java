package pt.c08componentes.s10statistics.s01class;

public class AppStatistics01 {
   public static void main(String args[])
   {
       try {
    	   
    	   Statistics statistic = new Statistics();
    	   statistic.insertValue(50);
    	   statistic.insertValue(70);
    	   statistic.insertValue(30);
    	   
    	   System.out.println("Dependencia de uma implementacao");
    	   System.out.println("Media: " + statistic.average());
    	   System.out.println("Soma: " + statistic.sum());

       } catch (Exception e) {
           e.printStackTrace();
       }
   }

}
