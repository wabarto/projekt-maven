package org.example.order;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Reservation {

    private final String id;
    private ReservationStatus status = ReservationStatus.PENDING;
    private LocalDateTime confirmedAt;

    public Reservation(String id) {
        this.id = id;
    }

    public void confirm() {
        if (status == ReservationStatus.PENDING) {
            this.status = ReservationStatus.CONFIRMED;
            this.confirmedAt = LocalDateTime.now();
        }
    }

}
