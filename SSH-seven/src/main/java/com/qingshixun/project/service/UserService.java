/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingshixun.project.dao.UserDao;
import com.qingshixun.project.model.ChartData;
import com.qingshixun.project.model.Page;
import com.qingshixun.project.model.UserModel;

/**
 * 用户业务服务类
 */
@Service
public class UserService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    // 注入用户处理Dao
    @Autowired
    private UserDao userDao;

    /**
     * 获取所有用户信息
     * 
     * @return
     */
    public Page<UserModel> getUsers(int pageNo, int pageSize, String userName) {
        return userDao.findUserPage(pageNo, pageSize, userName);
    }

    /**
     * 根据用户ID，获取用户信息
     * 
     * @param userId
     * @return
     */
    public UserModel getUser(Long userId) {
        return userDao.getUser(userId);
    }

    /**
     * 保存用户
     * 
     * @param user
     */
    @Transactional
    public void saveUser(UserModel user) {
        userDao.saveUser(user);
    }

    /**
     * 删除用户
     * 
     * @param userId
     */
    @Transactional
    public void deleteUser(Long userId) {
        userDao.deleteUser(userId);
    }

    /**
     * 获取用户性别统计数据
     * @return
     */
    public ChartData getUserGenderData() {
        //获取根据性别分组统计数据
        List genderNumberList = userDao.getUserGenderNumbers();
        int genderNumberCount = genderNumberList.size();
        String[] names = new String[genderNumberCount];
        String[] values = new String[genderNumberCount];
        //遍历统计数据，转换成 Chart.js 所需要的数据格式
        for (int i = 0, n = genderNumberCount; i < n; i++) {
            Object[] genderNumbers = (Object[]) genderNumberList.get(i);
            //性别标签名称，如：male、female
            names[i] = "\"" + String.valueOf(genderNumbers[1]) + "\"";
            //性别对应的用户数据
            values[i] = String.valueOf(genderNumbers[0]);
        }
        ChartData userGenderData = new ChartData();
        userGenderData.setNames("[" + String.join(",", names) + "]");
        userGenderData.setValues("[" + String.join(",", values) + "]");

        logger.debug("User gender data:" + userGenderData);
        return userGenderData;
    }

    /**
     * 获取用户创建日期统计数据
     * @return
     */
    public ChartData getUserCreateData() {
        //获取根据创建日期分组统计数据
        List createDateNumberList = userDao.getUserCreateDateNumbers();
        int createDateNumberCount = createDateNumberList.size();
        String[] names = new String[createDateNumberCount];
        String[] values = new String[createDateNumberCount];

        //遍历统计数据，转换成 Chart.js 所需要的数据格式
        for (int i = 0, n = createDateNumberCount; i < n; i++) {
            Object[] createDateNumbers = (Object[]) createDateNumberList.get(i);
            //日期标签，如：2017-03-21
            names[i] = "\"" + String.valueOf(createDateNumbers[1]) + "\"";
            //日期对应的创建用户数量
            values[i] = String.valueOf(createDateNumbers[0]);
        }
        ChartData userCreateDateData = new ChartData();
        userCreateDateData.setNames("[" + String.join(",", names) + "]");
        userCreateDateData.setValues("[" + String.join(",", values) + "]");

        logger.debug("User create data:" + userCreateDateData);
        return userCreateDateData;
    }
}
