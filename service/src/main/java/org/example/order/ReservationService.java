package org.example.order;

import java.time.LocalDateTime;

public class ReservationService {

    // ask
    public void confirm(Reservation reservation) {
//        if (reservation.getStatus() == ReservationStatus.PENDING) {
//            reservation.setStatus(ReservationStatus.CONFIRMED);
//            reservation.setConfirmedAt(LocalDateTime.now());
//        }

        // tell
        reservation.confirm();
    }
}
