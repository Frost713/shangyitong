package com.mxchen.shangyitong;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.api.cmn.DictServiceI;
import com.mxchen.shangyitong.dto.GetByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.cmn.DictCO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: shangyitong
 * @description: 数据字典
 * @author: hmxchen
 * @create: 2021-06-24 10:59
 **/
@Api("数据字典接口")
@RestController
@RequestMapping("/admin/cmn/dict")
public class DictController {
    @Resource
    private DictServiceI dictServiceI;
    //根据数据id查询子数据列表
    @ApiOperation(value = "根据数据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public MultiResponse<DictCO> findChildData(@PathVariable Long id) {
        return dictServiceI.findChildData(new GetByLongIdQry(id));
    }
    @ApiOperation(value="导出")
    @GetMapping(value = "/exportData")
    public Response exportData(HttpServletResponse response) {
       return dictServiceI.exportData(response);
    }
    @ApiOperation(value="导入字典数据")
    @PostMapping("importData")
    public Response importData(@RequestParam MultipartFile file) throws IOException {
        return dictServiceI.importData(file.getInputStream());
    }
}
