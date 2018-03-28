package labtest_1647;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaCustomerTest {
	
	Pizza p1,p2;
	PizzaCustomer c1;

	@Before
	public void setUp() throws Exception {
		
		p1 = new Pizza ("paneer makhani","Veg",200,1);
		p2 = new Pizza ("barbeque","Non Veg",250,2);
		c1 = new PizzaCustomer("Shreya");
		c1.addPizza(new Pclass(p1));
		c1.addPizza(new Pclass(p2));
		System.out.println(c1.bill());
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
