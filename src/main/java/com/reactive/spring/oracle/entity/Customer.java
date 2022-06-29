package com.reactive.spring.oracle.entity;

import com.reactive.spring.oracle.validation.CustomerAddressConstraint;
import com.reactive.spring.oracle.validation.CustomerCountryConstraint;
import com.reactive.spring.oracle.validation.CustomerNameConstraint;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("customers")
public class Customer {
  @Id
  @Column("cust_id")
  private Integer custId;

  @Column("name")
  @CustomerNameConstraint
  private String name;

  @Column("address")
  @CustomerAddressConstraint
  private String address;

  @Column("country")
  @CustomerCountryConstraint
  private String country;
}
