package org.example.order;

import javax.sql.DataSource;
import java.util.Map;

public interface DataSourceFactory {
    DataSource create(String type, Map<String, Object> config);
}
