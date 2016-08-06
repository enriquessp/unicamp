package pt.c08componentes.s10statistics.s04dcc;

import anima.factory.IGlobalFactory;
import anima.factory.context.componentContext.ComponentContextFactory;

public class AppStatistics04
{
	public static void main(String args[])
	{
		try {

			IGlobalFactory factory = ComponentContextFactory.createGlobalFactory();
			factory.registerPrototype(StatisticsComponent.class);

			IStatistics statistic = factory.createInstance("<http://purl.org/dcc/pt.c08componentes.s10statistics.s04dcc.StatisticsComponent>");
			statistic.insertValue(50);
			statistic.insertValue(70);
			statistic.insertValue(30);

			System.out.println("Usando a factory para receber a interface");
			System.out.println("Media: " + statistic.average());
			System.out.println("Soma: " + statistic.sum());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
