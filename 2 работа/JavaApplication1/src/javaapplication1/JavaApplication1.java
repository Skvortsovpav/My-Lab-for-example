/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author студент
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
try {
        Byte b1 = new Byte("10");
        System.out.println(b1);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

   String str1 = "111";
    try {
        Byte b2 = Byte.valueOf(str1);
        System.out.println(b2);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

   byte b = 0;
    String str2 = "100";
    try {
        b = Byte.parseByte(str2);
        System.out.println(b);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

 String str3 = "20150";
    byte[] b3 = str3.getBytes();
    System.out.println(b3);
    
    //массив байтов переводим обратно в строку 
   /* try {
	  String s = new String(b3, "cp1251");
	  System.out.println(s);
	} catch (UnsupportedEncodingException e) {
	  e.printStackTrace();
	}
*/
try { 
        Short s1 = new Short("68");
        System.out.println(s1);
    }catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    }   

    String strq = "59";
    try { 
        Short s2 = Short.valueOf(strq);
        System.out.println(s2);    
    }catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    }  

   short s3 = 0;  
    String strw = "100";  
    try {  
        s3 = Short.parseShort(strw);  
        System.out.println(s3);  
    } catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    }    

  try { 
        Integer i1 = new Integer("20349");
        System.out.println(i1);
    }catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    }   

    String stre = "1451";
    try {
        Integer i2 = Integer.valueOf(stre);
        System.out.println(i2);    
    }catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    }  

  int i3 = 0;
    String strr = "102944";
    try {
        i3 = Integer.parseInt(strr);
        System.out.println(i3);  
    } catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    }      

  try {
        Long l1 = new Long("11111111");
        System.out.println(l1);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

  String strt = "222222222";
    try {
        Long l2 = Long.valueOf(strt);
        System.out.println(l2);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

long l3 = 0;
    String stry = "333333333";
    try {
        l3 = Long.parseLong(stry);
        System.out.println(l3);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }      

  try {
        Float f1 = new Float("123.5");
        System.out.println(f1);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

   String stru = "3.1415";
    try {
        Float f2 = Float.valueOf(stru);
        System.out.println(f2);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

  float f3 = 0;
    String stri = "36.6";
    try {
        f3 = Float.parseFloat(stri);
        System.out.println(f3);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }     

 try {
        Double d1 = new Double("4.4e10");
        System.out.println(d1);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

String stro = "564.6e10";
    try {
        Double d2 = Double.valueOf(stro);
        System.out.println(d2);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }

  double d3 = 0;
    String strp = "13.7e10";
    try {
        d3 = Double.parseDouble(strp);
        System.out.println(d3);
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат строки!");
    }            

 String s1 = "True";
    String s2 = "yes";
    boolean bool1, bool2, boolean1, boolean2;

    //с использованием метода parseBoolean
    bool1 = Boolean.parseBoolean(s1);
    bool2 = Boolean.parseBoolean(s2);
    System.out.println( bool1 );
    System.out.println( bool2 );

    //c использованием метода valueOf
    boolean1 = Boolean.valueOf(s1);
    boolean2 = Boolean.valueOf(s2);
    System.out.println( boolean1 );
    System.out.println( boolean2 );

 int i = 35;
   String str = Integer.toString(i);
   System.out.println(str);   

  double  iab = 32.4e10;
   String str = Double.toString(iab);
   System.out.println(str);  

 long  isa1 = 3422222;
   String str = Long.toString(isa1);
   System.out.println(str);  

 float  i = 3.46f;
   String str = Float.toString(i);
   System.out.println(str)

  char ch = 'S';

    // c использованием класса Character
    String charToString = Character.toString(ch);
    System.out.println(charToString);

    // с использованием операции добавления класса String
    String str = "" + ch;
    System.out.println(str);

    //с использованием массива
    String fromChar = new String(new char[] { ch });
    System.out.println(fromChar);

    // с использованием метода valueOf класса String 
    String valueOfchar = String.valueOf(ch);
    System.out.println(valueOfchar);  

char ch = '9';

    // c использованием метода getNumericValue
    // класса Character
    int i1 = Character.getNumericValue(ch);
    System.out.println(i1); 

    // c использованием метода digit класса Character
    int i2 = Character.digit(ch,10); 
    System.out.println(i2); 

 int i = 2015;
    long l = (long) (i);
    System.out.println(l);

 int i = 2015;
    float f = (float) (i);
    System.out.println(f);

long l = 214748364;
    int i = (int) l;
    System.out.println(i);

double d = 3.14;
    int i = (int) d;
    System.out.println(i);
    }
}
