package fikretcansel.hrms.entities.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementFilter {

    private List<Integer> cityId;
    private List<Integer> jobPositionId;
}