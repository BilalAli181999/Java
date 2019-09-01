
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bilal Ali
 */
public class BtnHnd implements ActionListener{
    String mem=null; 
    GUI refg;
     double num, result;
     int op;
     String str,p1,p2;
     
     
     double fir,sec,res;
     public BtnHnd(GUI gg)
     {
         refg=gg;
         
         
     }
     public boolean isCharachter(JTextField jt)
     {
         if(jt.getText().contains("+") || jt.getText().contains("-") ||jt.getText().contains("*") ||jt.getText().contains("/") || jt.getText().contains("%"))
         {
             return true;
         }
        return false;
     }
   
    @Override
    
    public void actionPerformed(ActionEvent e) {
        
      refg.head.setText("Standard");
      
      
//      if(refg.screen.getText().isEmpty())
//      {
//          System.out.println("empty screen");
//           refg.bEqu.setEnabled(false);    
//            refg.bAdd.setEnabled(false);
//            refg.bMul.setEnabled(false);
//            refg.bSub.setEnabled(false);
//            refg.bDiv.setEnabled(false);  
//            refg.bSqr.setEnabled(false);
//            refg.bMod.setEnabled(false);
//            refg.bFr.setEnabled(false);
//            refg.bNeg.setEnabled(false);
//            refg.bm3.setEnabled(false);
//            refg.bm4.setEnabled(false);
//            refg.bm5.setEnabled(false);
//      }
        
     
        if(refg.screen.getText().isEmpty() && e.getActionCommand()==".")
        {
           refg.screen.setText("0"); 
        }
        if (e.getActionCommand()=="MR") {
            if(mem!=null)
            {
                if(refg.screen.getText().contains("+") || refg.screen.getText().contains("-") ||refg.screen.getText().contains("*") ||refg.screen.getText().contains("/") || refg.screen.getText().contains("%"))
                { refg.screen.setText(refg.screen.getText()+(mem));}
                else
                {
                    refg.screen.setText(mem);
                }
            }
        }
         else if (e.getActionCommand()=="MS") 
                {
                    if(!(refg.screen.getText().contains("+") || refg.screen.getText().contains("-") ||refg.screen.getText().contains("*") ||refg.screen.getText().contains("/") || refg.screen.getText().contains("%")))
                    {
                      
                     mem=refg.screen.getText();
                    if(mem!=null)
                    {refg.bm2.setEnabled(true);
                    refg.bm1.setEnabled(true);
                    
                    }
                    }
                }   
         else if (e.getActionCommand()=="MC") {
             {
                 mem=null; 
                 refg.bm1.setEnabled(false);
                 refg.bm2.setEnabled(false);
             }
         }   
        else if (e.getActionCommand()=="M+") {
             {
                 if(mem!=null)
                 { 
                     double t=Double.parseDouble(mem);
                     double result=Double.parseDouble(refg.screen.getText());
                     result=result+t;
                     mem=Double.toString(result);
                  
                 }
             }
         }   
        else if (e.getActionCommand()=="M-") {
             {
                 
                 if(mem!=null)
                 { 
                     double t=Double.parseDouble(mem);
                     double result=Double.parseDouble(refg.screen.getText());
                     result=t-result;
                     mem=Double.toString(result);
                  
                 }
                
             }
         }   
        if(e.getSource()==refg.bPoint && !(refg.screen.getText().contains(".") ))
        {
             refg.bEqu.setEnabled(true);
             refg.bAdd.setEnabled(true);
             refg.bMul.setEnabled(true);
             refg.bSub.setEnabled(true);
             refg.bDiv.setEnabled(true);  
             refg.bSqr.setEnabled(true);
             refg.bMod.setEnabled(true);
             refg.bNeg.setEnabled(true);
             refg.bFr.setEnabled(true);
             refg.bm3.setEnabled(true);
             refg.bm4.setEnabled(true);
             refg.bm5.setEnabled(true);
            refg.screen.setText(refg.screen.getText()+(e.getActionCommand()));
        }
       if (!(refg.screen.getText().length() == 1 && "0".equals(refg.screen.getText()))) {
              if(e.getActionCommand()=="0" &&refg.screen.getText().length() <=10)  
              {
                  
                  refg.bEqu.setEnabled(true);
             refg.bAdd.setEnabled(true);
             refg.bMul.setEnabled(true);
             refg.bSub.setEnabled(true);
             refg.bDiv.setEnabled(true);  
             refg.bSqr.setEnabled(true);
             refg.bMod.setEnabled(true);
             refg.bNeg.setEnabled(true);
             refg.bFr.setEnabled(true);
             refg.bm3.setEnabled(true);
             refg.bm4.setEnabled(true);
             refg.bm5.setEnabled(true);
                  refg.screen.setText(refg.screen.getText() + "0");
             
          
       }}
        if( (refg.screen.getText().length() <=10)&& (e.getSource()==refg.b0||e.getSource()==refg.b1 ||e.getSource()==refg.b2 ||e.getSource()==refg.b3 ||e.getSource()==refg.b4 ||e.getSource()==refg.b5 ||e.getSource()==refg.b6 ||e.getSource()==refg.b7 ||e.getSource()==refg.b8|| e.getSource()==refg.b9))
        {	
        
         {   refg.bEqu.setEnabled(true);
             refg.bAdd.setEnabled(true);
             refg.bMul.setEnabled(true);
             refg.bSub.setEnabled(true);
             refg.bDiv.setEnabled(true);  
             refg.bSqr.setEnabled(true);
             refg.bMod.setEnabled(true);
             refg.bNeg.setEnabled(true);
             refg.bFr.setEnabled(true);
             refg.bm3.setEnabled(true);
             refg.bm4.setEnabled(true);
             refg.bm5.setEnabled(true);
          if(e.getSource()!=refg.b0)
          { refg.screen.setText(refg.screen.getText()+(e.getActionCommand()));} //used source due to double.parse error
         }
        }	
        else if(e.getActionCommand().equals("="))
        {
            System.out.println("=");
          if(!(refg.screen.getText().isEmpty()))
          {  switch(op)
            {
                
                case 1:
                {
                   sec=Double.parseDouble(refg.screen.getText());
                res=fir+sec;
                refg.screen.setText(Double.toString(res));
                res=0;
                fir=0;
                sec=0;
                refg.scr.setText("");
                   
                    break;
                }
                case 2:
                {
                    sec=Double.parseDouble(refg.screen.getText());
                res=fir-sec;
                refg.screen.setText(Double.toString(res));
                res=0;
                fir=0;
                sec=0;
                refg.scr.setText("");
                   
                    break;
                }
                case 3:
                {
                    sec=Double.parseDouble(refg.screen.getText());
                res=fir*sec;
                refg.screen.setText(Double.toString(res));
                res=0;
                fir=0;
                sec=0;
                refg.scr.setText("");                  
                    break;
                }
                case 4:
                {
                   sec=Double.parseDouble(refg.screen.getText());
               
                   res=fir/sec;
                   if(sec!=0)
                   {
                      
                       refg.screen.setText(Double.toString(res));
                   }
                   else
                   {
                       
                     refg.head.setText("Divided by Zero"); 
                     refg.screen.setText("");
                   }
                   res=0;
                fir=0;
                sec=0;
                refg.scr.setText("");
                   
                    break;
                }
                case 5:
                {

                sec=Double.parseDouble(refg.screen.getText());
                res=fir%sec;
                if(sec!=0)
                   {
                      
                       refg.screen.setText(Double.toString(res));
                   }
                   else
                   {
                       refg.head.setText("Divided by Zero"); 
                     refg.screen.setText(""); 
                   }
              res=0;
                fir=0;
                sec=0;
                    refg.scr.setText("");

                break;
                }
            
          }
          }
        }
        else if(e.getActionCommand().equals("<<"))
        {
            if(refg.screen.getText().contains("."))
            {  str=refg.screen.getText();
                   String[] p=str.split("\\.");
                  
            if(p[1].length()==1)
            {
               
                StringBuilder back=new StringBuilder(refg.screen.getText());  //Java StringBuilder class is used to create mutable (modifiable) string. 
                back.deleteCharAt((refg.screen.getText().length())-1);
                back.deleteCharAt((refg.screen.getText().length())-2);
                refg.screen.setText(back.toString());
            }
            else if((refg.screen.getText().length())>0)
            {
              
                StringBuilder back=new StringBuilder(refg.screen.getText());  //Java StringBuilder class is used to create mutable (modifiable) string. 
                back.deleteCharAt((refg.screen.getText().length())-1);
                refg.screen.setText(back.toString());
            }

            }
            else if((refg.screen.getText().length())>0)
            {
               
                StringBuilder back=new StringBuilder(refg.screen.getText());  //Java StringBuilder class is used to create mutable (modifiable) string. 
                back.deleteCharAt((refg.screen.getText().length())-1);
                refg.screen.setText(back.toString());
                
            }
            if((refg.screen.getText().length())==1 &&refg.screen.getText().charAt(0)=='-')
            {
               
                
                refg.screen.setText("");
            }
            if((refg.screen.getText().isEmpty()))
            {
              
            refg.bEqu.setEnabled(false);    
            refg.bAdd.setEnabled(false);
            refg.bMul.setEnabled(false);
            refg.bSub.setEnabled(false);
            refg.bDiv.setEnabled(false);  
            refg.bSqr.setEnabled(false);
            refg.bMod.setEnabled(false);
            refg.bFr.setEnabled(false);
            refg.bNeg.setEnabled(false);
            refg.bm3.setEnabled(false);
            refg.bm4.setEnabled(false);
            refg.bm5.setEnabled(false);}
        }
        else if(e.getActionCommand().equals("C"))
        {
            
            refg.screen.setText("");
            refg.scr.setText("");
             refg.bEqu.setEnabled(false);    
            refg.bAdd.setEnabled(false);
            refg.bMul.setEnabled(false);
            refg.bSub.setEnabled(false);
            refg.bDiv.setEnabled(false);  
            refg.bSqr.setEnabled(false);
            refg.bMod.setEnabled(false);
            refg.bFr.setEnabled(false);
            refg.bNeg.setEnabled(false);
            refg.bm3.setEnabled(false);
            refg.bm4.setEnabled(false);
            refg.bm5.setEnabled(false);
            
        }
        else if(e.getActionCommand().equals("CE"))
        {
           if(refg.screen.getText().contains("+"))
                   { str=refg.screen.getText();
                   String[] p=str.split("\\+");
                   p1=p[0];
                   p2=p[1];
                  
                   refg.screen.setText(p1+"+");
                   
                   
                   }
           else if(refg.screen.getText().contains("/"))
                   { str=refg.screen.getText();
                   String[] p=str.split("\\/");
                   p1=p[0];
                   p2=p[1];
                  
                   refg.screen.setText(p1+"/");
                   
                   
                   }
           else if(refg.screen.getText().contains("-"))
                   { str=refg.screen.getText();
                   String[] p=str.split("\\-");
                   p1=p[0];
                   p2=p[1];
                  
                   refg.screen.setText(p1+"-");
                   
                   
                   }
           else if(refg.screen.getText().contains("*"))
                   { str=refg.screen.getText();
                   String[] p=str.split("\\*");
                   p1=p[0];
                   p2=p[1];
                  
                   refg.screen.setText(p1+"*");
                   
                   
                   
                  }
          
           else if(refg.screen.getText().contains("%"))
                   { str=refg.screen.getText();
                   String[] p=str.split("\\%");
                   p1=p[0];
                   p2=p[1];
                  
                   refg.screen.setText(p1+"%");
                   
                   
                   }
       
                     
               refg.screen.setText("");
            refg.bEqu.setEnabled(false);   
            refg.bAdd.setEnabled(false);
            refg.bMul.setEnabled(false);
            refg.bSub.setEnabled(false);
            refg.bDiv.setEnabled(false);  
            refg.bSqr.setEnabled(false);
            refg.bMod.setEnabled(false);
            refg.bFr.setEnabled(false);
            refg.bNeg.setEnabled(false);
            refg.bm3.setEnabled(false);
            refg.bm4.setEnabled(false);
            refg.bm5.setEnabled(false);
          
        }
        else
        {
            
            int dotStatus=0;
            if(!(refg.screen.getText().contains(".")))
            { 
               
            refg.bEqu.setEnabled(false);   
            refg.bAdd.setEnabled(false);
            refg.bMul.setEnabled(false);
            refg.bSub.setEnabled(false);
            refg.bDiv.setEnabled(false);
            refg.bMod.setEnabled(false);}
            if(refg.screen.getText().charAt(refg.screen.getText().length()-1)=='.')
            {  
             dotStatus=1;  
            }
            else
            {
                 fir=Double.parseDouble(refg.screen.getText());
            }
             
             {switch(e.getActionCommand())
            {
                
                case "+":
                { 
                   if(dotStatus==1)
                        refg.scr.setText(refg.screen.getText() + "0+");
                   else
                        refg.scr.setText(refg.screen.getText() + "+");
                  refg.screen.setText("");
                 op=1;
                 break;
                }
                case "-":
                {
                 if(dotStatus==1)
                        refg.scr.setText(refg.screen.getText() + "0-");
                   else
                        refg.scr.setText(refg.screen.getText() + "-");
                  refg.screen.setText("");
                 op=2;
                 break;
                }
                 case "*":
                {
                    
                 
                 
                 if(dotStatus==1)
                        refg.scr.setText(refg.screen.getText() + "0*");
                   else
                        refg.scr.setText(refg.screen.getText() + "*");
                  refg.screen.setText("");
                 op=3;
                 break;
                }
                 case "/":
                 {
                
                 if(dotStatus==1)
                        refg.scr.setText(refg.screen.getText() + "0/");
                   else
                        refg.scr.setText(refg.screen.getText() + "/");
                  refg.screen.setText("");
                  op=4;
                  break;
                 }
                 case "Neg":
                 {   
                     
                      {  double t=Double.parseDouble(refg.screen.getText());
                      if(dotStatus==1)
                         refg.scr.setText("Negate("+refg.screen.getText()+"0)");
                      else
                         refg.scr.setText("Negate("+refg.screen.getText()+")");
                     if(t!=0)
                     {
                         result=t*-1.0;
                     refg.screen.setText(Double.toString(result));}}
                      result=0;
                      refg.bEqu.setEnabled(true);
             refg.bAdd.setEnabled(true);
             refg.bMul.setEnabled(true);
             refg.bSub.setEnabled(true);
             refg.bDiv.setEnabled(true);  
             refg.bSqr.setEnabled(true);
             refg.bMod.setEnabled(true);
             refg.bNeg.setEnabled(true);
             refg.bFr.setEnabled(true);
             refg.bm3.setEnabled(true);
             refg.bm4.setEnabled(true);
             refg.bm5.setEnabled(true);
                     break;
                 }
                 case "Sqrt":
                 {
                      if(!(refg.screen.getText().isEmpty()))
                      { double t=Double.parseDouble(refg.screen.getText());
                      if(dotStatus==1)
                         refg.scr.setText("Sqrt("+refg.screen.getText()+"0)");
                      else
                         refg.scr.setText("Sqrt("+refg.screen.getText()+")");
                     
                     result=Math.sqrt(t);
                     refg.screen.setText(Double.toString(result));
                     result=0;
                     refg.bEqu.setEnabled(true);
             refg.bAdd.setEnabled(true);
             refg.bMul.setEnabled(true);
             refg.bSub.setEnabled(true);
             refg.bDiv.setEnabled(true);  
             refg.bSqr.setEnabled(true);
             refg.bMod.setEnabled(true);
             refg.bNeg.setEnabled(true);
             refg.bFr.setEnabled(true);
             refg.bm3.setEnabled(true);
             refg.bm4.setEnabled(true);
             refg.bm5.setEnabled(true);
                    }
                       break;
                 }
                 case "%":
                 {
                   
                
                 if(dotStatus==1)
                        refg.scr.setText(refg.screen.getText() + "0%");
                   else
                        refg.scr.setText(refg.screen.getText() + "%");
                  refg.screen.setText("");
                  op=5;
                  
                 
                  break;
                 }
                 case "1/x":
                 {   
                     
                   
                  if(!(refg.screen.getText().isEmpty()) )
                  {
                      
                     double t=Double.parseDouble(refg.screen.getText());
                     if(t!=0)
                     {  if(dotStatus==1)
                         refg.scr.setText("1/"+refg.screen.getText()+"0");
                      else
                         refg.scr.setText("1/"+refg.screen.getText());

                     
                     result=1/t;
                     
                     refg.screen.setText(Double.toString(result));
                     refg.bEqu.setEnabled(true);
             refg.bAdd.setEnabled(true);
             refg.bMul.setEnabled(true);
             refg.bSub.setEnabled(true);
             refg.bDiv.setEnabled(true);  
             refg.bSqr.setEnabled(true);
             refg.bMod.setEnabled(true);
             refg.bNeg.setEnabled(true);
             refg.bFr.setEnabled(true);
             refg.bm3.setEnabled(true);
             refg.bm4.setEnabled(true);
             refg.bm5.setEnabled(true);
                     result=0;
                     }
                     
                  }
                  
                  
                  break;
                    
                 }
            }}
        }
        
         
    }
    
}
