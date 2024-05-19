package com.placement.Placement.model.entity;

import com.placement.Placement.constant.DbPath;
import com.placement.Placement.constant.EQuota;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Getter
@Setter
@Entity
@Table(name = DbPath.QUOTA_BATCH)
public class QuotaBatch {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "available", nullable = false)
    private Integer available;

    @ManyToOne
    @JoinColumn(name = "quota_id")
    private Quota quota;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
}
