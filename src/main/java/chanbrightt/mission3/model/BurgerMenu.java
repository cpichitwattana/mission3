package chanbrightt.mission3.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@NoArgsConstructor
@Table(name="burgermenu")
public class BurgerMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="menu_id")
    private Integer menu_id;
    @Column(name="menu_name")
    private String menu_name;
    @Column(name="price")
    private Double price;
}
