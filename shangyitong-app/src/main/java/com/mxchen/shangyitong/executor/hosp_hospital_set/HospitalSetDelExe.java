package com.mxchen.shangyitong.executor.hosp_hospital_set;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.BatchDeleteByLongCmd;
import com.mxchen.shangyitong.dto.DeleteByLongIdCmd;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetBaseServiceI;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
/**
 * @program: shangyitong
 * @description: 医院设置删除执行类
 * @author: hmxchen
 * @create: 2021-06-18 14:40
 **/
@Component
public class HospitalSetDelExe {
    @Resource
    private HospitalSetBaseServiceI hospitalSetBaseServiceI;
    public Response execute(DeleteByLongIdCmd cmd) {
        hospitalSetBaseServiceI.removeById(cmd.getId());
        return Response.buildSuccess();
    }

    public Response execute(BatchDeleteByLongCmd cmd) {
        hospitalSetBaseServiceI.removeByIds(cmd.getIdList());
        return Response.buildSuccess();
    }
}
