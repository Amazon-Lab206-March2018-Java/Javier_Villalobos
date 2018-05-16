package com.javier.countries;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ApiService {
	private final Repo repo;
	public ApiService(Repo repo) {
		this.repo=repo;
	}
	
	public void test() {
//		List<Object[]> table = repo.first();
//		for(Object[] row : table) {
//			System.out.println(row[0]);
//			System.out.println(row[1]);
//			System.out.println(row[2]);
//		    System.out.println("");
//		}
//		List<Object[]> table = repo.second();
//		for(Object[] row : table) {
//			System.out.println(row[0]);
//			System.out.println(row[1]);
//		    System.out.println("");
//		}
		
//		for(String x : repo.third()) {
//			 System.out.println(x);
//		}
		
//		List<Object[]> table = repo.fourth();
//		for(Object[] row : table) {
//			System.out.println(row[0]);
//			System.out.println(row[1]);
//		    System.out.println("");
//		}
		
//		for(String x : repo.fifth()) {
//		 System.out.println(x);
//		}
//		
//		for(String x : repo.sixth()) {
//			 System.out.println(x);
//		}
//		List<Object[]> table = repo.seventh();
//		for(Object[] row : table) {
//			System.out.println(row[0]);
//			System.out.println(row[1]);
//			System.out.println(row[3]);
//		    System.out.println("");
//		}
		
		List<Object[]> table = repo.eight();
		for(Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		    System.out.println("");
		}
		
	}
}
