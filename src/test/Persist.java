package test;

import javax.xml.bind.annotation.XmlTransient;
import java.beans.Transient;
import java.io.*;

import java.io.Serializable;
 class Student implements Serializable{
    int id;
    @XmlTransient
    static String  name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Persist{
//    public static void main(String args[]){
//        try{
//            //Creating the object
//            Student s1 =new Student(211,"ravi");
//            //Creating stream and writing the object
//            FileOutputStream fout=new FileOutputStream("f.txt");
//            ObjectOutputStream out=new ObjectOutputStream(fout);
//            out.writeObject(s1);
//            out.flush();
//            //closing the stream
//            out.close();
//            System.out.println("success");
//        }catch(Exception e){System.out.println(e);}
//    }
}

class Depersist{
    public static void main(String args[]){
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}