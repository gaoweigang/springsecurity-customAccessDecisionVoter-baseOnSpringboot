package com.gwg.user.web.service.impl;

import com.gwg.user.web.dao.UserRoleDao;
import com.gwg.user.web.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * @author
 *
 */
@Component
public class UserRoleServiceImpl implements UserRoleService {


	@Autowired
	private UserRoleDao userRoleDao;

	/**
	 * 判断用户是不是坐席人员
	 * @param userId
	 * @return
	 */
	public boolean isSaleStuff(String userId) {

		return true;
	}

	/**
	 *根据userid获取用户角色
	 */
	public List<String> queryRoleListByStaffCode(String staffCode){
		return userRoleDao.queryRoleListByStaffCode(staffCode);
	}
}
