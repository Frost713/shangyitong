package com.mxchen.shangyitong.gateway.hosp;

import com.mxchen.shangyitong.model.hosp.Department;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:53
 **/
public interface DepartmentGateway {
    /***
    * @Description: 获取科室信息
    * @Param: [hoscode, depcode]
    * @return: com.mxchen.shangyitong.model.hosp.Department
    * @Author: hmxchen
    * @Date: 2021/7/9 18:55
    */ 
    Department getByHD(String hoscode,String depcode);
    /***
    * @Description: 保存科室信息
    * @Param: [convert]
    * @return: void
    * @Author: hmxchen
    * @Date: 2021/7/9 9:57
    */
    void saveInfo(Department department);
    /***
    * @Description: 删除科室
    * @Param: [hoscode, depcode]
    * @return: void
    * @Author: hmxchen
    * @Date: 2021/7/9 10:14
    */ 
    void deleteByHD(String hoscode, String depcode);
}
