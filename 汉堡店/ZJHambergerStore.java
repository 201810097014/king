package Store;
import Hamburger.CheeseHamburger;
import Hamburger.DurianHamburger;
import Hamburger.Hamberger;
import Hamburger.VeggieHamburger;
//湛江汉堡店
public class ZJHambergerStore extends HambergerStore {
	//返回湛江风味i的各种类型的汉堡
	 Hamberger creatHamberger(String type) {
	  	   if("cheese".equals(type))
	  		   return new CheeseHamburger();
	  	   else if("veggie".equals(type)) {
	  		   return new VeggieHamburger();
	  	   }
	  	   else if("durian".equals(type)) {
	  		   return new DurianHamburger();
	     }
	     else {
	  	   return null;
	     }
	 }
}
