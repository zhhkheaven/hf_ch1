public class MiniDuckSimulator {
	public static void main(String[] argS){
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuark();
		mallardDuck.display();
		System.out.println("---------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.display();
	}

}
