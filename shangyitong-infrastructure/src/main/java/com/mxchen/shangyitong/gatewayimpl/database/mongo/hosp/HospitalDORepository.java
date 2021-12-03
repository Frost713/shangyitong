package com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-28 11:26
 **/
@Repository
public interface HospitalDORepository extends MongoRepository<HospitalDO,String> {

    HospitalDO getHospitalByHoscode(String hoscode);
}
