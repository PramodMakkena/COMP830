package interfaces;

import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {

	public static void main(String[] args) {
		List<BakedGoods> bakedGoods = new ArrayList<BakedGoods>();
		
		bakedGoods.add(new Cookie(5, "This is a chocolate chip cookie!!", "05/14/2019"));
		bakedGoods.add(new CinnamonRoll(1, "I hate Cinnamon roll!!", "05/23/2019"));
		bakedGoods.add(new Brownie(4, "Sweet Brownie!!", "05/07/2019"));
		
		for (BakedGoods bg : bakedGoods) {
			System.out.println("price:"+bg.getPrice());
			System.out.println("description:"+bg.getDescription());
			System.out.println("sell by Date:"+bg.getSellByDate()+"\n");
		}
	}

}
