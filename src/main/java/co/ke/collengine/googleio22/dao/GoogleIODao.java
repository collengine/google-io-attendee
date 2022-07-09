package co.ke.collengine.googleio22.dao;

import co.ke.collengine.googleio22.entity.GoogleIoAttendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleIODao extends JpaRepository<GoogleIoAttendee, Long> {
}
