package com.cgo.mobile.controller.vehicle;


import com.alibaba.dubbo.config.annotation.Reference;
import com.cgo.api.controller.web_module.vehicle.IVehicleController;
import com.cgo.api.service.web_module.vehicle.IVehicleService;
import com.cgo.common.exception.CustomException;
import com.cgo.common.response.CommonCode;
import com.cgo.common.response.ResponseResult;
import com.cgo.common.utlis.ResponseUtil;
import com.cgo.entity.web_module.vehicle.request.VehiclePositioning;
import com.cgo.entity.web_module.vehicle.request.VehicleTrack;
import com.cgo.entity.web_module.vehicle.response.VehicleCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController implements IVehicleController {
    @Reference
    IVehicleService iVehicleService;

    @RequestMapping("/getVehicleList")
    public ResponseResult getVehicleList(@RequestBody Map<String, String> param) {
        String userId = param.get("userId");
        String userType = param.get("userType");

        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(userType)) {
            throw new CustomException(CommonCode.INVALID_PARAM);
        }

        List list = iVehicleService.getVehicleList(userId, userType);
        return new ResponseResult(ResponseUtil.put("orgList", list), CommonCode.SUCCESS);
    }

    @RequestMapping("/GetMoreVehicleLocation")
    public ResponseResult getVehiclePositioningList(@RequestBody VehiclePositioning param) {
        String vehicleIds = param.getVehicleIds();

        if (StringUtils.isBlank(vehicleIds))
            throw new CustomException(VehicleCode.INVALID_PARAM);

        String[] vehicleIdList = vehicleIds.split(",");

        List list = iVehicleService.getVehiclePositioningList(vehicleIdList);
        if (list == null) {
            return new ResponseResult(null,VehicleCode.FAILURE) ;
        }
        Map data = ResponseUtil.put("vehicles", list);
        data.put("total",list.size());
        return new ResponseResult(data,CommonCode.SUCCESS) ;
    }

    @RequestMapping("/getVehicleTrack")
    public ResponseResult getTrack(@RequestBody VehicleTrack vehicleTrack){
        List list=iVehicleService.getTrack(vehicleTrack);
        Map result = ResponseUtil.put("track", list);
        result.put("vehicleId",vehicleTrack.getVehicleId());
        result.put("total",result.size());
        return new ResponseResult(result,CommonCode.SUCCESS);
    }
}
