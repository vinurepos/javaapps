import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


//port javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import javax.swing.JButton;

public class CcAutoInstallBCG extends JPanel {
    
	static JFrame frame;

    JButton jlbPicture;
    JLabel jlblabel;
    JRadioButton jrbSanJose;
    JRadioButton Alphabets;
    RadioListener myListener = null;
    public CcAutoInstallBCG() {
    	
    	
    	
        // Create the radio buttons and assign Keyboard shortcuts using Mnemonics
    	
    	JRadioButton jrbAndover = new JRadioButton("Andover");
        jrbAndover.setActionCommand("mcg_cc_install_andover.bat");
        jrbAndover.setSelected(false);
        
        JRadioButton jrbAtlanta = new JRadioButton("Atlanta");
        jrbAtlanta.setActionCommand("mcg_cc_install_atlanta.bat");
        jrbAtlanta.setSelected(false);
       
        JRadioButton jrbBangalore = new JRadioButton("Bangalore");
        jrbBangalore.setActionCommand("mcg_cc_install_bangalore.bat");
        jrbBangalore.setSelected(false);
        
        JRadioButton jrbBeijing = new JRadioButton("Beijing");
        jrbBeijing.setActionCommand("mcg_cc_install_beijing.bat");
        jrbBeijing.setSelected(false);
        
        JRadioButton jrbBristol = new JRadioButton("Bristol");
        jrbBristol.setActionCommand("mcg_cc_install_bristol.bat");
        jrbBristol.setSelected(false);
                    
        JRadioButton jrbIrvine = new JRadioButton("Irvine");
        //   jrbIrvine.setMnemonic(KeyEvent.VK_A);
        jrbIrvine.setActionCommand("mcg_cc_install_irvine.bat");
        jrbIrvine.setSelected(false);
       
        JRadioButton jrbLancaster = new JRadioButton("Lancaster");
        jrbLancaster.setActionCommand("mcg_cc_install_germantown.bat");
        jrbLancaster.setSelected(false);
        
        JRadioButton jrbMontreal = new JRadioButton("Montreal");
        jrbMontreal.setActionCommand("mcg_cc_install_ncea.bat");
        jrbMontreal.setSelected(false);
         
        JRadioButton jrbPutou = new JRadioButton("Putou");
        jrbPutou.setActionCommand("mcg_cc_install_putou.bat");
        jrbPutou.setSelected(false);
         
        JRadioButton jrbSanDiego = new JRadioButton("SanDiego");
        jrbSanDiego.setActionCommand("mcg_cc_install_sandiego.bat");
        jrbSanDiego.setSelected(false);
           
        JRadioButton jrbSanJose = new JRadioButton("SanJose");
        jrbSanJose.setActionCommand("mcg_cc_install_sanjose.bat");
        jrbSanJose.setSelected(false);
        
        JRadioButton jrbSeoul = new JRadioButton("Seoul");
        jrbSeoul.setActionCommand("mcg_cc_install_seoul.bat");
        jrbSeoul.setSelected(false);
        
        JRadioButton jrbShenzhen = new JRadioButton("Shenzhen");
        jrbShenzhen.setActionCommand("mcg_cc_install_shenzhen.bat");     
        jrbShenzhen.setSelected(false);
        
        JRadioButton jrbSingapore = new JRadioButton("Singapore");
        jrbSingapore.setActionCommand("mcg_cc_install_singapore.bat");        
        jrbSingapore.setSelected(false);
        
        JRadioButton jrbTaipei = new JRadioButton("Taipei");
        jrbTaipei.setActionCommand("mcg_cc_install_taipei.bat");
        jrbTaipei.setSelected(false);
      
        JRadioButton jrbToranto = new JRadioButton("Toranto");
        jrbToranto.setActionCommand("mcg_cc_install_toranto.bat");
        jrbToranto.setSelected(false);
     
        // Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(jrbAndover);
        group.add(jrbAtlanta);
        group.add(jrbBangalore);
        group.add(jrbBeijing);
        group.add(jrbBristol);
        group.add(jrbIrvine);
        group.add(jrbLancaster);
        group.add(jrbMontreal);
        group.add(jrbPutou);
        group.add(jrbSanDiego);
        group.add(jrbSanJose);
        group.add(jrbSeoul);
        group.add(jrbShenzhen);
        group.add(jrbSingapore);
        group.add(jrbTaipei);
        group.add(jrbToranto);
                
        // Register an action listener for the radio buttons.
        myListener = new RadioListener();
        jrbAndover.addActionListener(myListener);
        jrbAtlanta.addActionListener(myListener);
        jrbBangalore.addActionListener(myListener);
        jrbBeijing.addActionListener(myListener);
        jrbBristol.addActionListener(myListener);
        jrbIrvine.addActionListener(myListener);
        jrbLancaster.addActionListener(myListener);
        jrbMontreal.addActionListener(myListener);
        jrbPutou.addActionListener(myListener);
        jrbSanDiego.addActionListener(myListener);
        jrbSanJose.addActionListener(myListener);
        jrbSeoul.addActionListener(myListener);
        jrbShenzhen.addActionListener(myListener);
        jrbSingapore.addActionListener(myListener);
        jrbTaipei.addActionListener(myListener);
        jrbToranto.addActionListener(myListener);
       
        // Set up the picture label
        jlbPicture = new JButton("Start Install");	
        jlbPicture.setEnabled(false);
       // jlbPicture.addActionListener(mylistener);
        
	//Set the Default Image

       // jlblabel = new JLabel("Select Region to Proceed Installation \n" + 
        //		"POST INSTALLATION SYSTEM WILL REBOOT AUTOMATICALLY" +
        	//	"PLEASE SAVE YOUR WORK");
        
      //  jlblabel = new JLabel("<html><u>Select Region to Proceed Installation</u> <br><sub><em>POST INSTALLATION SYSTEM WILL REBOOT AUTOMATICALLY</em></sub><br>" + "<font color=\"#FF0080\"><u>PLEASE SAVE YOUR WORK</u></font>");

        jlblabel = new JLabel("<html><B>Select Region to Proceed Installation</B> <br><sub><em>POST INSTALLATION SYSTEM WILL REBOOT AUTOMATICALLY</em></sub><br>" + "<font color=\"#FF0000\"><B>PLEASE SAVE YOUR WORK</B></font>");        
        // Put the radio buttons in a column in a panel
        JPanel jplRadio = new JPanel();
        jplRadio.setLayout(new GridLayout(0, 1));
       
        jplRadio.add(jrbAndover);
        jplRadio.add(jrbAtlanta);
        jplRadio.add(jrbBangalore);
        jplRadio.add(jrbBeijing);
        jplRadio.add(jrbBristol);
        jplRadio.add(jrbIrvine);
        jplRadio.add(jrbLancaster);
        jplRadio.add(jrbMontreal);
        jplRadio.add(jrbPutou);
        jplRadio.add(jrbSanDiego);
        jplRadio.add(jrbSanJose);
        jplRadio.add(jrbSeoul);
        jplRadio.add(jrbSingapore);
        jplRadio.add(jrbShenzhen);
        jplRadio.add(jrbTaipei);
        jplRadio.add(jrbToranto);
              

        setLayout(new BorderLayout());
        add(jplRadio, BorderLayout.WEST);
        add(jlbPicture, BorderLayout.AFTER_LAST_LINE);
        add (jlblabel, BorderLayout.NORTH);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
    

    /** Listens to the radio buttons. */
    class RadioListener implements ActionListener { 
    	
    	 public void actionPerformed(ActionEvent e) {
    	//ojtem.out.println(jrbSanJose.SELECTED_ICON_CHANGED_PROPERTY);
    	//f (jrbSanJose.isSelected()){
    		//tring a = "hi";
    	
    	AbstractButton aButton = (AbstractButton) e.getSource();
    	final String radioregion = aButton.getText();
     //    boolean selected = aButton.getModel().isSelected();
     //    final String radio = e.getActionCommand();
        // System.out.println(e.getActionCommand()+ " - selected? " + selected);
    		 
            jlbPicture.setEnabled(true);
      
       //   JDialog dialog = new JDialog();
            
         //System.out.println(a + "san");
            
          //  JOptionPane.showMessageDialog(, message)
        	
        	jlbPicture.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
		   				//Process p = Runtime.getRuntime().exec("c:\\a.bat", null, new File("."));;
						//jumbers.getText();
						Runtime.getRuntime().exec("cmd /c start c:\\temp\\http_agent.installer.win32.win32.x86_1.4.4000.20110525_1254\\Install.bat  "  + radioregion );
		   				System.exit(0);
		   				}
		   			catch (IOException e1) {
		   				e1.printStackTrace();
		   	            System.exit(-1);
		   			}
					
					
				}
			});
        	       	
          }
    	 
    	}


    public static void main(String s[]) {
         frame = new JFrame("CcAutoInstallation for BCG");
         frame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {System.exit(0);}
         });
 
         frame.getContentPane().add(new CcAutoInstallBCG(), BorderLayout.CENTER);
         frame.setResizable(false);
         frame.pack();
         frame.setVisible(true);
    }
}


