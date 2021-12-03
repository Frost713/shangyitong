package com.mxchen.shangyitong.gatewayimpl.database.mysql.cmn;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mxchen.shangyitong.model.cmn.Dict;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapper extends BaseMapper<DictDO> {

    List<Dict> findChildData(@Param("parentId") Long parentId);
}
