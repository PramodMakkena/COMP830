package unittest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InventoryItemTest {

	private InventoryItem objUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		objUnderTest = new InventoryItem("Shirt", 5, "Calvin", 15);
		
	}
	
	@Test
	void TestInit() {
			InventoryItem i1 = new InventoryItem("Skirts", 5, "Calvin", 15);
			InventoryItem i2 = new InventoryItem("Shorts", 5, "Klein", 15);
		
			objUnderTest.init(i1,i2);
			
			
			assertEquals(i1, objUnderTest.InventoryItem(0, 1));
			
		}

	
	@Test
	public void Test() {
		
		
		InventoryItem i1 = Mockito.mock(InventoryItem.class);
		
		Mockito.when(i1.getName()).thenReturn("Calivn");
		Mockito.when(i1.getWeight()).thenReturn(5);
		Mockito.when(i1.getCount()).thenReturn(15);
		Mockito.when(i1.getType()).thenReturn("Skirt");
		
		InventoryItem i2 = Mockito.mock(InventoryItem.class);
		
		Mockito.when(i2.getName()).thenReturn("Klein");
		Mockito.when(i2.getWeight()).thenReturn(5);
		Mockito.when(i2.getCount()).thenReturn(15);
		Mockito.when(i2.getType()).thenReturn("Shorts");
		
		InventoryItem spy = Mockito.spy(objUnderTest);
		
		assertEquals(mock.getName(), spy.getName());
		assertEquals(mock.getWeight(), spy.getWeight());
		assertEquals(mock.getCount(), spy.getCount());
		assertEquals(mock.getType(), spy.getType());

	}

}
