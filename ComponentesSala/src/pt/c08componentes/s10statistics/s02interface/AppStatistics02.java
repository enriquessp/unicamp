package pt.c08componentes.s10statistics.s02interface;

public class AppStatistics02 {
   public static void main(String args[])
   {
       try {
    	   
    	   IStatistics statistic = new Statistics();
    	   statistic.insertValue(50);
    	   statistic.insertValue(70);
    	   statistic.insertValue(30);

    	   System.out.println("Usando a interface");
    	   System.out.println("Media: " + statistic.average());
    	   System.out.println("Soma: " + statistic.sum());

       } catch (Exception e) {
           e.printStackTrace();
       }
   }

}
