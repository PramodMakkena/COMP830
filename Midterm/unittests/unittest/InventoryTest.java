package unittest;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class InventoryTest {
	
	private Inventory objUnderTest;
	
	@BeforeEach
	public void setUp() throws Exception {
		objUnderTest = new InventoryItem();
		
	}
	
	@Test
	public void testAddInventory() {
		
		InventoryItem spy = Mockito.spy(objUnderTest);
		
		InventoryItem i1 = new InventoryItem("Skirt", 5, "Calvin", 15);
		InventoryItem i2 = new InventoryItem("Shorts", 4, "Klein", 14);
	
		objUnderTest.addItemToInventory(i1);
		objUnderTest.addItemToInventory(i2);
		
		
		assertEquals(mock.getWeight(), objUnderTest.getWeight());
		assertEquals(mock.getCount(), objUnderTest.getCount());
		assertEquals(mock.toString(), objUnderTest.toString());		
		
	}

	@Test
	public void testDeleteInventory() {
		
InventoryItem spy = Mockito.spy(objUnderTest);
		
		InventoryItem i1 = new InventoryItem("Skirts", 5, "Calvin", 15);
		InventoryItem i2 = new InventoryItem("Shorts", 4, "Klein", 14);
	
		objUnderTest.addItemToInventory(i1);
		objUnderTest.addItemToInventory(i2);
		objUnderTest.dropInventoryItem(i1);
		
		
		assertEquals(objUnderTest.dropInventoryItem(i1), true);
		assertEquals(objUnderTest.dropInventoryItem(i2), false);
	}
}