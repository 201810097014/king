package Store;
import Hamburger.CheeseHamburger;
import Hamburger.DurianHamburger;
import Hamburger.Hamberger;
import Hamburger.VeggieHamburger;
//�׸ߺ�����
public class lgHambergerStore extends HambergerStore {
	//�����׸߷�ζ�ĸ������͵ĺ���
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
