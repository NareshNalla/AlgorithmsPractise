package com.javaapi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {
	
		public static void main (String[] args)
	    {
	        ArrayList<Student> ar = new ArrayList<Student>();
	        ar.add(new Student(1,"alond"));
	        ar.add(new Student(131, "alaond"));
	        ar.add(new Student(121,  "jaipur"));
	        
	        Collections.sort(ar, new Sortbyname());
	        
	       
	        
	        for(Student s:ar){
	        	System.out.println(s.name);
	        }
	      
    }
}
		class Sortbyname implements Comparator<Student>
		{
		    // Used for sorting in ascending order of
		    // roll name
		    public int compare(Student a, Student b)
		    {
		        return b.name.compareTo(a.name);
		        //b.name.compareTo(a.name);
		    }
		}

