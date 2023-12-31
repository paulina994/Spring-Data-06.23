package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java .util.Set;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    public Product() {
        this.sales = new HashSet<>();
    }

    private String name;
    private Integer quantity;
    private BigDecimal price;
    private Set<Sale> sales;

    @Column(name = "name", unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST,CascadeType.REMOVE} )
    public Set<Sale> getSales() {
        return sales;
    }

    public void setSales(Set<Sale> sales) {
        this.sales = sales;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
