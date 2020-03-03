package ir.shayandaneshvar.business.reservation.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Room {
    private Long id;
    private String name;
    private String roomNumber;
    private String bedInfo;

}
