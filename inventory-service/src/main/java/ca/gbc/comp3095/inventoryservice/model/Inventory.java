// Create the model file first when setting up a new microservice
package ca.gbc.comp3095.inventoryservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //jakarta.persistence
@Table(name="t_inventory") //jakarta.persistence
@Getter // Lombok
@Setter // Lombok
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // Want database to autogenerate the primary key
    private Long id;

    private String skuCode; // Do I have this product?
    private Integer quantity; // and do I have the volume that is requested?


}
