package ders3odev.service;

import ders3odev.model.User;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " Eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " Güncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " Silindi");
	}

}
