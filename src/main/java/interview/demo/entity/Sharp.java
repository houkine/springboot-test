package interview.demo.entity;
 
import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Sharp")
// @Data
// @Getter
// @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sharp{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    public void setId(long id) {this.id=id;}
    public long getId() {return this.id;}

    @Column(name = "name")
    // @Getter @Setter
    private String name;
    public void setName(String name) {this.name=name;}
    public String getName() {return this.name;}

    @Column(name = "sideA")
    protected Integer sideA;
    public void setSideA(Integer sideA) {this.sideA=sideA;}
    public Integer getSideA() {return this.sideA;}

    @Column(name = "sideB")
    protected Integer sideB;
    public void setSideB(Integer sideB) {this.sideB=sideB;}
    public Integer getSideB() {return this.sideB;}
    
    @Column(name = "radius")
    protected Integer radius;
    public void setRadius(Integer radius) {this.radius=radius;}
    public Integer getRadius() {return this.radius;}

    @Column(name = "unit")
    protected String unit;
    public void setUnit(String unit) {this.unit=unit;}
    public String getUnit() {return this.unit;}

}