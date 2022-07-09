package co.ke.collengine.googleio22.service;

import co.ke.collengine.googleio22.entity.GoogleIoAttendee;
import co.ke.collengine.googleio22.model.AddAttendeeRequest;
import co.ke.collengine.googleio22.model.AddAttendeeResponse;

import java.util.List;

public interface GoogleIoAttendanceService {
    AddAttendeeResponse addAttendee(AddAttendeeRequest addAttendeeRequest);
    List<GoogleIoAttendee> getAllAttendees();
}
