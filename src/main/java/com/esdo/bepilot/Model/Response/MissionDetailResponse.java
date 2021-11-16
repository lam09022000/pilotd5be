package com.esdo.bepilot.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MissionDetailResponse {
    private Long id ;

    private Long missionId;

    private Long userId ;

    private String status ;
}
