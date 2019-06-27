package com.eversoft.traverse.service;

import java.util.List;

import com.eversoft.traverse.model.Information;
import com.eversoft.traverse.model.Office;
public interface InformationService {
//	public boolean createUser(User user);
//	public User getUserById(int id);
//	public boolean deleteUser(int id);
//	public List<User> getAllUsers();
//	public boolean updateUser(int id, User user);
	
	public List<Information> getAllInformation(int id);
	public Office getOfficeInfo(int id);
	public List<Office> getAllOffice();
}
