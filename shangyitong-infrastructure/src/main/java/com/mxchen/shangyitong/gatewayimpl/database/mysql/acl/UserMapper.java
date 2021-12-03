package com.mxchen.shangyitong.gatewayimpl.database.mysql.acl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.acl.UserDO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserDO> {
}
