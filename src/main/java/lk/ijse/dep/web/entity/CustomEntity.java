package lk.ijse.dep.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class CustomEntity implements SuperEntity{

    private String customerId;
    private String customerName;
    private String orderId;
    private Date orderDate;
    private BigDecimal orderTotal;


}
