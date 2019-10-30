package FinalProject;
// source: wiki.mh4g.org 
// and http://www49.atwiki.jp/3dsmh4/
// inspired by: http://mh4.wiki-db.com/sim/
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class FinalProject {
	public static void main(String[] args) {
	 MyFrame frame = new MyFrame(); // initialize MyFrame frame
	
	 frame.setSize(500, 389);
	 frame.setLocationRelativeTo(null);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	 frame.setTitle("MH4G裝備查詢器");
	 //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	 
	 //System.out.println(frame.getWidth());
	 //System.out.println(frame.getHeight());
	 //System.out.println(DataInput.aList.size());
	}
}
