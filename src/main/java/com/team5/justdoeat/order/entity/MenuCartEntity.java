package com.team5.justdoeat.order.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "menu_cart")
@Builder
public class MenuCartEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="mc_seq")       private Long mcSeq;
  @Column(name="mc_oi_seq")       private Long mcOiSeq;
  @Column(name="mc_mi_seq")       private Long mcMiSeq;
  @Column(name="mc_menu_cnt")       private Integer mcMenuCnt;
  @ManyToMany(mappedBy = "mocMcSeq") List<MenuOptionCartEntity> optionList = new ArrayList<>();
}