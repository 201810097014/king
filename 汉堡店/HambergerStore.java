package Store;
import Hamburger.Hamberger;
//������
public abstract class HambergerStore {
       public Hamberger orderHamberger(String type) {
    	   //ͨ������������ȡ����
    	   Hamberger hamberger=creatHamberger(type);
    	   //������׼��
    	   hamberger.bake();
    	   hamberger.cut();
    	   hamberger.box();
    	   return hamberger;
       }
           //��ȡ�����Ĺ�������
       abstract Hamberger creatHamberger(String type);
}
