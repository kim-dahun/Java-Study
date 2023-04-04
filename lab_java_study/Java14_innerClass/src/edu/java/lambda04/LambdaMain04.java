package edu.java.lambda04;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LambdaMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaMain04 app = new LambdaMain04();
		
		List<Object> list = Arrays.asList(1,2,3,4,5,6,7);
		List<Object> odds = app.filter(list, new MyFilter() {
			
			@Override
			public boolean check(Object x) {
				
				return ((Integer) x) % 2 == 1;
			}
		});
		
		System.out.println(odds);
		
		List<Object> evens = app.filter(list, (x) -> ((Integer) x) % 2 == 0);
		
		System.out.println(evens);
		
		List<Object> squares =  app.mapper(list, new MyMapper() {
			
			@Override
			public Object transform(Object x) {
				// TODO Auto-generated method stub
				Integer n = (Integer) x;
				return n*n;
			}
		});
		System.out.println(squares);
		
		List<Object> sumten = app.mapper(list, (x) -> ((Integer)x + 10)); 
		
		System.out.println(sumten);
		
		
	}
	
	
	
	public List<Object> filter(List<Object> list, MyFilter func){
		
		List<Object> result = new ArrayList<>();
		for(Object x : list) {
			
			if(func.check(x)) {
				result.add(x);
			}
			
		}
		
		return result;
		
	}

	public List<Object> mapper(List<Object> list, MyMapper func){
		List<Object> result = new ArrayList<>();
		
		for(Object x : list) {
			
			
			
			result.add(func.transform(x));
			
		}
		return result;
	}
	
}
