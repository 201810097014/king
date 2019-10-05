package Store;
import Hamburger.Hamberger;
//汉堡店
public abstract class HambergerStore {
       public Hamberger orderHamberger(String type) {
    	   //通过工厂方法获取汉堡
    	   Hamberger hamberger=creatHamberger(type);
    	   //汉堡的准备
    	   hamberger.bake();
    	   hamberger.cut();
    	   hamberger.box();
    	   return hamberger;
       }
           //获取汉堡的工厂方法
       abstract Hamberger creatHamberger(String type);
}
