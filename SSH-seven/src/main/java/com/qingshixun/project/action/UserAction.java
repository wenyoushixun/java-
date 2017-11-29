/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.project.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.qingshixun.project.model.ChartData;
import com.qingshixun.project.model.Page;
import com.qingshixun.project.model.UserModel;
import com.qingshixun.project.service.UserService;

/**
 * 用户处理 action 类
 */
@Namespace(value = "/user")
@InterceptorRefs({ @InterceptorRef("defaultStack") })
public class UserAction extends ActionSupport {

    private static final long serialVersionUID = 2784552215665429457L;

    protected Logger logger = LoggerFactory.getLogger(getClass());

    //默认每页显示记录数
    private static final int DEFAULT_PAGE_SIZE = 10;

    // 注入用户处理 Service
    @Autowired
    private UserService userService;

    //用户ID（编辑和删除时使用）
    private Long userId;

    // 用户的Model用于接收form表单传递过来的参数
    private UserModel userModel = new UserModel();

    //用户分页数据
    private Page<UserModel> userPage;

    //用户性别统计数据
    private ChartData userGenderData;

    //用户创建日期统计数据
    private ChartData userCreateData;

    //页号
    private int pageNo = 1;

    /**
     * 获取用户列表
     * 
     * @return
     */
    @Action(value = "list", results = { @Result(name = SUCCESS, location = "/WEB-INF/views/user/list.jsp") })
    public String listUser() {
        logger.debug("list user...");
        // 根据“用户名称”查询用户，返回分页数据
        userPage = userService.getUsers(pageNo, DEFAULT_PAGE_SIZE, userModel.getName());
        return SUCCESS;
    }

    /**
     * 新增用户
     * 
     * @return
     */
    @Action(value = "add", results = { @Result(name = INPUT, location = "/WEB-INF/views/user/form.jsp") })
    public String addUserForm() {
        userModel = new UserModel();
        return INPUT;
    }

    /**
     * 编辑用户
     * 
     * @return
     */
    @Action(value = "edit", results = { @Result(name = INPUT, location = "/WEB-INF/views/user/form.jsp") })
    public String editUserForm() {
        // 根据userId，查询用户信息
        userModel = userService.getUser(this.userId);
        return INPUT;
    }

    /**
     * 保存用户
     * 保存成功后，重定向到 list.action 地址
     * @return
     */
    @Action(value = "save", interceptorRefs = @InterceptorRef("token"), results = { @Result(name = INPUT, location = "/WEB-INF/views/user/form.jsp"), @Result(name = SUCCESS, type = "redirectAction", params = { "actionName", "list.action" }), @Result(name = "invalid.token", location = "/WEB-INF/views/user/form.jsp") })
    public String saveUser() {
        try {
            // 执行保存用户
            userService.saveUser(userModel);
        } catch (Exception e) {
            // 异常处理
            logger.error(e.getMessage(), e);
            return INPUT;
        }
        return SUCCESS;
    }

    /**
     * 删除用户
     * 
     * @return
     */
    @Action(value = "delete", results = { @Result(name = SUCCESS, type = "redirectAction", params = { "actionName", "list.action" }) })
    public String deleteUser() {
        try {
            // 根据userId，删除用户
            userService.deleteUser(this.userId);
        } catch (Exception e) {
            // 异常处理
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
        return SUCCESS;
    }

    /**
     * 编辑用户
     * 
     * @return
     */
    @Action(value = "analyze", results = { @Result(name = SUCCESS, location = "/WEB-INF/views/user/analyze.jsp") })
    public String analyzeUser() {
        // 根据userId，查询用户信息
        userGenderData = userService.getUserGenderData();
        userCreateData = userService.getUserCreateData();
        return SUCCESS;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public Page<UserModel> getUserPage() {
        return userPage;
    }

    public void setUserPage(Page<UserModel> userPage) {
        this.userPage = userPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ChartData getUserGenderData() {
        return userGenderData;
    }

    public void setUserGenderData(ChartData userGenderData) {
        this.userGenderData = userGenderData;
    }

    public ChartData getUserCreateData() {
        return userCreateData;
    }

    public void setUserCreateData(ChartData userCreateData) {
        this.userCreateData = userCreateData;
    }

}
