package Jdbc_crud.Jdbc_crud;

import java.io.File;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;


public class UnMarshing {

    public static void main(String[] args) throws JAXBException {
        // TODO Auto-generated method stub

        File file = new File("C:\\Jdbc_crud\\src\\main\\java\\Jdbc_crud\\Jdbc_crud\\student.xml");
        JAXBContext context = JAXBContext.newInstance(UnMarshalStudents.class);
        Unmarshaller unmarsh = context.createUnmarshaller();
        UnMarshalStudents students=(UnMarshalStudents) unmarsh.unmarshal(file);
        ArrayList<Student> array=students.getList();
        for(Student student: array) {
        	System.out.println(student.toString());
        }

    }

}