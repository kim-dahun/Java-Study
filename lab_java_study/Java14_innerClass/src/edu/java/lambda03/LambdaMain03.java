package edu.java.lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee 를 원소로 갖는 리스트 선언, 초기화
		List<Employee> employees = Arrays.asList(new Employee(100, "이찬희", "개발1팀", "대리", 400.0),
				new Employee(101, "지대한", "개발2팀", "사원", 350.0), new Employee(200, "김다훈", "개발2팀", "과장", 380.0),
				new Employee(201, "유다한", "개발1팀", "부장", 500.0), new Employee(300, "강효남", "인사팀", "사원", 300.0),
				new Employee(301, "위태욱", "인사팀", "과장", 450.0));
		
		// 1. 모든 직원들의 정보를 한 줄에 한 명씩 출력.
		
		System.out.println();
		System.out.println("기본");
		System.out.println();
		for(Employee e : employees) {
			
			System.out.println(e.toString());
			
		}
		
		System.out.println();
		System.out.println("람다");
		System.out.println();
		
		employees.forEach(x -> System.out.println(x.toString()));
		
		// 2. 개발1,2팀에서 일하는 직원들의 급여 합계 출력.
		System.out.println();
		System.out.println("기본");
		System.out.println();
		
		double sum = 0;
		int count = 0;
		for(int i = 0 ; i < employees.size() ; i++) {
			
			if(employees.get(i).getDept().contains("개발")) {
				
				sum = sum+employees.get(i).getSalary();
				count++;
			}
			
		}
		
		System.out.println("개발팀의 급여 합계 : " + sum);
		
		
		System.out.println();
		System.out.println("람다");
		System.out.println();
		
		double sum1 = 0;
		int counts = 0;
		
		counts = (int) employees.stream().filter(x -> x.getDept().contains("개발")).count();
		System.out.println(counts);
		
		List<Double> sallist = new ArrayList<>();
		
				employees.forEach(x -> {if(x.getDept().contains("개발")) {
			
					sallist.add(x.getSalary());
					
			
		}});
				
				sum1 = sallist.stream().reduce(0.0, Double::sum);
				
				System.out.println("람다로 돌린 합계는 " + sum1);
		

		
		
		// 3. 개발1,2팀에서 일하는 직원들의 급여의 평균을 출력.
		System.out.println();
		System.out.println("기본");
		System.out.println();
		
		double average = sum/count;
		
		System.out.println("개발팀 직원 급여 평균 : " + average);
		
		System.out.println("람다로 돌린 평균 : " + (sum1/counts));
		
		
		// 4. 직급이 사원인 직원들의 급여의 합계 출력.
		
		System.out.println();
		System.out.println("기본");
		System.out.println();
		
		sum = 0;
		count = 0;
		for(Employee x : employees) {
			
			if(x.getEmpTitle().equals("사원")) {
				sum += x.getSalary();
				count++;
			}
			
		}
		
		
		
		System.out.println("사원들의 급여 합계 : " + sum);
		
		System.out.println();
		System.out.println("람다");
		System.out.println();
		
		List<Double> dbsal = new ArrayList<>();
		
		employees.forEach(x -> {if(x.getEmpTitle().equals("사원")) {
			
			dbsal.add(x.getSalary());
			
		}});
		
		sum1 = 0;
		sum1 = dbsal.stream().reduce(0.0, Double::sum);
		counts = (int) dbsal.stream().count();
		
		System.out.println("람다 값 합계 : " + sum1);
		
		// 5. 직급이 사원인 직원들의 급여의 평균 출력.

		System.out.println();
		System.out.println("기본");
		System.out.println();
		
		System.out.println("사원들의 급여 평균 : " + (sum/count));
		
		System.out.println("람다로 계산한 평균 : " + (employees.stream().filter(e -> e.getEmpTitle().equals("사원")).mapToDouble(e -> e.getSalary()).average().orElseThrow()));
		
		
		// 6. 급여가 400 이상인 직원들의 정보를 한 줄에 한 명씩 출력.
		
		System.out.println();
		System.out.println("기본");
		System.out.println();
		
		for(int i = 0 ; i < employees.size() ; i++) {
			if(employees.get(i).getSalary()>=400) {
				System.out.println(employees.get(i).toString());
			}
			
		}
		
		System.out.println();
		System.out.println("람다");
		System.out.println();
		
		
		employees.forEach(x -> {if(x.getSalary()>=400) {
			System.out.println(x.toString());
		}});
		
		// 7. 개발 1팀 직원들의 급여를 10% 인상하고 그 직원들의 급여 평균을 계산하고 출력.
			
		System.out.println();
		System.out.println("기본");
		System.out.println();
		double avg2 = 0;
		double sums = 0;
		count = 0;
//		for(Employee e : employees) {
//			
//			if(e.getDept().equals("개발1팀")) {
//				System.out.println("인상 전 : " + e.toString());
//				e.setSalary(e.getSalary()*1.1);
//				sums = sums+e.getSalary();
		
//				count++;
//				System.out.println("인상 후 : " + e.toString());
//			}
//		}
//		
//		System.out.println("인상 후 평균 : " + (sums/count));
		
		System.out.println();
		System.out.println("람다");
		System.out.println();
		
		double answer = employees.stream().filter(x -> x.getDept().equals("개발1팀")).mapToDouble(x -> x.getSalary()*1.1).average().orElseThrow();
		System.out.println("람다로 인상 후 평균 : " + answer);
		
		
		
		
		// 8. 직원 리스트에서 사원이 몇 명인지?
		count=0;
		
		for(Employee e : employees) {
			
			if(e.getEmpTitle().equals("사원")) {
				System.out.println(e.toString());
				count++;
			}
			
		}
		
		System.out.println("사원 수 : " + count + "명");
		
	}

}
