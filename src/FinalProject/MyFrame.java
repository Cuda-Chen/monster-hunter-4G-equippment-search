package FinalProject;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class MyFrame extends JFrame {
	private String[] jck = { 
			"---",
	"回復速度+1",
	"回復速度+2",
	"精霊の加護",
	"納刀術",
	"回避性能+1",
	"回避性能+2",
	"回避性能+3",
	"回避距離UP",
	"隱密",
	"ガード性能+1",
	"ガード性能+2",
	"ガード強化",
	"根性",
	"オートガード", //劍士
	"金剛体" }; // initialize String array jck 生存相關
	
	private String[] jck1 = {
			"---",
	"笛吹き名人",
	"ボマー",
	"体力回復量UP",
	"広域化+1", 
	"広域化+2",
	"アイテム使用強化", 
	"まんぷく", 
	"拾い食い", 
	"早食い+1", 
	"早食い+2", 
	"お肉大好き", 
	"調合成功率+20%",
	"調合成功率+45%", 
	"最大数生産", 
	"罠師" }; // initialize String array jck1 物品相關
	private String[] jck2 = {
			"---",
	"体術+1", 
	"体術+2", 
	"暑さ無効", 
	"寒さ無効",
	"ランナー", 
	"スタミナ急速回復", 
	"腹減り無効", 
	"腹減り半減", 
	"採取+1", 
	"採取+2",
	"採取マスター",
	"高速収集",
	"精霊の気まぐれ",
	"神の気まぐれ",
	"ハニーハンター",
	"お守り収集",
	"お守りマスター",
	"幸運",
	"強運",
	"激運",
	"剥ぎ取り鉄人",
	"剥ぎ取り名人",
	"剥ぎ取りマスター",
	"捕獲達人",
	"捕獲名人",
	"捕獲マスター",
	"捕獲の見極め",
	"探知",
	"自動マーキング",
	"運搬の達人",
	"ハンター生活",
	"燃鱗",
	"オトモへの采配",
	"オトモへの号令" }; // initialize String array jck2 任務相關
	private String[] jck3 = {
			"---",
	"毒無効",
	"麻痺無効",
	"睡眠無効",
	"気絶確率半減",
	"気絶無効",
	"泥＆雪無効",
	"鉄面皮",
	"細菌研究家",
	"バイオドクター",
	"耳栓",
	"高級耳栓",
	"風圧【小】無効",
	"風圧【大】無効",
	"耐震",
	"盗み無効",
	"属性やられ無効",
	"無我の境地" }; // initialize String array jck3 特殊攻擊耐性
    private String[] jck4 = {
    		"---",
	"攻撃力UP【小】",
	"攻撃力UP【中】",
	"攻撃力UP【大】",
	"攻撃力UP【超】",
	"防御力UP【小】",
	"防御力UP【中】",
	"防御力UP【大】",
	"防御力UP【超】",
	"体力+20",
	"体力+50",
	"火耐性【小】",
	"火耐性【大】",
	"水耐性【小】",
	"水耐性【大】",
	"雷耐性【小】",
	"雷耐性【大】",
	"氷耐性【小】",
	"氷耐性【大】",
	"龍耐性【小】",
	"龍耐性【大】" }; // initialize String array jck4  パラメータ変化
    private String[] jck5 = {
    		"---",
	"集中",
	"見切り+1",
	"見切り+2",
	"見切り+3",
	"見切りマスター",
	"弱点特効",
	"破壊王",
	"KO術",
	"スタミナ奪取",
	"状態異常攻撃+1",
	"状態異常攻撃+2",
	"火属性攻撃強化+1",
	"火属性攻撃強化+2",
	"火属性攻撃強化+3",
	"水属性攻撃強化+1",
	"水属性攻撃強化+2",
	"水属性攻撃強化+3",
	"雷属性攻撃強化+1",
	"雷属性攻撃強化+2",
	"雷属性攻撃強化+3",
	"氷属性攻撃強化+1",
	"氷属性攻撃強化+2",
	"氷属性攻撃強化+3",
	"龍属性攻撃強化+1",
	"龍属性攻撃強化+2",
	"龍属性攻撃強化+3",
	
	
	"装填数UP",
	"砲術師",
	"砲術王",
	"砲術マスター",
	"火事場力+1",
	"火事場力+2",
	"不屈",
	"力の解放+1",
	"力の解放+2",
	"挑戦者+1",
	"挑戦者+2",
	"フルチャージ",
	"覚醒",
	"乗り名人" }; // initialize String array jck5 戦闘(攻撃)
    private String[] jck5_1 = {"装填速度+1",
    		 ("装填速度+2"),
    		 ("装填速度+3"),
    		 ("装填数UP"),
    		 ("連発数+1"),
    		 ("反動軽減+1"),
    		 ("反動軽減+2"),
    		 ("反動軽減+3"),
    		 ("ブレ抑制+1"),
    		 ("ブレ抑制+2"),
    		 ("通常弾・連射矢UP"),
    		 ("貫通弾・貫通矢UP"),
    		 ("散弾・拡散矢UP"),
    		 ("通常弾全LV追加"),
    		 ("貫通弾LV1追加"),
    		 ("貫通弾全LV追加"),
    		 ("散弾LV1追加"),
    		 ("散弾全LV追加"),
    		 ("徹甲榴弾LV1追加"),
    		 ("徹甲榴弾全LV追加"),
    		 ("拡散弾LV1追加"),
    		 ("拡散弾全LV追加"),
    		 ("斬裂弾追加"),
    		 ("爆破弾追加"),
    		 ("毒ビン追加"),
    		 ("麻痺ビン追加"),
    		 ("睡眠ビン追加"),
    		 ("強撃ビン追加"),
    		 ("接撃ビン追加"),
    		 ("減気ビン追加"),
    		 ("爆破ビン追加"),
    		 
    	    		}; // initialize String array jck5_1 戦闘(攻撃) Archer
    private String[] jck5_2 = {
    		"業物",
    		"斬れ味レベル+1",
    		"砥石使用高速化",
    		"抜刀術【力】",
    		"抜刀術【技】",
    		"心眼",	
    }; // initialize String array jck5_2 戦闘(攻撃) Sword
    private String[] jck6 = {
    		"---",
	"属性攻撃強化",
	"護法",
	"逆鱗",
	"真打",
	"精神力",
	"鉄壁",
	"増収",
	"無慈悲",
	"オトモ指揮官",
	"居合術【力】",
	"軽業師",
	"盾使い",
	"舞闘家",
	"お守りマニア",
	"属物強化",
	"剛弾"
	}; // initialize String array jck6  複合技能
    private String[] jck7 = {
    	"男性",
    	"女性"
    }; // initialize String array jck7 gender 
    private String[] jck8 = {
    		"剣士",
    		 "ガンナー",
    }; // initialize String array jck8 weapon type
	private JLabel jbl = new JLabel("生存相關"); // initialize JLabel jbl
	private JLabel jbl1 = new JLabel("物品相關"); // initialize JLabel jbl1
	private JLabel jbl2 = new JLabel("任務相關"); // initialize JLabel jbl2
	private JLabel jbl3 = new JLabel("特殊攻擊耐性"); // initialize JLabel jbl3
	private JLabel jbl4 = new JLabel("パラメータ変化"); // initialize JLabel jbl4
	private JLabel jbl5 = new JLabel("戦闘(攻撃)"); // initialize JLabel jbl5
	private JLabel jbl6 = new JLabel("複合技能"); // initialize JLabel jbl6
	private JLabel jbl7 = new JLabel(); // initialize JLabel jbl7
	
	
	private JPanel p = new JPanel(); // initialize JPanel p 
	private JLabel jbl8 = new JLabel(); // initialize JLabel jbl8
	
	private JComboBox<String> jcbo = new JComboBox<String>(jck); // initialize JComboBox jcbo and contains jck
	private JComboBox<String> jcbo1 = new JComboBox<String>(jck1); // initialize JComboBox jcbo1 and contains jck1
	private JComboBox<String> jcbo2 = new JComboBox<String>(jck2); // initialize JComboBox jcbo2 and contains jck2
	private JComboBox<String> jcbo3 = new JComboBox<String>(jck3); // initialize JComboBox jcbo3 and contains jck3
	private JComboBox<String> jcbo4 = new JComboBox<String>(jck4); // initialize JComboBox jcbo4 and contains jck4
	private JComboBox<String> jcbo5 = new JComboBox<String>(jck5); // initialize JComboBox jcbo5 and contains jck5
	private JComboBox<String> jcbo6 = new JComboBox<String>(jck6); // initialize JComboBox jcbo6 and contains jck6
	private JComboBox<String> jcbo7 = new JComboBox<String>(jck7); // initialize JComboBox jcbo7 and contains jck7
	private JComboBox<String> jcbo8 = new JComboBox<String>(jck8); // initialize JComboBox jcbo8 and contains jck8
	private JTextArea jta = new JTextArea(); // initialize JTextArea jta as no words
	
	private JScrollPane g = new JScrollPane(jta); // initialize JScrollPane g and contains jta
	 
	private JButton jbt = new JButton("開始查詢"); // initialize JButton jbt, set text to "開始查詢"
	DataInput d = new DataInput(); // initialize DataInput d

	Equipment_Sword s = new Equipment_Sword(); // initialize Equipment_Sword s
	Equipment_Archer a = new Equipment_Archer(); // initialize Equipment_Archer a
	private ArrayList<String> list = new ArrayList<String>(); // initialize ArrayList<String> list
	specialSearch special = new specialSearch();
	
	
  public MyFrame() {
	
		 d.Data();
		 s.Data_s();
		 a.Data_a();
	  setLayout(new BorderLayout());
	  
	  jta.setLineWrap(true);
	  jta.setWrapStyleWord(true);
	  jta.setEditable(false);
	  
	 for (int i = 0; i < jck5_2.length; i++) {
		 jcbo5.addItem(jck5_2[i]);
	 }
	 jcbo6.removeItemAt(15); 
	 
	 p.setLayout(new GridLayout(17, 1));
	 jbl8.setLayout(new GridLayout(1, 2));
	 
	 jbl8.add(jcbo7);
	 jbl8.add(jcbo8);
	 p.add(jbl8);
	 p.add(jbl);
	 
	 p.add(jcbo);
	 
	 p.add(jbl1);
	 
	 p.add(jcbo1);
	 p.add(jbl2);
	 p.add(jcbo2);
	 p.add(jbl3);
	 p.add(jcbo3);
	 p.add(jbl4);
	 p.add(jcbo4);
	 p.add(jbl5);
	 p.add(jcbo5);
	 p.add(jbl6);
	 p.add(jcbo6);
	 p.add(jbl7);
	 p.add(jbt);
	 
	 
	 jbt.addActionListener(new ButtonListener());
	 jcbo8.addActionListener(new ComboBoxListener());
	 jcbo8.addActionListener(new ComboBoxListener1());
	 jcbo8.addActionListener(new ComboBoxListener2());
	 
	 add(p, BorderLayout.WEST);
	 
	 add(g, BorderLayout.CENTER);
	 
  }
  
  
  
  
  
  private class ButtonListener implements ActionListener {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		   if (jcbo.getSelectedItem() != null) {
			   if (jcbo.getSelectedItem().toString() == "根性") {
					  String s = ("根性");
					  Search(s);
				  }
			   if (jcbo.getSelectedItem().toString() == "回復速度+1" ||
					   jcbo.getSelectedItem().toString() == "回復速度+2" ) {
					  String s = "回復速度";
					 Search(s);
				  }
			   if (jcbo.getSelectedItem().toString() == "精霊の加護") {
				   String s = "加護";
				   Search(s);
			   }
			   if (jcbo.getSelectedItem().toString() == "納刀術") {
				   String s = "納刀";
				   Search(s);
			   }
			   if (jcbo.getSelectedItem().toString() == "回避性能+3" ||
					   jcbo.getSelectedItem().toString() == "回避性能+2" ||
					   jcbo.getSelectedItem().toString() == "回避性能+1") {
				   String s = "回避性能";
				   Search(s);
			   }
			   if (jcbo.getSelectedItem().toString() == "回避距離UP") {
				   String s = "回避距離";
				   Search(s);
			   }
			   if (jcbo.getSelectedItem().toString() == "隠密") {
				   Search("気配");
			   }
			   if (jcbo.getSelectedItem().toString() == "ガード性能+2" ||
					   jcbo.getSelectedItem().toString() == "ガード性能+1") {
				   Search("ガード性能");
			   }
			   if (jcbo.getSelectedItem().toString() == "ガード強化") {
				   Search("ガード強化");
			   }
			   if (jcbo.getSelectedItem().toString() == "オートガード") {
				   Search("自動防御");
			   }
			   if (jcbo.getSelectedItem().toString() == "金剛体") {
				   Search("不動");
			   }
		   }
		  
		   if (jcbo1.getSelectedItem() != null) {
			   if (jcbo1.getSelectedItem().toString() == "運搬の達人")
			    { String s = "運搬";
			    Search(s);
			    } 
			   if (jcbo1.getSelectedItem().toString() == "調合成功率+20%" ||
					   jcbo1.getSelectedItem().toString() == "調合成功率+45%") {
					  String s = ("調合成功率");
					  Search(s);
				  }
			   if (jcbo1.getSelectedItem().toString() == "お肉大好き") {
					  String s = ("肉食");
					  Search(s);
				  }
			   if (jcbo1.getSelectedItem().toString() == "ボマー") {
					  String s = ("爆弾強化");
					  Search(s);
				  }
			   if (jcbo1.getSelectedItem().toString() == "笛吹き名人") {
					  String s = ("笛");
					  Search(s);
				  }
			   if (jcbo1.getSelectedItem().toString() == "体力回復量UP") {
				   Search("回復量");
			   }
			   if (jcbo1.getSelectedItem().toString() == "広域化+1" || 
					   jcbo1.getSelectedItem().toString() == "広域化+2") {
				   Search("広域");
			   }
			   if (jcbo1.getSelectedItem().toString() == "アイテム使用強化") {
				   Search("効果持続");
			   }
			   if (jcbo1.getSelectedItem().toString() == "まんぷく" || 
					   jcbo1.getSelectedItem().toString() == "拾い食い") {
				   Search("食いしん坊");
			   }
			   if (jcbo1.getSelectedItem().toString() == "早食い+1" || 
					   jcbo1.getSelectedItem().toString() == "早食い+2") {
				   Search("食事");
			   }
			   if (jcbo1.getSelectedItem().toString() == "最大数生産") {
				   Search("調合数");
			   }
			   if (jcbo1.getSelectedItem().toString() == "罠師") {
				   Search("高速設置");
			   }
		   }
		   
		   if (jcbo2.getSelectedItem() != null) {
			   if (jcbo2.getSelectedItem().toString() == "体術+1" ||
					   jcbo.getSelectedItem().toString() == "体術+2") {
				   Search("体術");
			   }
			   if (jcbo2.getSelectedItem().toString() == "寒さ無効") {
				   Search("耐寒");
			   }
			   if (jcbo2.getSelectedItem().toString() == "ランナー") {
				   Search("スタミナ");
			   }
			   if (jcbo2.getSelectedItem().toString() == "スタミナ急速回復") {
				   Search("気力回復");
			   }
			   if (jcbo2.getSelectedItem().toString() == "ハニーハンター") {
				   Search("ハチミツ");
			   }
			   if (jcbo2.getSelectedItem().toString() == "お守り収集" ||
					   jcbo2.getSelectedItem().toString() == "お守りハンター" ||
					   jcbo2.getSelectedItem().toString() == "お守りマスター") {
				   Search("護石王");
			   }
			   if (jcbo2.getSelectedItem().toString() == "剥ぎ取り鉄人" ||
					   jcbo2.getSelectedItem().toString() == "剥ぎ取り名人" ||
					   jcbo2.getSelectedItem().toString() == "剥ぎ取りマスター") {
				   Search("剥ぎ取り");
			   }
			   if (jcbo2.getSelectedItem().toString() == "捕獲達人" || 
					   jcbo2.getSelectedItem().toString() == "捕獲名人" ||
					   jcbo2.getSelectedItem().toString() == "捕獲マスター") {
				   Search("捕獲");
			   }
			   if (jcbo2.getSelectedItem().toString() == "幸運" ||
					   jcbo2.getSelectedItem().toString() == "強運" ||
					   jcbo2.getSelectedItem().toString() == "激運")
			    {String s = "運気";
			    Search(s);
			    }
			   if (jcbo2.getSelectedItem().toString() == "ハンター生活") {
				   Search("狩人");
			   }
			   if (jcbo2.getSelectedItem().toString() == "燃鱗") {
				   Search("燃鱗");
			   }
			   if (jcbo2.getSelectedItem().toString() == "オトモへの采配") {
				   Search("采配");
			   }
			   if (jcbo2.getSelectedItem().toString() == "オトモへの号令") {
				   Search("号令");
			   }
			   if (jcbo2.getSelectedItem().toString() == "採取マスター" ||
					   jcbo2.getSelectedItem().toString() == "採取+2" ||
					   jcbo2.getSelectedItem().toString() == "採取+1") {
					  String s = ("採取");
					  Search(s);
				  }
				  if (jcbo2.getSelectedItem().toString() == "精霊の気まぐれ" ||
						  jcbo2.getSelectedItem().toString() == "神の気まぐれ") {
					  String s = ("気まぐれ");
					  Search(s);
				  }
				  if (jcbo2.getSelectedItem().toString() == "腹減り無効" ||
						  jcbo2.getSelectedItem().toString() == "腹減り半減") {
					  String s = ("腹減り");
					  Search(s);
				  }
				  if (jcbo2.getSelectedItem().toString() == "暑さ無効") {
					  String s = ("耐暑");
					  Search(s);
				  }
				  if (jcbo2.getSelectedItem().toString() == "探知" ||
						  jcbo2.getSelectedItem().toString() == "自動マーキング") {
					  String s = ("千里眼");
					  Search(s);			  
				  }
				  if (jcbo2.getSelectedItem().toString() == "捕獲の見極め") {
					  String s = ("観察眼");
					  Search(s);
		   }
				  if (jcbo2.getSelectedItem().toString() == "高速収集") {
					  String s = ("高速収集");
					  Search(s);
				  }
		   }
		   
		   if (jcbo3.getSelectedItem() != null) {
			   if (jcbo3.getSelectedItem().toString() == "毒無効") {
				   Search("毒");
			   }
			   if (jcbo3.getSelectedItem().toString() == "麻痺無効") {
				   Search("麻痺");
			   }
			   if (jcbo3.getSelectedItem().toString() == "睡眠無効") {
				   Search("睡眠");
			   }
			   if (jcbo3.getSelectedItem().toString() == "気絶確率半減" ||
					   jcbo3.getSelectedItem().toString() == "気絶無効") {
				   Search("気絶無効");
			   }
			   if (jcbo3.getSelectedItem().toString() == "泥＆雪無効") {
				   Search("耐泥耐雪");
			   }
			   
			   if (jcbo3.getSelectedItem().toString() == "鉄面皮") {
				   Search("対防御DOWN");
			   }
			   if (jcbo3.getSelectedItem().toString() == "細菌研究家" ||
					   jcbo3.getSelectedItem().toString() == "バイオドクター") {
				   Search("細菌学");
			   }
			   if (jcbo3.getSelectedItem().toString() == "高級耳栓" ||
					   jcbo3.getSelectedItem().toString() == "耳栓") {
				   Search("聴覚保護");
			   }
			   if (jcbo3.getSelectedItem().toString() == "風圧【小】無効" ||
					   jcbo3.getSelectedItem().toString() == "風圧【大】無効") {
				   Search("風圧");
			   }
			   if (jcbo3.getSelectedItem().toString() == "耐震") {
				   Search("耐震");
			   }
			   if (jcbo3.getSelectedItem().toString() == "属性やられ無効") {
				   Search("属性耐性");
			   }
			   if (jcbo3.getSelectedItem().toString() == "無我の境地") {
					  String s = ("狂撃耐性");
					  Search(s);
				  }
			   if (jcbo3.getSelectedItem().toString() == "盗み無効") {
					  String s = ("盗み無効");
					  Search(s);
				  }
			 
		   }
		   
		   if (jcbo4.getSelectedItem() != null) {
			   if (jcbo4.getSelectedItem().toString() == "体力+20" ||
					   jcbo4.getSelectedItem().toString() == "体力+50") {
					  String s = "体力";
					  Search(s);
			   }
			   if (jcbo4.getSelectedItem().toString() == "攻撃力UP【小】" ||
					   jcbo4.getSelectedItem().toString() == "攻撃力UP【中】" ||
					   jcbo4.getSelectedItem().toString() == "攻撃力UP【大】" ||
					   jcbo4.getSelectedItem().toString() == "攻撃力UP【超】") {
				   Search("攻撃");
			   }
			   if (jcbo4.getSelectedItem().toString() == "防御力UP【小】" ||
					   jcbo4.getSelectedItem().toString() == "防御力UP【中】" ||
					   jcbo4.getSelectedItem().toString() == "防御力UP【大】" ||
					   jcbo4.getSelectedItem().toString() == "防御力UP【超】") {
				   Search("防御");
			   }
			   if (jcbo4.getSelectedItem().toString() == "火耐性【小】" || 
					   jcbo4.getSelectedItem().toString() == "火耐性【大】") {
				   Search("火耐性");
			   }
			   if (jcbo4.getSelectedItem().toString() == "水耐性【小】" ||
					   jcbo4.getSelectedItem().toString() == "水耐性【大】") {
				   Search("水耐性");
			   }
			   if (jcbo4.getSelectedItem().toString() == "雷耐性【小】" ||
					   jcbo4.getSelectedItem().toString() == "雷耐性【大】") {
				   Search("雷耐性");
			   }
			   if (jcbo4.getSelectedItem().toString() == "氷耐性【小】" ||
				   jcbo4.getSelectedItem().toString() == "氷耐性【大】") {
				   Search("氷耐性");
			   }
			   if (jcbo4.getSelectedItem().toString() == "龍耐性【小】" ||
					   jcbo4.getSelectedItem().toString() == "龍耐性【大】") {
				   Search("龍耐性");
			   }
		   }
		   
		   if (jcbo5.getSelectedItem() != null) {
			   if (jcbo5.getSelectedItem().toString() == "集中") {
				   Search("溜め短縮");
			   }
			   if (jcbo5.getSelectedItem().toString() == "見切り+1" ||
					   jcbo5.getSelectedItem().toString() == "見切り+2" ||
					   jcbo5.getSelectedItem().toString() == "見切り+3" ||
					   jcbo5.getSelectedItem().toString() == "見切りマスター") {
				   Search("達人");
			   }
			   if (jcbo5.getSelectedItem().toString() == "弱点特効") {
				   Search("痛撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "破壊王") {
				   Search("重撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "KO術") {
				   Search("KO");
			   }
			   if (jcbo5.getSelectedItem().toString() == "スタミナ奪取") {
				   Search("減気攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "状態異常攻撃+1" ||
					   jcbo5.getSelectedItem().toString() == "状態異常攻撃+2") {
				   Search("特殊攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "火属性攻撃強化+1" ||
					   jcbo5.getSelectedItem().toString() == "火属性攻撃強化+2" ||
					   jcbo5.getSelectedItem().toString() == "火属性攻撃強化+3") {
				   Search("火属性攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "水属性攻撃強化+1" ||
					   jcbo5.getSelectedItem().toString() == "水属性攻撃強化+2" ||
					   jcbo5.getSelectedItem().toString() == "水属性攻撃強化+3") {
				   Search("水属性攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "雷属性攻撃強化+1" ||
					   jcbo5.getSelectedItem().toString() == "雷属性攻撃強化+2" ||
					   jcbo5.getSelectedItem().toString() == "雷属性攻撃強化+3") {
				   Search("雷属性攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "氷属性攻撃強化+1" ||
					   jcbo5.getSelectedItem().toString() == "氷属性攻撃強化+2" ||
					   jcbo5.getSelectedItem().toString() == "氷属性攻撃強化+3") {
				   Search("氷属性攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "龍属性攻撃強化+1" ||
					   jcbo5.getSelectedItem().toString() == "龍属性攻撃強化+2" ||
					   jcbo5.getSelectedItem().toString() == "龍属性攻撃強化+3") {
				   Search("龍属性攻撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "業物") {
				   Search("斬れ味");
			   }
			   if (jcbo5.getSelectedItem().toString() == "斬れ味レベル+1") {
				   Search("匠");
			   }
			   if (jcbo5.getSelectedItem().toString() == "砥石使用高速化") {
				   Search("研ぎ師");
			   }
			   if (jcbo5.getSelectedItem().toString() == "抜刀術【力】") {
				   Search("抜刀減気");
			   }
			   if (jcbo5.getSelectedItem().toString() == "抜刀術【技】") {
				   Search("抜刀会心");
			   }
			   if (jcbo5.getSelectedItem().toString() == "心眼") {
				   Search("剣術");
			   }
			   if (jcbo5.getSelectedItem().toString() == "装填数UP") {
				   Search("装填数");
			   }
			   if (jcbo5.getSelectedItem().toString() == "砲術師" ||
					   jcbo5.getSelectedItem().toString() == "砲術王" ||
					   jcbo5.getSelectedItem().toString() == "砲術マスター") {
				   Search("砲術");
			   }
			   if (jcbo5.getSelectedItem().toString() == "火事場力+1" ||
					   jcbo5.getSelectedItem().toString() == "火事場力+2") {
				   Search("底力");
			   }
			   if (jcbo5.getSelectedItem().toString() == "不屈") {
				   Search("逆境");
			   }
			   if (jcbo5.getSelectedItem().toString() == "力の解放+1" ||
					   jcbo5.getSelectedItem().toString() == "力の解放+2") {
				   Search("本気");
			   }
			   if (jcbo5.getSelectedItem().toString() == "挑戦者+1" ||
					   jcbo5.getSelectedItem().toString() == "挑戦者+2") {
				   Search("闘魂");
			   }
			   if (jcbo5.getSelectedItem().toString() == "フルチャージ") {
				   Search("無傷");
			   }
			   if (jcbo5.getSelectedItem().toString() == "覚醒") {
				   Search("属性解放");
			   }
			   if (jcbo5.getSelectedItem().toString() == "装填速度+1" ||
					   jcbo5.getSelectedItem().toString() == "装填速度+2" ||
					   jcbo5.getSelectedItem().toString() == "装填速度+3") {
				   Search("装填速度");
			   }
			   if (jcbo5.getSelectedItem().toString() == "連発数+1") {
				   Search("速射");
			   }
			   if (jcbo5.getSelectedItem().toString() == "反動軽減+1" ||
					   jcbo5.getSelectedItem().toString() == "反動軽減+2" ||
					   jcbo5.getSelectedItem().toString() == "反動軽減+3") {
				   Search("反動");
			   }
			   if (jcbo5.getSelectedItem().toString() == "ブレ抑制+1" ||
					   jcbo5.getSelectedItem().toString() == "ブレ抑制+2") {
				   Search("精密射撃");
			   }
			   if (jcbo5.getSelectedItem().toString() == "通常弾・連射矢UP") {
				   Search("通常弾強化");
			   }
			   if (jcbo5.getSelectedItem().toString() == "貫通弾・貫通矢UP") {
				   Search("貫通弾強化");
			   }
			   if (jcbo5.getSelectedItem().toString() == "散弾・拡散矢UP") {
				   Search("散弾強化");
			   }
			   if (jcbo5.getSelectedItem().toString() == "通常弾全LV追加") {
				   Search("通常弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "貫通弾LV1追加" ||
					   jcbo5.getSelectedItem().toString() == "貫通弾全LV追加") {
				   Search("貫通弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "散弾LV1追加" ||
					   jcbo5.getSelectedItem().toString() == "散弾全LV追加") {
				   Search("散弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "徹甲榴弾LV1追加" ||
					   jcbo5.getSelectedItem().toString() == "徹甲榴弾全LV追加") {
				   Search("榴弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "拡散弾LV1追加" ||
					   jcbo5.getSelectedItem().toString() == "拡散弾全LV追加") {
				   Search("拡散弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "斬裂弾追加") {
				   Search("斬裂弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "爆破弾追加") {
				   Search("爆破弾追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "毒ビン追加") {
				   Search("毒瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "麻痺ビン追加") {
				   Search("麻痺瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "睡眠ビン追加") {
				   Search("睡眠瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "強撃ビン追加") {
				   Search("強撃瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "接撃ビン追加") {
				   Search("接撃瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "減気ビン追加") {
				   Search("減気瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "爆破ビン追加") {
				   Search("爆破瓶追加");
			   }
			   if (jcbo5.getSelectedItem().toString() == "乗り名人") {
					  String s = ("乗り");
					  Search(s);
				  }
		   }
		   
		   if (jcbo6.getSelectedItem() != null) {
			   if (jcbo6.getSelectedItem().toString() == "属性攻撃強化") {
				   special.Search1("属性攻撃", list);
			   }
			   if (jcbo6.getSelectedItem().toString() == "護法") {
				   Search("状態耐性");
			   }
			   if (jcbo6.getSelectedItem().toString() == "鉄壁") {
				   Search("頑強");
			   }
			   if (jcbo6.getSelectedItem().toString() == "増収") {
				   Search("強欲");
			   }
			   if (jcbo6.getSelectedItem().toString() == "無慈悲") {
				   Search("剛撃");
			   }
			   if (jcbo6.getSelectedItem().toString() == "軽業師") {
				   Search("回避術");
			   }
			   if (jcbo6.getSelectedItem().toString() == "盾使い") {
				   Search("盾持");
			   }
			   if (jcbo6.getSelectedItem().toString() == "舞闘家") {
				   Search("潔癖");
			   }
			   if (jcbo6.getSelectedItem().toString() == "お守りマニア") {
				   Search("護石収集");
			   }
			   if (jcbo6.getSelectedItem().toString() == "属物強化") {
				   Search("増幅");
			   }
		       if (jcbo6.getSelectedItem().toString() == "居合術【力】")
		            { String s = "居合術【力】";
		            Search(s);
		        }
		        if (jcbo6.getSelectedItem().toString() == "逆鱗")
		            { String s = "怒";
		            Search(s);
		        }
		        if (jcbo6.getSelectedItem().toString() == "精神力")
		            { String s = "一心";
		            Search(s);
		        }
		        if (jcbo6.getSelectedItem().toString() == "オトモ指揮官") {
					  String s = ("指揮");
					  Search(s);
					  
				  }
		        if (jcbo6.getSelectedItem().toString() == "剛弾") {
		        	Search("射手");
		        }
		   }
		   DisplayList();
	  }
  }
  
  
  public void Search(String s) {
	  list.clear();
	  if (jcbo8.getSelectedItem().toString() == "剣士") {
		  if (jcbo7.getSelectedItem().toString() == "男性") {
	          for (String tmpString : DataInput.aList) {
		          if (tmpString.contains(s) && (tmpString.contains("A") || tmpString.contains("B"))) {
			          list.add(tmpString);
		  }
	  }
	  
	  for (String tmp1 : Equipment_Sword.sList) {
		  if (tmp1.contains(s) && (tmp1.contains("A") || tmp1.contains("B"))) {
			  list.add(tmp1);
		  }
	  }
		  }
		  
		  if (jcbo7.getSelectedItem().toString() == "女性") {
			  for (String tmp : DataInput.aList) {
				  if (tmp.contains(s) && (tmp.contains("A") || tmp.contains("G")))
					  list.add(tmp);
			  }
			  for (String tmp1 : Equipment_Sword.sList) {
				  if (tmp1.contains(s) && (tmp1.contains("A") || tmp1.contains("G")))
					  list.add(tmp1);
			  }
		  }
	  }
	  
	  if (jcbo8.getSelectedItem().toString() == "ガンナー") {
		  if (jcbo7.getSelectedItem().toString() == "男性") {
	          for (String tmpString : DataInput.aList) {
		          if (tmpString.contains(s) && (tmpString.contains("A") || tmpString.contains("B"))) {
			          list.add(tmpString);
		  }
	  }
	  
	  for (String tmp1 : Equipment_Archer.AList) {
		  if (tmp1.contains(s) && (tmp1.contains("A") || tmp1.contains("B"))) {
			  list.add(tmp1);
		  }
	  }
		  }
		  
		  if (jcbo7.getSelectedItem().toString() == "女性") {
			  for (String tmp : DataInput.aList) {
				  if (tmp.contains(s) && (tmp.contains("A") || tmp.contains("G")))
					  list.add(tmp);
			  }
			  for (String tmp1 : Equipment_Archer.AList) {
				  if (tmp1.contains(s) && (tmp1.contains("A") || tmp1.contains("G")))
					  list.add(tmp1);
			  }
		  }
	    }
	   
  }
  
  
  public void DisplayList() {
	  jta.setText("");
	  for (String t : list) {
		  jta.append(t + "\n");
	  }
	  if (list.isEmpty())
		  jta.append("沒有擁有這個技能的裝備!");
  }
  
  private class ComboBoxListener implements ActionListener {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		  if (jcbo8.getSelectedItem().toString() == "ガンナー") {
			  for (int i = 0; i < jck5_1.length; i++) {
				  jcbo5.addItem(jck5_1[i]);
			  }
			  for (int i = 0; i < jck5_2.length; i++) {
				  jcbo.removeItem(jck5_2[i]);
			  }
		  }
		  if (jcbo8.getSelectedItem().toString() == "剣士") {
			  for (int i = 0; i < jck5_1.length; i++) {
				  jcbo5.removeItem(jck5_1[i]);
			  }
			  for (int i = 0; i < jck5_2.length; i++) {
				  jcbo5.addItem(jck5_2[i]);
			  }
		  }
	  }
  }
  
  private class ComboBoxListener1 implements ActionListener {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		  if (jcbo8.getSelectedItem().toString() == "ガンナー") {
			  //System.out.println("gun");
			  jcbo.removeItemAt(14);
		  }
		  if (jcbo8.getSelectedItem().toString() == "剣士") {
			  jcbo.insertItemAt(jck[jck.length - 2], 14);
		  }
	  }
  }
  private class ComboBoxListener2 implements ActionListener {
	  @Override
	  public void actionPerformed(ActionEvent e) {
		  if (jcbo8.getSelectedItem().toString() == "ガンナー") {
			  jcbo6.removeItemAt(4);
			  jcbo6.insertItemAt(jck6[16], 4);
		  }
		  if (jcbo8.getSelectedItem().toString() == "剣士") {
			  //jcbo6.removeItemAt(16);
			  jcbo6.removeItemAt(4);
			  jcbo6.insertItemAt(jck6[4], 4);
		  }
	  }
  }
}