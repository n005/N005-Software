/*    */ package fr.n005.gui;
/*    */ 
/*    */ import java.net.HttpURLConnection;
/*    */ 
/*    */ public class Url
/*    */ {
/*    */   public static boolean exists(String URLName) {
/*    */     try {
/*  9 */       HttpURLConnection.setFollowRedirects(false);
/*    */       
/*    */ 
/* 12 */       HttpURLConnection con = 
/* 13 */         (HttpURLConnection)new java.net.URL(URLName).openConnection();
/* 14 */       con.setRequestMethod("HEAD");
/* 15 */       return con.getResponseCode() == 200;
/*    */     }
/*    */     catch (Exception e) {
/* 18 */       e.printStackTrace(); }
/* 19 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\Url.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */