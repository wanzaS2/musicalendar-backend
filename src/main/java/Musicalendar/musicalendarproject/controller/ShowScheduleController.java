package Musicalendar.musicalendarproject.controller;

import Musicalendar.musicalendarproject.domain.ShowSchedule;
import Musicalendar.musicalendarproject.repository.ShowScheduleRepository;
import Musicalendar.musicalendarproject.service.ShowScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShowScheduleController {

    private final ShowScheduleService showScheduleService;
    private final ShowScheduleRepository showScheduleRepository;

    @GetMapping("/calendar")
    public String getAllSchedules(){
        showScheduleRepository.findAll();
        return "성공";
    }

    @GetMapping("/calendar/list")
    public List<ShowSchedule> getAllSchedules2(){
        return showScheduleRepository.findAll();
    }


}
