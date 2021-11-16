package com.esdo.bepilot.Service;

import com.esdo.bepilot.Model.Entity.Mission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MissionService {

    Mission create(Mission mission);

    List<Mission> getAllMission();

    Mission getMissionById(Long id);

    String deleteMissionById(Long id) ;

    Mission updateMissionById(Mission newMission) ;
}