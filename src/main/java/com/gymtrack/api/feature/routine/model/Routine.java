package com.gymtrack.api.feature.routine.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "public_id", length = 100, unique = true)
    private String publicId;

    @Column(name = "creator_id", nullable = false)
    private Integer creatorId;

    @Column(name = "image_id")
    private Integer imageId;

    private String name;
    private String description;

    private Double rating;

    @Column(insertable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "num_times_copied", nullable = false)
    private Integer numTimesCopied;

    @Column(name = "base_routine_id")
    private Integer baseRoutineId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Routine routine = (Routine) o;
        return id != null && Objects.equals(id, routine.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
