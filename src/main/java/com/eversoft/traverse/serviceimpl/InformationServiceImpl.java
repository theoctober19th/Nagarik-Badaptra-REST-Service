package com.eversoft.traverse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.InformationDao;
import com.eversoft.traverse.model.Information;
import com.eversoft.traverse.model.Office;
import com.eversoft.traverse.service.InformationService;

@Service
public class InformationServiceImpl implements InformationService{

	@Autowired
	InformationDao informationDao;
	
	public InformationServiceImpl() {

	}

	@Override
	public List<Information> getAllInformation(int id) {
		
		return informationDao.getAllInformation(id);
	}

	@Override
	public Office getOfficeInfo(int id) {
		return informationDao.getOfficeInfo(id);
	}

	@Override
	public List<Office> getAllOffice() {
		return informationDao.getAllOffice();
	}
	
//	@Override
//	public boolean createUser(User user) {
//		return userDao.createUser(user);
//	}
//
//	@Override
//	public User getUserById(int id) {
//		return userDao.getUserById(id);
//	}
//
//	@Override
//	public boolean deleteUser(int id) {
//		return userDao.deleteUser(id);
//	}
//
//	@Override
//	public List<User> getAllUsers() {
//		return userDao.getAllUsers();
//	}
//
//	@Override
//	public boolean updateUser(int id, User user) {
//		return userDao.updateUser(id, user);
//	}

}
