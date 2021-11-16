package com.esdo.bepilot.Service.Mapper;


import com.esdo.bepilot.Model.Entity.MissionDetail;
import com.esdo.bepilot.Model.Response.MissionDetailResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MissionDetailMapper {

    public MissionDetailResponse mapToMissionDetailEntity(MissionDetail missionDetail){
        MissionDetailResponse missionDetailResponse = new MissionDetailResponse() ;
        missionDetailResponse.setId(missionDetail.getId());
        missionDetailResponse.setMissionId(missionDetail.getMission().getId());
        missionDetailResponse.setUserId(missionDetail.getUser().getId());
        missionDetailResponse.setStatus(missionDetail.getStatus()) ;
        return missionDetailResponse ;
    }

    public List<MissionDetailResponse> mapToListMissionDetailEntity(List<MissionDetail> missionDetails){
        if(missionDetails == null) {
            return null ;
        }
        List<MissionDetailResponse> responses = new ArrayList<>() ;
        missionDetails.forEach(missionDetail -> {
            responses.add(this.mapToMissionDetailEntity(missionDetail)) ;
        });
        return responses ;
    }

}
