package ir.shayandaneshvar.business.reservation.client;

import ir.shayandaneshvar.business.reservation.domain.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// value => same as in eureka server
//fallback => for hystrix to implement the circuit breaker pattern
@FeignClient(value = "ROOMSERVICES",fallback = RoomServiceFallbackImpl.class)
public interface RoomService {

    @GetMapping(value = "/rooms")
    List<Room> findAll(@RequestParam(name = "RoomNumber", required = false) String roomNumber);
}
