package ir.shayandaneshvar.business.reservation.client;

import ir.shayandaneshvar.business.reservation.domain.Room;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

//writing this for hystrix and circuit breaker pattern
@Component
public class RoomServiceFallbackImpl implements RoomService {
    @Override
    public List<Room> findAll(String roomNumber) {
        return Collections.emptyList();
    }
// this is what executes when the circuit breaker breaks the circuit - commented  because didn't have the time to implement the same thing on the other service
//    @Override
//    public Room findOne(Long id) {
//        return new Room().setName("Room").setBedInfo("BED").setRoomNumber("00");
//    }
}
