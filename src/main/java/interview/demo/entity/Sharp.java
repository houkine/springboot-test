package interview.demo.entity;
 
import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Sharp")
// @Data
@NoArgsConstructor
@AllArgsConstructor
public class Sharp{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    // @JsonProperty(value = "sideA")
    private String name;
    public String getName(){
        return name;
    }

    @Column(name = "sideA")
    // @JsonProperty(value = "sideA")
    private int sideA;

    @Column(name = "sideB")
    // @JsonProperty(value = "sideB")
    private int sideB;
    
    @Column(name = "radius")
    // @JsonProperty(value = "radius")
    private int radius;

    @Column(name = "unit")
    // @JsonProperty(value = "unit")
    private String unit;
}