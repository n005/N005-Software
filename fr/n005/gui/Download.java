/*     */ package fr.n005.gui;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Desktop;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.Window.Type;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JTabbedPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Download
/*     */   extends JDialog
/*     */ {
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/*  33 */       Download dialog = new Download();
/*  34 */       dialog.setDefaultCloseOperation(2);
/*  35 */       dialog.setVisible(true);
/*     */     } catch (Exception e) {
/*  37 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Download()
/*     */   {
/*  45 */     setResizable(false);
/*  46 */     setType(Window.Type.POPUP);
/*  47 */     setTitle("Download Soft");
/*  48 */     setBounds(100, 100, 450, 300);
/*  49 */     getContentPane().setLayout(new BorderLayout());
/*     */     
/*  51 */     JPanel buttonPane = new JPanel();
/*  52 */     buttonPane.setLayout(new FlowLayout(2));
/*  53 */     getContentPane().add(buttonPane, "South");
/*     */     
/*  55 */     JButton okButton = new JButton("OK");
/*  56 */     okButton.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/*  58 */         Download.this.setVisible(false);
/*     */       }
/*     */       
/*  61 */     });
/*  62 */     JLabel label = new JLabel("©N005");
/*  63 */     label.setHorizontalAlignment(2);
/*  64 */     buttonPane.add(label);
/*     */     
/*  66 */     okButton.setActionCommand("OK");
/*  67 */     buttonPane.add(okButton);
/*  68 */     getRootPane().setDefaultButton(okButton);
/*     */     
/*     */ 
/*  71 */     JButton cancelButton = new JButton("Cancel");
/*  72 */     cancelButton.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/*  74 */         Download.this.setVisible(false);
/*     */       }
/*  76 */     });
/*  77 */     cancelButton.setActionCommand("Cancel");
/*  78 */     buttonPane.add(cancelButton);
/*     */     
/*     */ 
/*     */ 
/*  82 */     JTabbedPane tabbedPane = new JTabbedPane(1);
/*  83 */     getContentPane().add(tabbedPane, "Center");
/*     */     
/*  85 */     JLayeredPane layeredPane = new JLayeredPane();
/*  86 */     layeredPane.setBackground(Color.WHITE);
/*  87 */     tabbedPane.addTab("Home", null, layeredPane, null);
/*     */     
/*  89 */     JPanel panel = new JPanel();
/*  90 */     panel.setBounds(10, 11, 419, 35);
/*  91 */     layeredPane.add(panel);
/*     */     
/*  93 */     JLabel lblSoftwareByN = new JLabel("Software by N005:");
/*  94 */     lblSoftwareByN.setHorizontalAlignment(0);
/*  95 */     lblSoftwareByN.setFont(new Font("Tahoma", 0, 20));
/*  96 */     panel.add(lblSoftwareByN);
/*     */     
/*     */ 
/*     */ 
/* 100 */     JPanel panel = new JPanel();
/* 101 */     panel.setBounds(20, 57, 201, 143);
/* 102 */     layeredPane.add(panel);
/*     */     
/* 104 */     JLabel lblarchiveASite = new JLabel("1/Archive a site automatically");
/* 105 */     lblarchiveASite.setFont(new Font("Tahoma", 0, 12));
/* 106 */     panel.add(lblarchiveASite);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 111 */     JLayeredPane layeredPane = new JLayeredPane();
/* 112 */     tabbedPane.addTab("Archive-a-site-automatically", null, layeredPane, null);
/*     */     
/* 114 */     JButton button = new JButton("Download");
/* 115 */     button.addActionListener(new ActionListener()
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
/* 167 */         DownloadUtils.downloadUtils("http://download.n005.pagesperso-orange.fr/Archive.zip", "a63f9e0e52cc53c7bac59b4a98dde4e9d402b76721ccd6582713ed9445927618", "\\Archive.zip");
/*     */       }
/* 169 */     });
/* 170 */     button.setBounds(20, 177, 111, 23);
/* 171 */     layeredPane.add(button);
/*     */     
/*     */ 
/* 174 */     JPanel panel = new JPanel();
/* 175 */     panel.setBounds(10, 11, 419, 23);
/* 176 */     layeredPane.add(panel);
/*     */     
/* 178 */     JLabel lbldownloadMyScript = new JLabel("1.Download MY Script: see download.");
/* 179 */     lbldownloadMyScript.setHorizontalAlignment(0);
/* 180 */     panel.add(lbldownloadMyScript);
/*     */     
/*     */ 
/*     */ 
/* 184 */     JPanel panel = new JPanel();
/* 185 */     panel.setBounds(10, 45, 419, 23);
/* 186 */     layeredPane.add(panel);
/*     */     
/* 188 */     JLabel lblextractTheFile = new JLabel("2.extract the file, right click on \"archivage.bat\" edit.");
/* 189 */     lblextractTheFile.setHorizontalAlignment(0);
/* 190 */     panel.add(lblextractTheFile);
/*     */     
/*     */ 
/*     */ 
/* 194 */     JPanel panel = new JPanel();
/* 195 */     panel.setBounds(10, 79, 419, 23);
/* 196 */     layeredPane.add(panel);
/*     */     
/* 198 */     JLabel lblinTherd = new JLabel("3.In the 3rd line change the site \"epcminecraft.fr.gd\" by the site of your choice.");
/* 199 */     lblinTherd.setFont(new Font("Tahoma", 0, 11));
/* 200 */     lblinTherd.setHorizontalAlignment(0);
/* 201 */     panel.add(lblinTherd);
/*     */     
/*     */ 
/*     */ 
/* 205 */     JPanel panel = new JPanel();
/* 206 */     panel.setBounds(10, 113, 419, 23);
/* 207 */     layeredPane.add(panel);
/*     */     
/* 209 */     JLabel lblcloseNotepadAnd = new JLabel("4.Close notepad and run \"archivage.bat\" and wait ...");
/* 210 */     lblcloseNotepadAnd.setHorizontalAlignment(0);
/* 211 */     panel.add(lblcloseNotepadAnd);
/*     */     
/*     */ 
/*     */ 
/* 215 */     JPanel panel = new JPanel();
/* 216 */     panel.setBounds(10, 143, 419, 23);
/* 217 */     layeredPane.add(panel);
/*     */     
/* 219 */     JLabel lblthisIsFinishing = new JLabel("5.This is FINISHING!");
/* 220 */     lblthisIsFinishing.setHorizontalAlignment(0);
/* 221 */     panel.add(lblthisIsFinishing);
/*     */     
/*     */ 
/*     */ 
/* 225 */     JButton btnGithub = new JButton("Github");
/* 226 */     btnGithub.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/* 228 */         if (Desktop.isDesktopSupported()) {
/*     */           try
/*     */           {
/* 231 */             Desktop.getDesktop().browse(new URI("https://github.com/n005/Archive-a-site-automatically"));
/*     */           } catch (IOException|URISyntaxException e1) {
/* 233 */             JOptionPane.showMessageDialog(null, "Error: (IOException | URISyntaxException e1) e1.printStackTrace(); in Desktop.getDesktop().browse");
/* 234 */             e1.printStackTrace();
/*     */           }
/*     */         }
/*     */       }
/* 238 */     });
/* 239 */     btnGithub.setBounds(186, 177, 89, 23);
/* 240 */     layeredPane.add(btnGithub);
/*     */     
/* 242 */     JButton btnEpcminecraft = new JButton("Epcminecraft");
/* 243 */     btnEpcminecraft.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/* 245 */         if (Desktop.isDesktopSupported()) {
/*     */           try
/*     */           {
/* 248 */             Desktop.getDesktop().browse(new URI("http://epcminecraft.fr.gd/Archiver-un-site-automatiquement-.-.htm"));
/*     */           } catch (IOException|URISyntaxException e1) {
/* 250 */             JOptionPane.showMessageDialog(null, "Error: (IOException | URISyntaxException e1) e1.printStackTrace(); in Desktop.getDesktop().browse");
/* 251 */             e1.printStackTrace();
/*     */           }
/*     */         }
/*     */       }
/* 255 */     });
/* 256 */     btnEpcminecraft.setBounds(318, 177, 111, 23);
/* 257 */     layeredPane.add(btnEpcminecraft);
/*     */   }
/*     */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\Download.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */