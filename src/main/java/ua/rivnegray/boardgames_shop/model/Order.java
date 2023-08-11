package ua.rivnegray.boardgames_shop.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Tolerate;
import org.springframework.web.server.NotAcceptableStatusException;
import ua.rivnegray.boardgames_shop.exceptions.conflictExceptions.StatusAlreadySetException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents an order in the system.
 * <p>
 * This class doesn't extend BaseEntity because it has an OrderStatusHistory, which keeps track of every status change,
 * instead of just having date created and date updated.
 * </p>
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_order")
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private UserProfile userProfile;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<ProductInOrder> orderItems = new HashSet<>();

    @Setter(AccessLevel.NONE)
    @Enumerated(EnumType.STRING)
    private OrderStatus currentStatus;

    private BigDecimal totalPrice;

    @ManyToOne
    private Address address;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Setter(AccessLevel.NONE)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private final Set<OrderStatusDate> orderStatusHistory = new HashSet<>();

    @Builder
    public Order(UserProfile userProfile, Set<ProductInOrder> orderItems, OrderStatus currentStatus,
                 BigDecimal totalPrice, Address address, PaymentStatus paymentStatus) {
        this.userProfile = userProfile;
        this.orderItems = orderItems;
        setCurrentStatus(currentStatus);
        this.totalPrice = totalPrice;
        this.address = address;
        this.paymentStatus = paymentStatus;
    }

    public void setCurrentStatus(OrderStatus newStatus) {
        if(newStatus == this.currentStatus){
            throw new StatusAlreadySetException(newStatus);
        }
        this.currentStatus = newStatus;
        this.orderStatusHistory.add(new OrderStatusDate(newStatus, LocalDateTime.now()));
    }
}
