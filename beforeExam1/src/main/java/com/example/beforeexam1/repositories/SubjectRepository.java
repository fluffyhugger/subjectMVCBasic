package com.example.beforeexam1.repositories;

import com.example.beforeexam1.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private  static  List<Subject> subjects;
    public List<Subject> findAll(){
        return subjects;
    }
    public  SubjectRepository(){
        initialize();
    }
    private void initialize(){
        subjects = new ArrayList<>(20);
        subjects.add(new Subject("INT100","IT FUND",3));
        subjects.add(new Subject("INT101","Java Prog",3));
        subjects.add(new Subject("INT103","Web Tech",1));
        subjects.add(new Subject("INT203","Data Structure",1));
    }
}
