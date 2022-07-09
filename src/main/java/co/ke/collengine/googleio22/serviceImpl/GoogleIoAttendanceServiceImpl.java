package co.ke.collengine.googleio22.serviceImpl;

import co.ke.collengine.googleio22.dao.GoogleIODao;
import co.ke.collengine.googleio22.entity.GoogleIoAttendee;
import co.ke.collengine.googleio22.model.AddAttendeeRequest;
import co.ke.collengine.googleio22.model.AddAttendeeResponse;
import co.ke.collengine.googleio22.service.GoogleIoAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleIoAttendanceServiceImpl implements GoogleIoAttendanceService {

    @Autowired private GoogleIODao googleIODao;
    @Override
    public AddAttendeeResponse addAttendee(AddAttendeeRequest addAttendeeRequest) {
        GoogleIoAttendee googleIoAttendee = new GoogleIoAttendee();
        googleIoAttendee.setFirstName(addAttendeeRequest.getFirstName());
        googleIoAttendee.setLastName(addAttendeeRequest.getLastName());
        googleIoAttendee.setUniversity(addAttendeeRequest.getUniversity());
        googleIoAttendee.setChapter(addAttendeeRequest.getChapter());
        GoogleIoAttendee attendee = googleIODao.save(googleIoAttendee);
        if(attendee != null){
            return new AddAttendeeResponse("Attendee successfully added " , 201);
        }else{
            return new AddAttendeeResponse("Failed. Error adding attendee" , 400);
        }
    }

    @Override
    public List<GoogleIoAttendee> getAllAttendees() {
        return googleIODao.findAll();
    }
}
