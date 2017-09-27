/*     */ package fr.n005.gui;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JTabbedPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Plugins
/*     */   extends JDialog
/*     */ {
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/*  29 */       Plugins dialog = new Plugins();
/*  30 */       dialog.setDefaultCloseOperation(2);
/*  31 */       dialog.setVisible(true);
/*     */     } catch (Exception e) {
/*  33 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Plugins()
/*     */   {
/*  41 */     setTitle("Download Plugins");
/*  42 */     setResizable(false);
/*  43 */     setBounds(100, 100, 450, 300);
/*  44 */     getContentPane().setLayout(new BorderLayout());
/*     */     
/*  46 */     JPanel buttonPane = new JPanel();
/*  47 */     buttonPane.setLayout(new FlowLayout(2));
/*  48 */     getContentPane().add(buttonPane, "South");
/*     */     
/*  50 */     JButton okButton = new JButton("OK");
/*  51 */     okButton.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent arg0) {
/*  53 */         Plugins.this.setVisible(false);
/*     */       }
/*     */       
/*  56 */     });
/*  57 */     JLabel lblNewLabel = new JLabel("©N005");
/*  58 */     lblNewLabel.setHorizontalAlignment(2);
/*  59 */     buttonPane.add(lblNewLabel);
/*  60 */     okButton.setActionCommand("OK");
/*  61 */     buttonPane.add(okButton);
/*  62 */     getRootPane().setDefaultButton(okButton);
/*     */     
/*     */ 
/*  65 */     JButton cancelButton = new JButton("Cancel");
/*  66 */     cancelButton.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/*  68 */         Plugins.this.setVisible(false);
/*     */       }
/*  70 */     });
/*  71 */     cancelButton.setActionCommand("Cancel");
/*  72 */     buttonPane.add(cancelButton);
/*     */     
/*     */ 
/*     */ 
/*  76 */     JTabbedPane tabbedPane = new JTabbedPane(1);
/*  77 */     getContentPane().add(tabbedPane, "Center");
/*     */     
/*  79 */     JLayeredPane layeredPane = new JLayeredPane();
/*  80 */     layeredPane.setBackground(Color.WHITE);
/*  81 */     tabbedPane.addTab("Home", null, layeredPane, null);
/*     */     
/*  83 */     JPanel panel = new JPanel();
/*  84 */     panel.setBounds(10, 11, 419, 35);
/*  85 */     layeredPane.add(panel);
/*     */     
/*  87 */     JLabel lblPluginsByN = new JLabel("Plugins by N005:");
/*  88 */     lblPluginsByN.setFont(new Font("Tahoma", 0, 20));
/*  89 */     lblPluginsByN.setHorizontalAlignment(0);
/*  90 */     panel.add(lblPluginsByN);
/*     */     
/*  92 */     JPanel panel_1 = new JPanel();
/*  93 */     panel_1.setBounds(20, 57, 201, 143);
/*  94 */     layeredPane.add(panel_1);
/*     */     
/*  96 */     JLabel lblplugins = new JLabel("1/Plugins");
/*  97 */     lblplugins.setFont(new Font("Tahoma", 0, 12));
/*  98 */     panel_1.add(lblplugins);
/*     */     
/*     */ 
/* 101 */     JLayeredPane layeredPane = new JLayeredPane();
/* 102 */     tabbedPane.addTab("Plugin", null, layeredPane, null);
/*     */     
/* 104 */     JButton btnDownload = new JButton("Download");
/* 105 */     btnDownload.addActionListener(new ActionListener()
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         DownloadUtils.downloadUtils("http://download.n005.pagesperso-orange.fr/plugin.jar", "37627ddd5e6dab95d931dea3613652074a7b8b881573ec8f372b574ee4caf3ac", "\\plugin.jar");
/*     */       }
/* 159 */     });
/* 160 */     btnDownload.setBounds(159, 177, 111, 23);
/* 161 */     layeredPane.add(btnDownload);
/*     */     
/* 163 */     JPanel panel = new JPanel();
/* 164 */     panel.setBounds(10, 11, 419, 23);
/* 165 */     layeredPane.add(panel);
/*     */     
/* 167 */     JLabel lblsetprefixSet = new JLabel("/Setprefix : set a prefix of your name");
/* 168 */     lblsetprefixSet.setHorizontalAlignment(0);
/* 169 */     panel.add(lblsetprefixSet);
/*     */     
/* 171 */     JPanel panel_1 = new JPanel();
/* 172 */     panel_1.setBounds(10, 45, 419, 23);
/* 173 */     layeredPane.add(panel_1);
/*     */     
/* 175 */     JLabel lblbienvenueSay = new JLabel("/bienvenue : say welcome to a player");
/* 176 */     lblbienvenueSay.setHorizontalAlignment(0);
/* 177 */     panel_1.add(lblbienvenueSay);
/*     */     
/* 179 */     JPanel panel_2 = new JPanel();
/* 180 */     panel_2.setBounds(10, 79, 419, 23);
/* 181 */     layeredPane.add(panel_2);
/*     */     
/* 183 */     JLabel lblshopTp = new JLabel("/shop : tp to shop (to config see the config file)");
/* 184 */     lblshopTp.setHorizontalAlignment(0);
/* 185 */     panel_2.add(lblshopTp);
/*     */     
/* 187 */     JPanel panel_3 = new JPanel();
/* 188 */     panel_3.setBounds(10, 113, 419, 23);
/* 189 */     layeredPane.add(panel_3);
/*     */     
/* 191 */     JLabel lbltsd = new JLabel("/tsd : = /time set day");
/* 192 */     lbltsd.setHorizontalAlignment(0);
/* 193 */     panel_3.add(lbltsd);
/*     */     
/* 195 */     JPanel panel_4 = new JPanel();
/* 196 */     panel_4.setBounds(10, 143, 419, 23);
/* 197 */     layeredPane.add(panel_4);
/*     */     
/* 199 */     JLabel lbltestpluginTest = new JLabel("/testplugin : test all plugin");
/* 200 */     lbltestpluginTest.setHorizontalAlignment(0);
/* 201 */     panel_4.add(lbltestpluginTest);
/*     */   }
/*     */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\Plugins.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */