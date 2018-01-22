package dao;

import entity.Admin;

public interface IAdminDao {
	
	Admin findAdmin(String adminName, String pwd);
	
	void saveAdmin(Admin admin);
}
