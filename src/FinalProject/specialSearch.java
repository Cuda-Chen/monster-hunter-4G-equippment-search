package FinalProject;

import java.util.ArrayList;

public class specialSearch {
	public specialSearch() {
		
	}
    public void Search1(String s, ArrayList<String> list) {
    	for (String tmp : DataInput.aList) {
    		if (tmp.contains(s)) {
    		/**if (tmp.contains("火属性攻撃") ||
    				tmp.contains("水属性攻撃") ||
    				tmp.contains("雷火属性攻撃") ||
    				tmp.contains("氷属性攻撃") ||
    				tmp.contains("龍属性攻撃"))
    			break;*/
    		list.add(tmp);
    		}
    	}
    	
    	for (String tmp1 : Equipment_Sword.sList) {
    		if (tmp1.contains(s)) {
    			/**if (tmp1.contains("火属性攻撃") ||
        				tmp1.contains("水属性攻撃") ||
        				tmp1.contains("雷火属性攻撃") ||
        				tmp1.contains("氷属性攻撃") ||
        				tmp1.contains("龍属性攻撃"))
        			break;*/
        		list.add(tmp1);
    		}
    	}
    }
}
