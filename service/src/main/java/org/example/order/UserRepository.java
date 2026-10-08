package org.example.order;

import javax.sql.DataSource;

public class UserRepository {

    private final DataSource dataSource;

    UserRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // gdy przyjdzie potrzeba wielu baz / drugiej bazy - wtedy refaktor naszego
}
