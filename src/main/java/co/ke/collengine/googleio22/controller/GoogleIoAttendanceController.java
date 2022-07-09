package co.ke.collengine.googleio22.controller;


import co.ke.collengine.googleio22.entity.GoogleIoAttendee;
import co.ke.collengine.googleio22.model.AddAttendeeRequest;
import co.ke.collengine.googleio22.model.AddAttendeeResponse;
import co.ke.collengine.googleio22.service.GoogleIoAttendanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/google_io_22")
public class GoogleIoAttendanceController {
    Logger LOGGER = LoggerFactory.getLogger(GoogleIoAttendanceController.class);
    @Autowired
    private GoogleIoAttendanceService googleIoAttendanceService;

    @PostMapping(value = "/add_attendee", produces = MediaType.APPLICATION_JSON_VALUE)
    public AddAttendeeResponse addAttendee(@RequestBody AddAttendeeRequest addAttendeeRequest) {
        return googleIoAttendanceService.addAttendee(addAttendeeRequest);
    }
    @GetMapping(value = "/get_all_attendees", produces = MediaType.APPLICATION_JSON_VALUE)
    List<GoogleIoAttendee> getAllBlogs(){
        return googleIoAttendanceService.getAllAttendees();
    }

}
