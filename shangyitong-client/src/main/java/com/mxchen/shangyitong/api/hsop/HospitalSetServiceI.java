package com.mxchen.shangyitong.api.hsop;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.dto.BatchDeleteByLongCmd;
import com.mxchen.shangyitong.dto.DeleteByLongIdCmd;
import com.mxchen.shangyitong.dto.SingleByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.SignInfoCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.*;

public interface HospitalSetServiceI{
    /**
    * @Description: 获取医院设置列表
    * @Param: []
    * @return: com.alibaba.cola.dto.MultiResponse<com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetCO>
    * @Author: hmxchen
    * @Date: 2021/6/18 14:37
    */ 
    MultiResponse<HospitalSetCO> list();
    /**
    * @Description: 逻辑删除医院设置
    * @Param: [deleteByLongIdCmd]
    * @return: com.alibaba.cola.dto.Response
    * @Author: hmxchen
    * @Date: 2021/6/18 14:38
    */ 
    Response removeHospSet(DeleteByLongIdCmd deleteByLongIdCmd);
    /**
    * @Description: 带条件分页查询
    * @Param: [hospitalSetQry]
    * @return: com.alibaba.cola.dto.PageResponse<com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetCO>
    * @Author: hmxchen
    * @Date: 2021/6/18 15:00
    */ 
    PageResponse<HospitalSetCO> findPageHospSet(HospitalSetQry hospitalSetQry);
    /**
    * @Description: 添加医院设置
    * @Param: [hospitalSetAddCmd]
    * @return: com.alibaba.cola.dto.Response
    * @Author: hmxchen
    * @Date: 2021/6/19 10:34
    */ 
    Response addHospSet(HospitalSetAddCmd hospitalSetAddCmd);
    /**
    * @Description: 根据id获取医院设置信息
    * @Param: [singleByLongIdCmd]
    * @return: com.alibaba.cola.dto.SingleResponse<com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetCO>
    * @Author: hmxchen
    * @Date: 2021/6/19 11:16
    */
    SingleResponse<HospitalSetCO> getSingle(SingleByLongIdQry singleByLongIdCmd);
    /**
    * @Description: 更新医院设置信息
    * @Param: [cmd]
    * @return: com.alibaba.cola.dto.Response
    * @Author: hmxchen
    * @Date: 2021/6/19 11:21
    */
    Response updateHospitalSet(HospitalSetUpdateCmd cmd);
    /**
    * @Description: 批量删除医院设置
    * @Param: [cmd]
    * @return: com.alibaba.cola.dto.Response
    * @Author: hmxchen
    * @Date: 2021/6/19 11:21
    */
    Response batchRemoveHospitalSet(BatchDeleteByLongCmd cmd);
    /**
    * @Description: 设置医院状态
    * @Param: [hospitalSetSUCmd]
    * @return: com.alibaba.cola.dto.Response
    * @Author: hmxchen
    * @Date: 2021/6/22 10:43
    */ 
    Response lockHospitalSet(HospitalSetSUCmd hospitalSetSUCmd);
    /**
    * @Description: 发送秘钥
    * @Param: [singleByLongIdQry]
    * @return: com.alibaba.cola.dto.Response
    * @Author: hmxchen
    * @Date: 2021/6/22 11:00
    */
    Response sendKey(SingleByLongIdQry singleByLongIdQry);
    /***
    * @Description: 根据医院编号获取秘钥
    * @Param: [hoscode]
    * @return: com.alibaba.cola.dto.SingleResponse<com.mxchen.shangyitong.dto.clientObj.SignInfoCO>
    * @Author: hmxchen
    * @Date: 2021/7/3 18:49
    */
    SingleResponse<SignInfoCO> getSignInfoVo(HospitalSetSignQry qry);
}
