package com.neurosoft.sharif.hw3;

public class stringTest {
    public stringTest() {
    }

    public void a(){  //charAt
        String n1 = "mohammed";
        char result = n1.charAt(2);
        System.out.println(result);

    }
    public static void b(){  //codePointAt
       String n2="mohammad";
       int result = n2.codePointAt(2);
        System.out.println(result);
    }
    public static void c(){  //codePointBefore
       String n3="mohammad";
     int result=n3.codePointBefore(1);
        System.out.println(result);
    }
    public static void d(){  //codePointCount
        String n4="mohammad";
        int result=n4.codePointCount(2, 7);
        System.out.println(result);
    }
    public static void e(){  //compareTo
        String n5="mohammad";
        String n6="Mohammad";
        System.out.println(n5.compareTo(n6));
    }
    public static void f(){  //compareToIgnoreCase
        String n7="mohammed";
        String n8="Mohammed";
        System.out.println(n7.compareToIgnoreCase(n8));
    }
    public static void g(){  //concat
        String n9="mohammad ";
        String n10=" islam";
        System.out.println(n9.concat(n10));
    }
    public static void h(){  //contains
        String n11="mohammad";
        System.out.println(n11.contains("mo"));
        System.out.println(n11.contains("ha"));
        System.out.println(n11.contains("md"));
        System.out.println(n11.contains("my"));
    }
    public static void i(){  //contentEquals
        String n12="mohammad";
        System.out.println(n12.contentEquals("mo"));
        System.out.println(n12.contentEquals("mohammad"));
    }
    public static void j(){  //copyValueOf
        char[] n13={'s', 'h', 'a', 'r', 'i', 'f'};
        String n14="";
        n14=n14.copyValueOf(n13, 0,6 );
        System.out.println("Returned String: " + n14);
    }
    public static void k(){  //endsWith
        String n15="mohammad";
        System.out.println(n15.endsWith("ha"));
        System.out.println(n15.endsWith("ad"));
        System.out.println(n15.endsWith("d"));
    }
    public static void l(){  //equalsIgnoreCase
      String n16="sharif";
      String n17="Sharif";
      String n18="shariar";
        System.out.println(n16.equalsIgnoreCase(n17));
        System.out.println(n17.equalsIgnoreCase(n18));
    }
    public static void m(){  //format
      String n19="sharif";
      String sf1=String.format("name is %s", n19);
      String sf2=String.format("value is %f", 33.3536);
      String sf3=String.format("value is %36.15f", 33.3536);
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
    public static void n(){  //getBytes
        String n20="sharif";
        byte[]barr=n20.getBytes();
        for(int i=0; i< barr.length; i++){
            System.out.println(barr[i]);
        }
    }
    public static void o(){  //getChars
        String n21=new String("hello how are you");
        char[] ch=new char[11];
        try {
            n21.getChars(6,17,ch,0);
            System.out.println(ch);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void p(){  //hashCode
        String n22="sharif";
        System.out.println(n22.hashCode());
    }
    public static void q(){  //indexOf
        String n23="hello planet earth, you are a great planet.";
        System.out.println(n23.indexOf("planet"));
    }
    public static void r(){  //isEmpty
        String n24="sharif";
        String n25="";
        System.out.println(n24.isEmpty());
        System.out.println(n25.isEmpty());
    }
    public static void s(){  //lastIndexOf
        String n26="hello planet earth, you are a great planet.";
        System.out.println(n26.lastIndexOf("planet"));
    }
    public static void t(){  //length
        String txt="abcdefghijklmnopqrstuvwxyz";
        System.out.println(txt.length());
    }
    public static void u(){  //replace
        String n27="islam";
        System.out.println(n27.replace('i', 'a'));
    }
    public static void v(){  //replaceFirst
        String n28="welcome to neurosoft.com";
        System.out.println("Return value:");
        System.out.println(n28.replaceFirst("(.*)neuro(.*)","new"));
        System.out.println("Return value:");
        System.out.println(n28.replaceFirst("neuro", "new"));
    }
    public static void w(){  //replaceAll
        String n29="naurosoft is a very good IT training cantar";
        String replaceString=n29.replaceAll("a", "e");
        System.out.println(replaceString);
    }
    public static void x(){  //split
        String n30="my name is sharif";
        String[]words=n30.split("\\s");
        for (String w:words){
            System.out.println(w);
        }
    }
    public static void y(){  //startsWith
        String n31="sharif";
        System.out.println(n31.startsWith("sh"));
        System.out.println(n31.startsWith("if"));
    }
    public static void z(){  //toUpperCase & toLowerCase
        String n32="Mohammad";
        System.out.println(n32.toUpperCase());
        System.out.println(n32.toLowerCase());
    }
    public static   void a1() {  //trim
        String n33="       Hello World!       ";
        System.out.println(n33);
        System.out.println(n33.trim());
    }

    public static void main(String[] args) {
        stringTest st= new stringTest();
        st.a();

        stringTest.b();
        stringTest.c();
        stringTest.d();
        stringTest.e();
        stringTest.f();
        stringTest.g();
        stringTest.h();
        stringTest.i();
        stringTest.j();
        stringTest.k();
        stringTest.l();
        stringTest.m();
        stringTest.n();
        stringTest.o();
        stringTest.p();
        stringTest.q();
        stringTest.r();
        stringTest.s();
        stringTest.t();
        stringTest.u();
        stringTest.v();
        stringTest.w();
        stringTest.x();
        stringTest.y();
        stringTest.z();
        stringTest.a1();
        }
    }
