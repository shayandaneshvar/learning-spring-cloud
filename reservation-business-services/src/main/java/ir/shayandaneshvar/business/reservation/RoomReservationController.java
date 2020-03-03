package ir.shayandaneshvar.business.reservation;

import ir.shayandaneshvar.business.reservation.client.RoomService;
import ir.shayandaneshvar.business.reservation.domain.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomReservationController {
    // comments => stopped using restTemplate and started using awesome feign

    //    private final RestTemplate restTemplate;
    private final RoomService service;

    @GetMapping(value = "/rooms")
    public List<Room> getAllRooms() {
//        ResponseEntity<List<Room>> entity = restTemplate.exchange(
//                // value => same as in eureka server
//                "http:/ROOMSERVICES/rooms"
//                , HttpMethod.GET, null
//                , new ParameterizedTypeReference<List<Room>>() {
//                }
//        );
//        return entity.getBody();
        return service.findAll(null);
    }
}
