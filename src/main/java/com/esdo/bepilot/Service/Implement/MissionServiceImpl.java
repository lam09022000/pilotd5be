package com.esdo.bepilot.Service.Implement;

import com.esdo.bepilot.Model.Entity.Mission;
import com.esdo.bepilot.Repository.MissionRepository;
import com.esdo.bepilot.Service.MissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MissionServiceImpl implements MissionService {

    @Autowired
    public MissionRepository missionRepository ;

    public Mission create(Mission mission){
        log.info("Inside create of Mission Service ");
//        missionRepository.save(mission) ;
        return null ;
    }

    public List<Mission> getAllMission(){
        log.info("Inside getAllMission of Mission Service ");
//        missionRepository.findAll() ;
        return null ;
    }

    public Mission getMissionById(Long id) {
        log.info("Inside getMissionById of Mission Service ");
//        missionRepository.getById(id) ;
        return null ;
    }

    public String deleteMissionById(Long id) {
        log.info("Inside deleteMissionById of Mission Service ");
//        missionRepository.deleteById(id);
        return "" ;
    }

    public Mission updateMissionById(Mission newMission) {
        log.info("Inside updateMissionById of Mission Service ");
//        missionRepository.save(newMission);
        return null ;
    }
}