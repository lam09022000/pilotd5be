package com.esdo.bepilot.Service.Mapper;

import com.esdo.bepilot.Model.Entity.Mission;
import com.esdo.bepilot.Model.Response.MissionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MissionMapper {

    @Autowired
    MissionDetailMapper missionDetailMapper ;
    public MissionResponse mapToMissionEntity(Mission mission){
        MissionResponse missionResponse = new MissionResponse() ;
        missionResponse.setId(mission.getId());
        missionResponse.setMissionKey(mission.getMissionKey());
        missionResponse.setName(mission.getName());
        missionResponse.setCommunication(mission.getCommunication());
        missionResponse.setMissionType(mission.getMissionType());
        missionResponse.setQuantity(mission.getQuantity());
        missionResponse.setQuantityMade(mission.getQuantityMade());
        missionResponse.setKeyWord(mission.getKeyWord());
        missionResponse.setLink(mission.getLink());
        missionResponse.setPriceUnit(mission.getPriceUnit());
        missionResponse.setMoneyReceived(mission.getMoneyReceived());
        missionResponse.setCreateAt(mission.getCreateAt());
        missionResponse.setUpdateAt(mission.getUpdateAt());
        missionResponse.setDeadTime(missionResponse.getDeadTime());
        missionResponse.setCustomerId(mission.getCustomer().getId());
        missionResponse.setMissionDetails(missionDetailMapper.mapToListMissionDetailEntity(mission.getMissionDetails()));
        return missionResponse ;
    }

    public List<MissionResponse> mapToListMissionEntity(List<Mission> missions){
        List<MissionResponse> responses = new ArrayList<>() ;
        missions.forEach(mission -> {
            responses.add(this.mapToMissionEntity(mission)) ;
        });
        return responses ;
    }



}
